package net.bit.dat07;

import java.util.Stack;

public class Test04 {
	public static void main(String[] args) {
		// 첫번째 int 변수 6개 선언 후 값 대입
		int a = 15, b = 54, c = 73, d = 34, e = 48, f = 47;
		String city1 = "제주도";
		String city2 = "선유도";
		String city3 = "사량도";
		String city4 = "여의도";
		String city5 = "영종도";
		String city6 = "마라도";
		/*
		 * 배열의 선언 차입 [] 배열명 = new 타입 [크기] 
		 * 배열 초기 타입 [] 배열명 = {초기값 나열}  
		 * 배열 초기 차입 [] 뱌열명 = new 타입[]{초기값 나열} 
		 *배열은 같은 타입으로 구선 배열의 첨자시작 [0]
		 *qjsWo 배열의 length 
		 *배열 출력 for, foreach (
		 * 배열을제어하는 클래스 java.util.Arrays 상단 임포드
		 * 배열을 크기지정후 선언하면 자동 초기화  자바 교재 13~14 페이지 
		 */
		int[] lotto = new int[6];
		boolean[] camp = new boolean[6];
		double[] avg = new double[6];
		String[] city = new String[6];
		Test01[] tt = new Test01[6]; // class 타입은 참조형이라고 합니다. 참조형은 초기화 null
		System.out.println("배열의 초기화 확인");
//		for(int i = 0 ; i<lotto.length ; i++) {System.out.print(lotto[i] + " ");}
//		for(int i = 0 ; i<camp.length ; i++) {System.out.print(camp[i] + " ");}
//		for(int i = 0 ; i<avg.length ; i++) {System.out.print(avg[i] + " ");}
//		for(int i = 0 ; i<city.length ; i++) {System.out.print(city[i] + " ");}
		for(int i = 0 ; i<tt.length ; i++) {System.out.print(tt[i] + " ");}
		
		
	} // main END
} // class END
