package net.bit.day12;

import java.util.Scanner;

public class HomeWork02 {
	static Scanner sc = new Scanner(System.in);
	static boolean[] camp = new boolean[5]; // 배열은 new키워드 생성하면 false 자동초기화
	static int sel = 9, num = 0;

	public static void main(String[] args) {
		list(); // camp상태 구현 함수호출

		while (true) {
			sel = menu();	
			if(sel==1) {	
				checkIn();
				list(); // camp상태 구현 함수호출
			}
			else if(sel==2) {
				checkOut();
				list(); // camp상태 구현 함수호출	
			}
			else if(sel==3) {
				list(); // camp상태 구현 함수호출
			}
			else if(sel==9) {
				myExit();
				break;
			}else {}
			
		} // while end

		sc.close();
	}// main end

	public static int menu() { // 10월12일 화요일 3교시에 추가
		System.out.print("\n1.예약  2.퇴실  3.보기  9.종료>>> ");
		int mysel = Integer.parseInt(sc.nextLine());
		return mysel;
	}// end

	public static void myExit() {
		System.out.println("캠프예약프로그램을 종료합니다");
		System.exit(1);
	}// end

	public static void list() {
		for (int i = 0; i < camp.length; i++) {
			if (camp[i] == true) {
				System.out.println(" " + (i + 1) + "번째 ■캠프장은 사용중입니다");
			} else {
				System.out.println(" " + (i + 1) + "번째 □캠프장은 비어있습니다");
			}
		} // for end
	}// end

	public static void checkIn() {
		System.out.print("예약캠프방번호 입력>>>");
		num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > 5) {
			System.out.println(num + "번호를 사용할수 없습니다");
		}
		if (camp[num - 1] == true) {// 사용중 사용자3입력하면 실제배열은 3-1
			System.out.println("이미 예약된 캠프장이라서 예약할수 없습니다\n");
		} else { // 미사용이라서 예약가능
			System.out.println("camp[" + num + "]캠프장 예약 성공했습니다\n");
			camp[num - 1] = true;
		}
	}// end

	public static void checkOut() {
		System.out.print("퇴실캠프방번호 입력>>>");
		num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > 5) {
			System.out.println(num + "번호를 사용할수 없습니다");
		}
		if (camp[num - 1] == true) {// 퇴실성공
			System.out.println("camp[" + num + "]캠프장 퇴실 성공했습니다\n");
			camp[num - 1] = false;
		} else {
			System.out.println("camp[" + num + "]캠프장 비어 있습니다\n");
		}
	}// end

}// class End
