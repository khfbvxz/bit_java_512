package net.bit.day14;
import java.util.*;
public class TestList2 {
	public static void main(String[] args) {
		
		
		// 게시판 글쓴이, 사진, 조회 , 글올린 날짜 X5
		
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		list.add("nick");  // 타입을 정해주세요
		list.add(new String("nick"));
		list.add(new String("27"));
		list.add(new String("3.14"));
		//여러 혼합 항목의 데이터 나열은 Vector 동기화 ( 무거워 느림)  , ArrayList 비동기화()
		// 항목 추가 add() get(위치), size()
		for(int i=0 ; i<list.size(); i++) {
			System.out.print(list.get(i)+ "  ");
		}
		
	}
}
