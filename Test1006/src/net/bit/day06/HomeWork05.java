package net.bit.day06;

public class HomeWork05 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, hap = 0;
		double avg = 0.0;
		String msg = "";
		String grade = "";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// 문제 1 평균 점수 100~70 점 축합격  0~69점 재시험 
		if (avg<=100 && avg>=70) {msg="축합격";}
		else {msg="재시험";}
		// 문제 2 평균 100~90 A   0 ~59 F swicth
		switch ((int)avg/10) {
		case 10: case 9 :grade = "A"; break;
		case 8:grade = "B"; break;
		case 7:grade = "C"; break;
		case 6:grade = "D"; break;
		default:grade = "F";
		}
		
		System.out.println("총점 = " + hap );
		System.out.println("평균 = " + avg );
		System.out.println("결과 = " + msg );
		System.out.println("학점 = " + grade);
	}
}// class END
