package net.bit.day12;

public class HomeWork03 {
	public static void main(String[] args) {
		// Non- static 메소드를 직접 호출 불가! 
		HomeWork03.lotto();
		HomeWork03.gugudan();
		
	}// main end
	
	public static void lotto() {
		int [] lotto = {45, 1 , 14 ,20 ,35};
		System.out.println("\n 로또 출력");
		for(int i = 0 ; i < lotto.length;i++) {
			System.out.print(i+"번째 번호"+lotto[i]+" ");
		}
	}//lotto() end
	public static void gugudan() {
		System.out.println("\n\n구구단 출력");
		int dan = 7 ; 
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try{Thread.sleep(500);}catch(Exception ex) {}
		}
	}//gugudan() end
}
