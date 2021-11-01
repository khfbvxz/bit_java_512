package net.bit.day05;

public class Test03 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, hap = 0;
		double avg = 0.0;
		String name = "까사노";
		String mesege = "";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// 문제 1 평균 점수 100~70 점 축합격  0~69점 재시험 
		if (avg<=100 && avg>=70) {
			mesege="축 합 격";
		}
		else {
			mesege=" 재시험 ";
		}
		System.out.println(" ========== test03.java=========");
		System.out.print("이름 = " + name + "\n");
		System.out.print("국어 = " + kor + "\n");
		System.out.print("영어 = " + eng + "\n");
		System.out.print("총점 = " + hap + "\n");
		System.out.print("평균 = " + avg + "\n");
		System.out.print("결과 = " + mesege +"\n");
		
	}
}// class END
