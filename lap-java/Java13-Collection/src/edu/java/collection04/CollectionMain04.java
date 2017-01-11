package edu.java.collection04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionMain04 {
	
	private static Scanner scanner = new Scanner(System.in);
	private static String inputName;
	private static int inputKorean, inputEnglish, indexNum;
	
	public static void main(String[] args) {

		// 국어/영어 점수, 이름 입력 받아서 Student 3개를 생성
		// LinkedList에 Student 정보를 저장.
		// 검색(get), 변경(set), 삭제(remove)
		
		
		List<Student> list = new LinkedList<>();
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println( (i+1) + " 번째 학생 정보");
			System.out.println(" 학생의 이름을 입력하세요    ");
			inputName = scanner.nextLine();
			System.out.println(" 학생의 국어 점수를 입력하세요    ");
			inputKorean = Integer.parseInt(scanner.nextLine());
			System.out.println(" 학생의 영어 점수를 입력하세요    ");
			inputEnglish = Integer.parseInt(scanner.nextLine());

			
			
			Score score = new Score(inputKorean, inputEnglish);
			Student student = new Student(inputName, score);
			list.add(student);
		}
		
		System.out.println();
		System.out.println("-------------전체출력------------------");
		for(int i = 0; i < list.size(); i++){
			System.out.println(" 학생 번호 [ " + i + " ]의 정보");
			System.out.println(" 이름 : " + list.get(i).getName());
			System.out.println(" 국어점수 : " + list.get(i).getScore().getKorean());
			System.out.println(" 영어점수 : " + list.get(i).getScore().getEnglish());
			System.out.println();
		}
		
		System.out.println("---------------검색----------------");
		System.out.println("검색할 학생의 번호를 입력하세요");
		indexNum = Integer.parseInt(scanner.nextLine());
//		System.out.println(list.get(indexNum));			=> toString override 했을 경우
		System.out.println();
		System.out.println(" 이름 : " + list.get(indexNum).getName());
		System.out.println(" 국어점수 : " + list.get(indexNum).getScore().getKorean());
		System.out.println(" 영어점수 : " + list.get(indexNum).getScore().getEnglish());
		System.out.println();
		
		System.out.println("---------------변경----------------");
		System.out.println("변경할 학생의 번호를 입력하세요");
		indexNum = Integer.parseInt(scanner.nextLine());
		System.out.println("변경할 국어 점수를 입력하세요");
//		inputKorean = scanner.nextInt();
//		scanner.nextLine();
		inputKorean = Integer.parseInt(scanner.nextLine());
		System.out.println("변경할 영어 점수를 입력하세요");
		inputEnglish = Integer.parseInt(scanner.nextLine());
		
		Score score = new Score(inputKorean, inputEnglish);
//		list.get(indexNum).setScore(score);
		list.get(indexNum).getScore().setKorean(inputKorean);
		list.get(indexNum).getScore().setEnglish(inputEnglish);
			
		System.out.println();
		System.out.println("변경 후 학생의 목록입니다.");
		for(Student s : list){

			System.out.println(s);
			System.out.println();
		}	
		
		
		System.out.println("---------------삭제----------------");
		System.out.println("삭제할 학생의 번호를 입력하세요");
		indexNum = Integer.parseInt(scanner.nextLine());
			
		list.remove(indexNum);
		System.out.println();
		System.out.println("삭제 후 학생의 목록입니다.");
		for(Student s : list){
			System.out.println(s);
			System.out.println();
		}	

	}

}
