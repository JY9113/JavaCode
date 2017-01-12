package edu.java.file05;

import java.io.*;


// 프로그램 <== FileInputStream <== 파일(HDD)
// FileInputStream의 read() 메소드는 HDD를 직접 접근 -> 속도 느림
// 프로그램 <== BufferedInputStream <== FileInputStream <== 파일(HDD)
// BufferedInputStream의 read() 메소드는 메모리 버퍼에서 읽음 -> 속도 빠름

// 프로그램 ==> FileoutputStream ==> 파일(HDD)
// FileOutputStream의 write() 메소드는 HDD를 직접 접근 -> 속도 느림
// 프로그램 ==> BufferedOutputStream ==> FileOutputStream ==> 파일(HDD)
// BufferedOutputStream의 write() 메소드는 메모리 버퍼에 데이터를 씀 -> 속도 빠름

public class FileMain05 {

	public static void main(String[] args) {
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			// HDD를 접근하는 FileInputStream 객체 생성
			in = new FileInputStream("temp/big_text.txt");
			// 메모리 버퍼를 접근하는 BufferedInputStream 객체 생성
			bin = new BufferedInputStream(in);
			
			// HDD를 직접 접근하는 FileOutputStream 객체 생성
			out = new FileOutputStream("temp/big3.txt");
			//메모리 버퍼를 접근하는 BufferedOutputStream 객체 생성
			bout = new BufferedOutputStream(out);		

			// 1바이트씩 읽고 씀.
			int data = 0; // 읽은 데이터
			int byteCopied = 0; // 복사된 바이트
			long startTime = System.currentTimeMillis(); // 현재 시간
			while (true) {
				// 메모리 버퍼에서 1바이트 읽음
				data = bin.read();
				if (data == -1) {
					break;
				}
				
				// 메모리 버퍼에 1바이트를 씀
				bout.write(data);
				byteCopied++;
				
			} // end while
			long endTime = System.currentTimeMillis();
			System.out.println("경과 시간 ; " + (endTime - startTime));
			System.out.println("복사된 바이트 : " + byteCopied);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 리소스를 해제 할 때는 최종적으로 생성된 리소스만 해제하면
				// 그 리소스가 사용하고 있던 다른 리소스들도 순차적으로 해제가 된다.
				bin.close();
				bout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
