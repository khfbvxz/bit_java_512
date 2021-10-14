package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchAction implements Action {
	@Override
	public void execute(Scanner sc) {
		System.out.println("�˻��� ȸ���� �̸��� �Է��ϼ���.");
		System.out.print("�˻��̸� >> ");
		String sname = sc.nextLine();
		searchMember(sname);
	}

	private void searchMember(String sname) {
		// �˻� ����
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
			// System.out.println("����Ȯ�� " + bfr.readLine() );
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
						System.out.println("## �˻�����Դϴ� ##");
						System.out.println("# �̸� : " + name);
						System.out.println("# ���� : " + age);
						System.out.println("# ���� : " + email);
						searchFlag = true;
						break;
					}
				}
			}
			if (!searchFlag) {
				System.out.println(sname + "���� �����ϴ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}// class END
