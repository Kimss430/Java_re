package Test3;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 아래 이미지와 같이 결과가 나오도록 코드를 작성하시오.
//		이름을 입력해주세요 : 홍길동
//		수학 점수 : 91
//		영어 점수 : 86
//		홍길동님의 평균 점수는 88.5점, 등급은 B 입니다.
//		(조건 : 평균점수를 기준으로 90점 이상 'A', 80점 이상 'B', 70점 이상 'C', 그 외 F이며, 
//		점수는 0~100 사이의 숫자를 정상적으로 입력한다고 가정하고 진행)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		double score = (math + eng) / 2.0;
		String grade = "";
		
			if(score >= 90 && score <= 100) {
				grade = "A";
			} else if(score >= 80) {
				grade = "B";
			} else if(score >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}
		
		System.out.println(name + "님의 평균 점수는 " + score + "점, 등급은 " + grade + " 입니다.");
		
	}

}
