package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberMain {
	static ArrayList<MemberVO> members;
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner sc = new Scanner(System.in);
		
		members = new ArrayList<MemberVO>();
		boolean isStop = false;
		
		FileReader fr = null;//
		BufferedReader bfr = null;//
		StringTokenizer st = null; //
		try {
			fr = new FileReader("C:/Mtest/member.txt");
			bfr = new BufferedReader(fr);
			String str = "";
			String name,email,age;
			while((str=bfr.readLine()) != null) {
//				System.out.println(str.length());
				st = new StringTokenizer(str,",");
				while(true){
					name = st.nextToken();
					age =st.nextToken();
					email = st.nextToken();
					int age1 = Integer.parseInt(age);
//					System.out.println("   name  "+name+"   age  "+age1+"   email  "+email);
					MemberVO member = new MemberVO(name, age1, email);
					MemberMain.members.add(member);
				}
			}
		}catch(IOException ex) {ex.printStackTrace();}
		catch(java.util.NoSuchElementException e) {}
		
		
		
		
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
						memberService.process(action, sc);
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

