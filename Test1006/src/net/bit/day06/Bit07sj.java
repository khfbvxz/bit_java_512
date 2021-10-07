package net.bit.day06;

public class Bit07sj {

	public static void main(String[] args) {
		int kor = 50, eng = 85, hap = 0;
		double avg = 0.0;
		String msg = "";
//		String grade = "";
		char grade ;
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// 문제 1 평균 점수 100~70 점 축합격  0~69점 재시험
		// 문제 4 평균 점수 70 점 부터 합격, 과목별 60점부터 합격 논리연산
		// 문제 6 평균 점수로 삼항 연산 처리 100~70 점 합격, 0~69 점 재시험 삼항 연산
//		String pass = (avg >=70)? "pass":"failed";
		if(avg>70) {msg = "축 합격";}
		else {msg = "재시험";}
		
		//문제 6 
		double result = (avg>=70)? 0.7:0.1;
		
		// 문제 2 평균 100~90 A   0 ~59 F swicth
		// 문제 5다중 if 제어문 평균 점수 100~90 점 A 80~ 89 B
		if (avg >=90 ) {grade = 'A';}
		else if (avg >=80 ) {grade = 'B';}
		else if (avg >=70 ) {grade = 'C';}
		else if (avg >=60 ) {grade = 'D';}
		else {grade = 'F';}
		
		
		System.out.println("총점 = " + hap );
		System.out.println("평균 = " + avg );
		System.out.println("학점 = " + grade);
		System.out.println("결과 = " + msg + " 가산점="+(result*avg) );
		System.out.printf("결과 = %s 가산점=%.2f\n", msg ,(result*avg));

	}

}
