package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberMain {
	static ArrayList<MemberVO> members;  // 전역변수 static 선언 OBJ 리스트 
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();  // 멤버 서비스 객체 생성
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		// ArrayList<Integer> String  ArrayList<>(); 
		members = new ArrayList<MemberVO>(); // 생성 . 
		boolean isStop = false;  //  반복문 무한루프 돌리는거 중단시킬려고 변수만든거 
		MemberF fist = new MemberF(); // 내가 추가한거 
		fist.file(); // 내가추가한거  
		do {
			System.out.println( );
			System.out.println("1.회원 가입");
			System.out.println("2.회원 목록 보기");
			System.out.println("3.회원 삭제");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 검색");
			System.out.println("9.종료");
			System.out.print("원하는 작업을 선택하세요>>> ");
			String command = sc.nextLine();
		
			Action action = null;
			
			switch(command){
					case "1":
						action = new AddAction();
						memberService.process(action, sc); //좀 쭐일려고 
						break;
					case "2":
						action = new ListAction();
						memberService.process(action, sc);
						break;
					case "3":
						action = new DeleteAction();
						memberService.process(action, sc);
						break;
						
					case "4":
						action = new UpdateAction();
						memberService.process(action, sc);
						break;
					case "5":
						action = new SearchAction();
						memberService.process(action, sc);
						break;
					case "9":
						action = new CRUDAction();
						memberService.process(action, sc);
						System.out.println("회원등록프로그램을 종료합니다");
						isStop = true;
						break; // 여기 추가함
					default:
//						System.out.println("회원등록프로그램을 종료합니다");
						break;
				}
		}	while(!isStop);
	}//main end
	
}//class END

