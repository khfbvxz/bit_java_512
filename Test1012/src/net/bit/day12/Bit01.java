package net.bit.day12;

public class Bit01 {
	public static void main(String[] args) {
		System.out.println("Bit02.java 12시 01분");
		test();
	}

	public static void test() {
		String name = "김자바";
		int kor=90, eng = 85;
		aaa(name,kor,eng); //
		int result = bbb(kor,eng);
	}// test end

	public static void aaa(String a , int k ,int l) {
		System.out.println("이름= "+ a);
		int hap = k +l;
		System.out.println("합계 = " + hap);
	}// aaa end

	public static int bbb(int k , int e) {
		int tot = k + e;
		return tot;
	}// bbb end

}
