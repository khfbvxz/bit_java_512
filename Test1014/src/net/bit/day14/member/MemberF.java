package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
// ¾Ø ¾ÈºÁµµµÇ

public class MemberF {
	
	FileReader fr = null;//
	BufferedReader bfr = null;//
	StringTokenizer st = null; //
	try {
		fr = new FileReader("C:/Mtest/member.txt");
		bfr = new BufferedReader(fr);
		String str = "";
		String name,email,age;
		while((str=bfr.readLine()) != null) {
//			System.out.println(str.length());
			st = new StringTokenizer(str,",");
			while(true){
				name = st.nextToken();
				age =st.nextToken();
				email = st.nextToken();
				int age1 = Integer.parseInt(age);
//				System.out.println("   name  "+name+"   age  "+age1+"   email  "+email);
				MemberVO member = new MemberVO(name, age1, email);
				MemberMain.members.add(member);
			}
		}
	}catch(IOException ex) {ex.printStackTrace();}
	catch(java.util.NoSuchElementException e) {}
}
