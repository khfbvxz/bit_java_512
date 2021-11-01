package net.bit.day14.member;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class AddAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("등록할 회원의 정보를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.next());
		System.out.print("메일 : ");
		String email = sc.next();
		
		MemberVO member = new MemberVO(name, age,  email);
		String msg = member.toString(); //" name,age,email,"
		addMember1(member);
		addMember2(msg);
	}

	public void addMember1(MemberVO member) {
		MemberMain.members.add(member);
	}//end
	
	public void addMember2(String member) {
		FileWriter fw = null;
		try {
			String path ="C:/Mtest/member.txt";
			fw = new FileWriter("C:/Mtest/member.txt",true); //true , false
			fw.write(member);
			System.out.println(path + "파일저장 성공했습니다");
		} catch (IOException ex) {
			System.out.println("파일저장오류 : " + ex.toString());
		} finally {
				try {
					fw.close();
				} catch (IOException e) {e.printStackTrace();	}
		}
	}//end
}//class END


