package net.bit.day08;

import java.util.Scanner;

public class HomeWork0211 {
	public static void main(String[] args) {
		// 규칙 함수 메소드 생성x  강사님 
		Scanner sc = new Scanner(System.in);
		boolean[] camp = new boolean[5];
		int sel = 9, num = 0;
		System.out.println("1차원배열 캠핑예메10월08일 금요일");
		for (int i = 0; i < camp.length; i++) {
//			System.out.println(camp[i]);
			if (camp[i] == true) {
				System.out.println(" " + (i + 1) + "번째 ■캠프장은 예약되어있습니다.");
			} else {
				System.out.println(" " + (i + 1) + "번째 □캠프장은 비어있습니다.");
			}
		} // for end

		while (true) {
			System.out.print("\n1.예약  2.퇴실  3.보기  9.종료>>");
			sel = Integer.parseInt(sc.nextLine());
			if (sel == 9) {
				System.out.println("캠프장 예약프로그램 종료합니다");
				break;
			}
			// if else 다중 if
			switch (sel) {
			case 1:
				System.out.print("예약캠프방 번호를 입력하세요>");
				num = Integer.parseInt(sc.nextLine());
				if(num<1 || num>5) {System.out.println(num+"번호를 사용할 수 없습니다.");}
				if(camp[num-1]==true) {// 사용중
					System.out.println("이미 예약되어있습니다.");
				}else { // 미사용이라서 예약가능 ㅜ
					System.out.println("camp["+num+"]캠프장 예약 성공했습니다.\n");
					camp[num-1]=true;
				}
				for (int i = 0; i < camp.length; i++) {
//					System.out.println(camp[i]);
					if (camp[i] == true) {
						System.out.println(" " + (i + 1) + "번째 ■캠프장은 예약되어있습니다.");
					} else {
						System.out.println(" " + (i + 1) + "번째 □캠프장은 비어있습니다.");
					}
				} // for end
				break;
				
			case 2:
				System.out.println("퇴실할 예약캠프방 번호를 입력하세요");
				num = Integer.parseInt(sc.nextLine());
				try {
					if(camp[num-1]==false) {System.out.print("이미 빈방입니다.\n\n");}
					else {camp[num-1]=false;System.out.printf("%d 번방이 퇴실되었습니다.\n",num);}
				}catch(Exception ex){System.out.print("방번호를 잘못 입력하셨습니다.\n\n");}
				break;
				
			case 3:
				System.out.println("예약캠프방을 확인하세요");
				for (int i = 0; i < camp.length; i++) {
//					System.out.println(camp[i]);
					if (camp[i] == true) {
						System.out.println(" " + (i + 1) + "번째 ■캠프장은 예약되어있습니다.");
					} else {
						System.out.println(" " + (i + 1) + "번째 □캠프장은 비어있습니다.");
					}
				} // for end
				break;
			default:
				System.out.println("캠프장 예약프로그램 종료합니다.");
				System.exit(1);
				break;
			}//switch end
		} // while end

		sc.close();
	}// main end
}// class End
