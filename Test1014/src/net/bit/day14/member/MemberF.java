package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
// ¾Ø ¾ÈºÁµµµÇ

public class MemberF {
	public void file() {
		FileReader fr = null;//
		BufferedReader bfr = null;//
		StringTokenizer st = null; //
		try {
			fr = new FileReader("C:/Mtest/member.txt");
			bfr = new BufferedReader(fr);
			String str = "";
			String name, email, age;
			while ((str = bfr.readLine()) != null) {
				st = new StringTokenizer(str, ",\n");
//			System.out.println(str.length());
				while (st.hasMoreTokens()) {
					name = st.nextToken();
					age = st.nextToken();
					email = st.nextToken();
//					String r = st.nextToken();
//					System.out.println(r);
					int age1 = Integer.parseInt(age);
//				System.out.println("   name  "+name+"   age  "+age1+"   email  "+email);
					MemberVO member = new MemberVO(name, age1, email);
					MemberMain.members.add(member);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (java.util.NoSuchElementException e) {
		}
	}
}
