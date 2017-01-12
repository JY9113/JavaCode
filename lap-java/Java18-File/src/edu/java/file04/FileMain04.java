package edu.java.file04;

import java.io.*;

public class FileMain04 {

	public static void main(String[] args) {
		// 1바이트씩 파일 복사 하는데 소요되는 시간 측정
		InputStream in = null;
		OutputStream out = null;
		
		
		try {
			in = new FileInputStream("temp/big_text.txt");
			out = new FileOutputStream("temp/big2.txt");
			int data = 0;	// 파일에서 read()한 데이터를 저장
			int byteCopied = 0;	// 복사된 데이터 크기
			long startTime = System.currentTimeMillis();	// 시스템의 현재 시간을 milli-second 단위로 리턴
			
			while(true) {
				byte[] buffer = new byte[1024];	// 버퍼 크기를 키우면 경과 시간이 줄어든다. 한계는 존재!
				
				int result = in.read(buffer); // 1024 바이트 읽음
				System.out.println("result = " + result);
				// read(byte[] b);
				// 파일에서 읽은 데이터를 매개변수 배열 b에 저장
				// 실제로 읽은 바이트 수를 리턴, 파일의 끝에서는 -1을 리턴
				
//				data = in.read(); 	-> byte 타입의 매개변수를 가지는 read를 사용하면 더 빠르다!
//				if (data == -1) {	//EOF
				if(result == -1){
					break;	//무한루프 종료
				}
//				out.write(data); 	// 1바이트 씀
				out.write(buffer, 0, result);	// 1024만큼 쓰는게 아니라 읽은 데이터 만큼 쓴다.
				// write(byte[] b);
				// 배열 b의 내용을 한번에 파일에 씀
				// write(byte[] b, int off, int len);
				// 배열 b의 인덱스 off 번째 부터 len 길이만큼까지만 파일에 씀
				
//				byteCopied++;
				byteCopied += result;
				
			}
			long endTime = System.currentTimeMillis();
			System.out.println("복사 경과시간 : " + (endTime - startTime));
			System.out.println("복사된 바이트 : " + byteCopied);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
