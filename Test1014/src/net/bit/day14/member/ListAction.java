package net.bit.day14.member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member;
		if(members.size() >= 1){
			for(int i=0;i<members.size();i++){
				member = members.get(i);
				System.out.println(member.toString());
			}
		}else{System.out.println("회원 정보가 존재하지 않습니다.");}
	}//end
	
}//class END

