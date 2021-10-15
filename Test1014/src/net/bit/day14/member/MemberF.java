package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class MemberF {
	public void file() {
		FileReader fr = null;// int sum = 0;   
		BufferedReader bfr = null;//
		StringTokenizer st = null; //
		try {
			fr = new FileReader("C:/Mtest/member.txt"); // fr 파일reader 객체 생성 
			bfr = new BufferedReader(fr);
			String str = "";// 
			String name, email, age;// 지역변수 선언  
			while ((str = bfr.readLine()) != null) { // 파일 내용 다 읽어라~ 
				st = new StringTokenizer(str, ",\n"); // 자연어"강사,10,나" 
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
