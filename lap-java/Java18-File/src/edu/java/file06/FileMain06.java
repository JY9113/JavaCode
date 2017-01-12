package edu.java.file06;

import java.io.*;

public class FileMain06 {

	public static void main(String[] args) {
		// BufferedInputStream의 read(byte[] b)를 사용
		// BufferedOutputStream의 write(byte[] b, int off, int len)를 사용
		// 파일 복사하는데 걸린 시간 측정
		
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;
		BufferedOutputStream bout = null;
		
		try {
			in = new FileInputStream("temp/big_text.txt");
			bin = new BufferedInputStream(in);
			out = new FileOutputStream("temp/big3.txt");
			bout = new BufferedOutputStream(out);
			
			int data = 0;
			int byteCopied = 0;
			
			long startTime = System.currentTimeMillis();
			while(true) {
				byte[] buffer = new byte[1024];
				int result = bin.read(buffer);	// 실제로 읽은 바이트 수, 
				
				if(result == -1) {
					break;					
				}
				
				bout.write(buffer, 0, result);
				byteCopied += result;
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println(" 경과 시간 : " + (endTime - startTime));
			System.out.println(" 복사된 바이트 : " + byteCopied);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bin.close();
				bout.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
