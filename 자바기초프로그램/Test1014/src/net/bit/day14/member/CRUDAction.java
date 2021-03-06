package net.bit.day14.member;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CRUDAction implements Action{
	
	@Override
	public void execute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.members;
		
		Object[] objArr = members.toArray();
		String[] str = new String[objArr.length];
		for (int i = 0; i < objArr.length; i++) {
			str[i] = String.valueOf(objArr[i]);
		}

		FileWriter fw = null;
		try {
			String path = "C:/Mtest/member.txt";
			fw = new FileWriter("C:/Mtest/member.txt", false); // true , fals
			for (int i = 0; i < objArr.length; i++) {
				fw.write(str[i]);
			}
			System.out.println("파일이 새로 업데이트 됬습니다.");
		} catch (IOException ex) {
			System.out.println("삭제중 파일저장오류" + ex.toString());
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
