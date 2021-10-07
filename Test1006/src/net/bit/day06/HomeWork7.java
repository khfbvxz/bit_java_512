package net.bit.day06;

public class HomeWork7 {
	public static void main(String[] args) {
		int su = 0;
		while(true) {
			su = su +1;
			System.out.print(su + "\t");
			if (su%5 ==0) {System.out.println();}
			if (su == 30) {break;}
		}
//		System.out.println("마지막문장");
	}
}// class END
