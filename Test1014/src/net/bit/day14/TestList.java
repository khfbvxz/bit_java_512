package net.bit.day14;
import java.util.*;
public class TestList {
	public static void main(String[] args) {

		// 게시판 글쓴이, 사진, 조회 , 글올린 날짜 X5
		ArrayList list = new ArrayList();
		String nick = new String("nick");
		
		Integer age = new Integer(27);
//		int age = new int(27); //오류
//		int[] su = new int[27];//배열
		Boolean gender = new Boolean(true);
		Double  avg = new Double(3.14);
		
		list.add(nick);
		list.add(new String("nick"));
		list.add(age);
		list.add(new Integer(27));
		list.add(gender);
		list.add(new Boolean(true));
		list.add(avg);
		list.add(new Double(3.14));
		//여러혼합항목의 데이터나열은 Vector동기화,ArrayList비동기화
		//항목추가 add(), get(위치), size()
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		
	}
}
