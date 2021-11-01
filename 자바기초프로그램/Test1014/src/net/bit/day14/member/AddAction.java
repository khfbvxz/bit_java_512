package net.bit.day14.member;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class AddAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("����� ȸ���� ������ �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.next());
		System.out.print("���� : ");
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
			System.out.println(path + "�������� �����߽��ϴ�");
		} catch (IOException ex) {
			System.out.println("����������� : " + ex.toString());
		} finally {
				try {
					fw.close();
				} catch (IOException e) {e.printStackTrace();	}
		}
	}//end
}//class END


