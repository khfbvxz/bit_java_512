package net.bit.dat07;

public class HomeWork05 {
	public static void main(String[] args) {
		// startsWith  endsWith indexOf length  substring
		String jumin = "951230-2693485";
		//문제 성별 구별  1 ,3 2 4  char 리턴값 charAt(int)
		//문제 성별 구별  String 리턴값 substring(시작 , 끝+1)
//		String gender = jumin.substring(7,8);
//		int genderNum = Integer.parseInt(gender);
////		System.out.println(gender);
//		if (genderNum ==1 || genderNum == 3) {
//			System.out.println("납자입니다");
//		}
//		else if(genderNum ==2 || genderNum == 4) {
//			System.out.println("여자입니다");
//		}
//		else 
//			System.out.println("당신은 외게인~");
		/// 강사님 풀이
		String info = "";
		char gender = jumin.charAt(7);
		if(gender == '1' || gender =='3') {
			info = "남자";
		}else if(gender == '2' || gender == '4') {
			info="여자";
		}else {
			System.out.println("성별 표기 오류");
			return; //  return 없으면 밑에 출력문 나옴 !
		}
		System.out.println("aa당신의 성별은 "+ info + " 입니다.");
		
		
		String msg = jumin.substring(7,8);
		if(msg.equals("1") || msg.equals("3")) {  // 참조형 비교는 equals()
			info = "man";
		}else if(msg.equals("2") ||msg.equals("4")) {
			info="woman";
		}else {
			System.out.println("성별 표기 오류");
			return; //  return 없으면 밑에 출력문 나옴 !
		}
		System.out.println("aa당신의 성별은 "+ info + " 입니다.");
		
		
	} // main end 
} // class end
