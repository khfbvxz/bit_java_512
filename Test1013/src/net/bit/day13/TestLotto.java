package net.bit.day13;

import java.util.Arrays;
import java.util.Random;

public class TestLotto {
	public static void main(String[] args) {
		int[] data = input();
		output(data);
		
		int[]data2 = input2();
		output(data2);
	}// main end
	
	public static int[] input() {
		// 난수를 이용해서 Random r = new Random() ; int a = r.nextInt(45);
		//java . lang.Math  double d = Math.rand(); int com = (int)(Math.rand()*45) +1
		// 난수를 이용해서 로또 1~45 사이 숫자 6개 발생 후 6개 데이터 리턴
		
//		int [] su = {27,43,7,15,36,40};
		
		int [] su = new int[6]; 
		for(int i = 0 ; i<su.length;i++) {
			su[i]= (int)(Math.random()*45)+1;
			for(int j = 0 ;j<i;j++) {
				if(su[i]==su[j]) {i--; break;}
			}
		}
	
		return su;
	}//end
	public static int[] input2() {
		Random r = new Random();
		int [] a = new int [6];
		for(int i = 0;i<a.length;i++) {
			a[i]=r.nextInt(45)+1;
			for(int j = 0 ; j<i;j++) {
				if(a[i]==a[j]) {i--;break;}
			}
		}
		
		return a;
	}
	public static void output(int[] data) {
		Arrays.sort(data);
		for(int temp:data) {
			System.out.print(temp+"  ");
		}System.out.println();
	}//end
	
}// class END
