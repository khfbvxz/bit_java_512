package net.bit.day06;

public class HomeWork08 {
	public static void main(String[] args) {
		int number = 0, myHap = 0;
		System.out.println("for �ݺ���");
		for (int i = 0; i < 10; i = i + 1) {
			number++;
			if (number == 5) {
				continue;
			}
			System.out.print(number + "  ");
			myHap += number;
		}
		System.out.println("hap = " + myHap);

		System.out.println("while �ݺ���");
		int b = 0, tot = 0;
		while (true) {
			b = b + 1;
			if(b==5) {continue;}
			System.out.print(b + "  ");
			tot = tot + b;
//			try {Thread.sleep(200);} catch (Exception e) {}
			if(b==10)break;
			
		}System.out.println("tot="+tot);
	}
}// class END