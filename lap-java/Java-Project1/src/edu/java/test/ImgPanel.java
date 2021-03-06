package edu.java.test;

import java.awt.*;

import java.awt.image.*;

import java.io.*;

import javax.imageio.*;

import javax.swing.*;




public class ImgPanel extends JPanel

{

    BufferedImage bi;

    

    ImgPanel(){}

    

    /** 현재 프로젝트안에 저장된 이미지를 읽어서 BufferedImage를 생성한다 */

    public void setImage(String fileName)

    {

        try {

            bi = ImageIO.read(getClass().getResource(fileName));

            repaint();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }




    /** 화면을 다시 그릴 때 자동으로 호출됨. 화면에 BufferedImage의 내용을 그린다 */

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(bi, null, 0, 0);

    }




}