package net.bit.day13;

public class TestMath {
	public static void main(String[] args) {
		double a=4.7, b=9.1, c=67.824, d=67.825;
		
		System.out.println(Math.round(a)+"\t"+Math.round(b));
		System.out.println(Math.ceil(a)+"\t"+Math.ceil(b));
		System.out.println(Math.floor(a)+"\t"+Math.floor(b));
		System.out.println();
		
		c=67.824; d=67.825;
		System.out.printf("c = %f \n",c);
		System.out.printf("d = %f \n",d);
		
		int i = 3, j=5;
		// int 자료형은 자동으로 double 되서 들어간다. 
//		System.out.println("pow 함수" + Math.pow(i, 2));
//		System.out.println("pow 함수" + Math.pow(i, 2));
//		System.out.println("pow 함수" + Math.pow(i, 3));
//		System.out.println("pow 함수" + Math.pow(j, 4));
		System.out.println("pow 함수" + (int)Math.pow(i, 2));
		System.out.println("pow 함수" + (int)Math.pow(j, 2));
		System.out.println("-------------------------------");
		System.out.println("sqrt 함수 "+ (int)Math.sqrt(9));
		System.out.println("sqrt 함수 "+ (int)Math.sqrt(25));
		System.out.println("-------------------------------");
		System.out.println("abs 함수 "+ Math.abs(-34));
		System.out.println("abs 함수 "+ Math.abs(-23));
		
		// 배열은 크기 고정 , 같은 타입 
		
		String[] city = new String[5];
		TestLotto[] tt = new TestLotto[5];
		for(int k =0;k<5;k++) {
			System.out.println(city[i]);
		}
	}
}
