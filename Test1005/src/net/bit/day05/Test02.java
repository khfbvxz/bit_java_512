package net.bit.day05;

public class Test02 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, hap = 0;
		double avg = 0.0;
		String name = "스프링";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		System.out.println("이름\t국어\t영어\t총점\t평균");
//		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ hap + "\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%4.2f\n",name,kor,eng,hap,avg);
		
	}
}// class END
