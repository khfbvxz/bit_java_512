package net.bit.day14.member;

import java.util.Scanner;

public class MemberService {
	void process(Action action,Scanner sc){
		action.execute(sc);
	}
}//class END
