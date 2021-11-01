package net.bit.dat07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
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
		 *배열은 같은 타입으로 구선 배열의 첨자시작 [0]qjsWo 배열의 length 배열 출력 for, foreach 배열을
		 * 제어하는 클래스 java.util.Arrays
		 */
		int[] lotto = new int[6];
		lotto[0] = 23;
		lotto[1] = 45;
		lotto[2] = 9;
		lotto[3] = 16;
		lotto[4] = 31;
		lotto[5] = 27;

		String[] city = { "제주도", "선유도", "사량도", "여의도", "영종도", "마라도" };
		String[] title = new String[] { "게시판", "방명록", "로그인" };
		int[] number = { 23, 45, 9 };
//		System.out.println("lotto배열 길이 "+ lotto.length);
//		System.out.println("title배열 길이 "+ title.length);
		for (int i = 0 ; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}System.out.println();
		
		Arrays.sort(lotto);
		for (int i = 0 ; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}System.out.println();
		
		System.out.println("-------------------------");
		for(int temp : lotto) {
			System.out.print(temp + " ");
		}System.out.println();

		
	} // main END
}
