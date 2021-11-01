package net.bit.day15;

public class AAA { 
	public static void main(String[] args) {
		
	}
	class CCC {
//		AAA$CCC.class  생성됨
	}// inner 클래스 
} // class AAA end

class BBB{ // public 붙이면 에러 오너클래스로 
//	AAA.java  생성됨
//	AAA.class  생성됨
//	BBB.java  생성안됨
//	BBB.class  클래스 파일 생성
}//end