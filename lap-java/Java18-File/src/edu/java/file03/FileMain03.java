package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 1. 일반적인 try-catch-finally 구문
//	try {
//		,,,,,(실행문);
//	} catch (Exception e) {
//		.....(예외처리);
//	} finally {
//		.....(항상 실행할 코드들);  => 리소스 해제
//	}
// 2. try-with-resource 구문 : Java 7 버전부터 제공
//	try() 안에서 생성된 리소스들의 해제 코드(close();)는 자동으로 
//	try (리소스 생성;) {
//		실행문;
//	} catch (Exception e) {
//		예외처리;
//	}

public class FileMain03 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("temp/original.txt");
				OutputStream out = new FileOutputStream("temp/copy2.txt");) {
			int data = 0;
			int byteCopied = 0;
			
			while(true) {
				data = in.read();
				if (data == -1) {  // EOF
					break;
				}
				out.write(data);
				byteCopied++;
			}
			
			System.out.println(byteCopied + "바이트 복사됨!");
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
