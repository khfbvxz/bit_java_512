package net.bit.day05;

public class Test06 {
	public static void main(String[] args) {
		int a = 0 ,b = 0 , c =0;
		int hap = 0 , tot = 0, sum = 0;
		System.out.println("for반복문");
		for (int i = 0 ; i < 10 ; i=i+1) {
			a = a+1;
			System.out.print(a+"  ");
			hap = hap+a;
		}System.out.println("hap = "+hap);
		System.out.println();
		
		System.out.println("while반복문");
		while(b<10) {
			b=b+1;
			System.out.print(b+"  ");
			tot = tot +b;
		}System.out.println("tot = "+tot);
		System.out.println();
		
		System.out.println("do~while반복문");
		do {
			c=c+1;
			System.out.print(c + "  ");
			sum = sum + c;
		}while(c<10);
		System.out.println("sum = "+sum);
			
		
		
	
	}//main END
}// class END
