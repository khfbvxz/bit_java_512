package net.bit.day12;

public class Dunkin {
	public static void main(String[] args) {
		System.out.println("Dunkin도너츠와 커피 10:17분 10:18 10:19");
		Dunkin.note();
		
		// 메모리진입 = 자동실행함수 main함수 
	}// main end

	public static void note() {
//		에러System.out.println("책제목="+title);
//		에러System.out.println("책가격="+m);
//		에러System.out.println("포인트="+point);
		String a = book();
		int b = price();
		double c = save();
		System.out.println("책제목=" + a); //정답
		System.out.println("책가격=" + b ); //정답
		System.out.println("포인트=" + c); //정답

		
	}//note 메소드 end

	public static String book() {  // static 메소드 리턴값 String
		String title="몽블랑";
		return title;
	}//book 메소드 end

	public static int price() { // 
		int m = 2700;
		return m;
	}//price 메소드 end
	public static double save() {
		double point = 8.2;
		return point;
	}//save 메소드 end

}
