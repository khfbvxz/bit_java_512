package net.bit.day14;

public class Son extends Father implements Board,Guest{
	public static void main(String[] args)  {
		System.out.println("Son 클래스 main 메소드");
		Son kim_j = new Son();
		kim_j.study();
		
//		int B = this.bank(); // static 에서는 this 사용 안되
	}// main end
	
	@Override
	public int bank() {
		int value=0;
		return value;
//		return super.bank();
	}
	
	
	public void study() {
		System.out.println("Son클래스 study 메소드");
		System.out.println("자바 공부중\n");
		int A = super.bank();
		int B = this.bank();  // this 키워드 생략가능
		int C = bank();
		System.out.println("A="+A); // 부모꺼
		System.out.println("B="+B);
		System.out.println("C="+C);
	}//study end
	
	@Override
	public boolean boardInsert() {
		return false;
	}
	@Override
	public void boardDelete(int code) {}
	@Override
	public void boardList() {}
	@Override
	public int getCount() {return 0;}
	@Override
	public void guestUpdate() {
	
	}//end 
	
}//class end
