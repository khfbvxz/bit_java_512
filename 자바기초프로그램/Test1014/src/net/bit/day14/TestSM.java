package net.bit.day14;
import java.util.*;
public class TestSM {
	public static void main(String[] args) {
		int a = 85; // 만약에 60 개 데이터가 필요하면 변수는 60개 선언
		int[] b = new int[60]; // b[0]~b[59] 배열의 단점 같은타입, 크기고정
//		b[0]="ad" // 에러
		
		// 게시판 글쓴이, 사진, 조회 , 글올린 날짜 X5
		ArrayList list = new ArrayList();

		
		Boolean gender = new Boolean(true);
		Double avg = new Double(3.14);
		
		list.add("sky");  // 타입을 정해주세요
		list.add(27);
		list.add(true);
		list.add("비트");
		//여러 혼합 항목의 데이터 나열은 Vector 동기화 ( 무거워 느림)  , ArrayList 비동기화()
		// 항목 추가 add() get(위치), size()
		for(int i=0 ; i<list.size(); i++) {
			System.out.print(list.get(i)+ "  ");
		}
		
	}
}
