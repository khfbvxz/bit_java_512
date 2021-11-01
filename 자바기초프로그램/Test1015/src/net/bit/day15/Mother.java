package net.bit.day15;

public abstract class Mother {
	// interface 아닌 class에서도 추상메소드 가능 
	// 추상메소드가 하나라도 있으면 자동 추상클래스
	// 추상클래스 new 키워드 사용 불가
	public abstract double notebook() ; // 추상메소드 
//	public double notebook() {
//		double avg = 7.8;
//		return avg;
//	}
	
	public static void house() {//static 메소드
//		System.out.println("static house 메소드");
	}
	public static void house(String dong) {//static 메소드
//		System.out.println("static house 메소드"+dong);
	}
	
	public void bc() {  //일반 메소드
		System.out.println("non-static bc메소드");
	}
	public void bc(String com) {  //일반 메소드
		System.out.println("non-static bc메소드"+ com);
	}
	public void bc(String com, int year) {  //일반 메소드
		System.out.println("non-static bc메소드"+ com+"  "+year);
	}
}// class END
