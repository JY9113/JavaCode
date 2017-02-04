package edu.java.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;
import java.sql.*;
import javax.imageio.*;

import javax.swing.*;

import javax.swing.border.*;




public class ImageTest extends javax.swing.JFrame {

    ImgPanel imgPanel;

    

    public ImageTest () {

        setTitle("Oracle JDBC Image Insert, Retrieve example");
        setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 695, 375);

        initComponents();

		JButton openIMG = new JButton("1");
		openIMG.setBounds(30, 50, 60, 60);
		add(openIMG);
		openIMG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jButtonGetDBImgActionPerformed(e);
			}
		});
		
		JButton saveToDB = new JButton("1");
		saveToDB.setBounds(30, 50, 60, 60);
		add(saveToDB);
		saveToDB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jButtonGetDBImgActionPerformed(e);
			}
		});
		

        imgPanel = new ImgPanel();

        imgPanel.setBounds(0, 0,610, 410);

        imgPanel.setBorder(new LineBorder(Color.yellow));

        add(imgPanel);
        

    }
    
    public void initComponents() {
	    try {
		getConnection();
		insertImage();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }

    

    /** 로컬 시스템의 파일을 DB에 저장 */

    private void insertImage() throws Exception

    {

        Connection conn = getConnection();

        PreparedStatement ps=conn.prepareStatement("insert into EMP_IMG values(?,?,?)");  

        ps.setInt(1,100);  

        ps.setString(2, "SMITH");

        String kakao = "kakao.png";
        

        FileInputStream fin=new FileInputStream("C:/Study/lap-java/images/" + kakao);




        ps.setBinaryStream(3, fin, fin.available());  

        int i = ps.executeUpdate();

        fin.close();




        System.out.println(i+" records affected");  

        conn.close();  

    }




    /** 메모리에 저장된 BufferedImage 를 데이터베이스에 저장 */

    private void insertImage(BufferedImage bi) throws Exception

    {

        Connection conn = getConnection();

        PreparedStatement ps=conn.prepareStatement("insert into EMP_IMG values(?,?,?)");  

        ps.setInt(1,100);  

        ps.setString(2, "SMITH");

        

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ImageIO.write(bi, "png", baos);

        baos.flush();

        byte[] bytes = baos.toByteArray();

        

        ps.setBytes(3, bytes);

        int i = ps.executeUpdate();

        baos.close();

        System.out.println(i+" records affected");  

        conn.close();  

    }

    

    /** 데이터베이스로부터 이미지를 가져와서 BufferedImage로 리턴 */

    private BufferedImage getDBImage() throws Exception

    {

        Connection conn = getConnection();

        

        PreparedStatement ps = conn.prepareStatement("select empno, ename, image from emp_img where empno=100");

        ResultSet rs = ps.executeQuery();

        rs.next();

        InputStream in = rs.getBinaryStream(3);

        BufferedImage bi = ImageIO.read(in);

        

        in.close();

        rs.close();

        ps.close();

        conn.close();

        return bi;

    }

    

    /** 데이터베이스에 연결하고 Connection을 리턴 */

    public Connection getConnection()

    {

        Connection conn = null;

        Statement stmt = null;




        String jdbc_driver = "oracle.jdbc.OracleDriver";

        String db_url = "jdbc:oracle:thin:@localhost:1521:XE";




        try{

          Class.forName(jdbc_driver);

          conn = DriverManager.getConnection(db_url,"scott","tiger");

          return conn;

        }

        catch(Exception e) {

            e.printStackTrace();

        }

        return null;

    }




    /** 현재 프로젝트의 클래스와 동일한 패키지에 저장된 이미지 파일명을 ImgPanel에 전달하여 화면에 출력되도록 한다 */

    private void jButtonImgOpenActionPerformed(java.awt.event.ActionEvent evt) {                                               

        imgPanel.setImage("kakao.png");

        

    }                                              




    /** 데이터베이스에 이미지 저장 */

    private void jButtonDBSaveActionPerformed(java.awt.event.ActionEvent evt) {                                              




        try {

            insertImage();

            JOptionPane.showMessageDialog(this, "DB에 이미지 저장 성공");

            imgPanel.bi = null;

            imgPanel.repaint();

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        

    }                                             




    /** 데이터베이스에서 이미지를 가져와서 ImgPanel 에 그린다 */

    private void jButtonGetDBImgActionPerformed(java.awt.event.ActionEvent evt) {                                                

        try {

            BufferedImage bi = getDBImage();

            imgPanel.bi = bi;

            imgPanel.repaint();

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }                                               




    /** ImgPanel 상에 그려진 BufferedImage를 데이터베이스에 저장 */

    private void jButtonBufferedImgInsertActionPerformed(java.awt.event.ActionEvent evt) {                                                         

        BufferedImage bi = imgPanel.bi;

        try {

            insertImage(bi);

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }                                                        

    

    /** 화면에 그려진 그림을 지운다 */

    private void jButtonScreenRemoveActionPerformed(java.awt.event.ActionEvent evt) {                                                    

        imgPanel.bi = null;

        imgPanel.repaint();

    }                                                   




    /** 데이터베이스에 저장된 이미지를 포함한 행을 삭제 */

    private void jButtonDbImgDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        Connection conn = getConnection();

        try{

            PreparedStatement ps = conn.prepareStatement("delete from emp_img");

            int rows = ps.executeUpdate();

            System.out.println("All rows deleted.");

            ps.close();

            conn.close();

        }catch(Exception e){

            e.printStackTrace();

        }

    }   




    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new ImageTest().setVisible(true);

            }

        });

    }
}

