package net.bit.day08;

public class HomeWork01 {
	public static void main(String[] args) {
		// Non- static �޼ҵ带 ���� ȣ�� �Ұ�! 
		HomeWork01.lotto();
		HomeWork01.gugudan();
		
	}// main end
	
	public static void lotto() {
		int [] lotto = {45, 1 , 14 ,20 ,35};
		System.out.println("\n �ζ� ���");
		for(int i = 0 ; i < lotto.length;i++) {
			System.out.print(i+"��° ��ȣ"+lotto[i]+" ");
		}
	}//lotto() end
	public static void gugudan() {
		System.out.println("\n\n������ ���");
		int dan = 7 ; 
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try{Thread.sleep(500);}catch(Exception ex) {}
		}
	}//gugudan() end
}
