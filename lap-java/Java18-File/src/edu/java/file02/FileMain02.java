package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 프로그램 <=== InputStream <=== 입력장치
// 프로그램 <=== FileInputStream <=== 파일
// FileInputStream 클래스의 read() 메소드를 사용해서 파일을 읽음

// 프로그램 ===> OutputStream ===> 출력장치
// 프로그램 ===> FileOutputStream ===> 파일
// FileOutputStream 클래스의 write() 메소드를 사용해서 파일에 씀

public class FileMain02 {

	public static void main(String[] args) {
		// temp/original.txt 파일에서 데이터를 읽어서
		// temp/copy.txt 파일에 데이터를 씀
		
		InputStream in = null;
		OutputStream out = null;
		try {
			// 파일에서 데이터를 읽어 올 통로인 FileInputStream 객체 생성
			in = new FileInputStream("temp/original.txt");
			
			// 파일에 데이터를 쓸 통로인 FileOutputStream 객체 생성
			out = new FileOutputStream("temp/copy.txt");
			
			int data = 0; // read() 메소드가 리턴하는 값을 저장할 변수
			int byteCopied = 0; // write() 메소드를 호출할 때 마다 1씩 증가
			while (true) {
				// read(): 파일에서 1바이트씩 데이터를 읽어옴
				// 파일 끝에 도달했을 때 -1을 리턴
				data = in.read();
				if (data == -1) {
					break; // while문 종료
				}
				
				// write(): 1바이트씩 파일 씀
				out.write(data);
				byteCopied++;
				
			} // end while (true)
			
			// 파일 복사가 끝났음.
			System.out.println(byteCopied + "바이트 복사됨");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class FileMain02
















