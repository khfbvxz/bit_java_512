package net.bit.dat07;

public class Test07char {
	public static void main(String[] args) {
		// int , char 쉽게 변환
		// 미국표준혐회 아스키코드 참고
		
//		char a ='A', b = '1', c=57		;
		char a ='a', b = 'z', c=57		;
		System.out.println(a+"\t"+b+"\t"+c);
		
		System.out.println();
		int x = (int)a;
		int y = (int)b;
		int z = (int)c;
		System.out.println(x+"\t"+y+"\t"+z);
		
		int su=57; // 정수 형
		System.out.print("su=" + su + "\t");
		System.out.println("su=" + (char)su );
		// 표준 타입 = primitive타입 int , double, char , boolean  ...
		
	}
}
