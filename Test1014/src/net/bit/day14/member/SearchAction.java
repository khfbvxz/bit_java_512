package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchAction implements Action {
	@Override
	public void execute(Scanner sc) {
		System.out.println("검색할 회원의 이름을 입력하세요.");
		System.out.print("검색이름 >> ");
		String sname = sc.nextLine();
		searchMember(sname);
	}

	private void searchMember(String sname) {
		// 검색 구현
		FileReader fr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;

		try {
			fr = new FileReader("C:/Mtest/member.txt");
			bfr = new BufferedReader(fr);
			String str = "";
			String name, email, age;
			int iage = 0;
			//
			int c;
			//
			boolean searchFlag = false;
			// System.out.println("내용확인 " + bfr.readLine() );
			System.out.println("===============================================================\n");
			while ((str = bfr.readLine()) != null) {
//			while ((c = bfr.read()) != -1) {
				st = new StringTokenizer(str, ",");
				//
				while (st.hasMoreTokens()) {
					name = st.nextToken();
					age = st.nextToken();
					email = st.nextToken();
					if (sname.equals(name)) {
						System.out.println("## 검색결과입니다 ##");
						System.out.println("# 이름 : " + name);
						System.out.println("# 나이 : " + age);
						System.out.println("# 메일 : " + email);
						searchFlag = true;
						break;
					}
				}
			}
			if (!searchFlag) {
				System.out.println(sname + "님은 없습니다");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}// class END
