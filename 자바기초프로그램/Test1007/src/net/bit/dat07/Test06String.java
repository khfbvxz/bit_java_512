package net.bit.dat07;

public class Test06String {
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/7/docs/index.html    ==>자바플랫폼구조설명
		//https://docs.oracle.com/javase/7/docs/api/index.html ==> API도움말
		// char 이해
		// 자바에서 String 클래스 참조타입
		
		String a = "hello"; // 쉽게 편하게 접근 가능
		String b = new String("hello");
		char[] c = new char[] {'h','e','l','l','o'};
		String d = new String(c);
		String email = "kimtest123@bit.com";
		
		//문제 1 startsWith("kim") 포함여부
		boolean ret1 = email.startsWith("kim");
		boolean ret2 = email.endsWith("com"); // gif, jpg, png , pdf 
		
		int ret4 = email.indexOf("123");
		int ret3 = email.indexOf("789"); // @ 체크 여부
		System.out.println("메일 끝 주소 " + ret2);
		System.out.println("789메일 포함여부 " + ret3);  // -1
		System.out.println("123메일 포함여부 " + ret4);  // 7
		
		String jumin = "951230-2693485";
		//12월 30일 생일이네요 출력 subsring(시작 , 끝 +1)
		String m = jumin.substring(2,3+1);
		String day = jumin.substring(4,6);
		System.out.println(m + "월 " + day + " 일 생일 이네요");
		
		String jend = jumin.substring(7); // 시작 위치지정하면 끝까지 출력
		System.out.println(jend);
		
		String juminLen1 = "951230"; //6자리 수
		String juminLen2 = "2693485"; //6자리 수
		
		// 문자열 길이 int size1 = juminLen1.length()
		int size1 = juminLen1.length();
		int size2 = juminLen2.length();
		System.out.println(size1);
		System.out.println(size2);
		//주민번호 자릿수 체크 
		if ( size1 !=6 || size2 != 7) {
			System.out.println("주민번호 다시 입력사에요");
		}
		else {
			System.out.println("인증된 주민번호입니다\n 서비스 이용이 가능합니다.");
		}
		
	}
}
