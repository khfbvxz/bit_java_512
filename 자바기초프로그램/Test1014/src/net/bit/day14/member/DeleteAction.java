package net.bit.day14.member;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		deleteMember(name);
	}// end

	public void deleteMember(String name) {
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member;
		for (int i = 0; i < members.size(); i++) {
			member = members.get(i);
			if (member.getName().equals(name)) {
				members.remove(i);
			}
		}
	}// end

}// class END
