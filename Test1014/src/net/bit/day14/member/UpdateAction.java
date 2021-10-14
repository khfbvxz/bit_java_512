package net.bit.day14.member;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAction implements Action {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 정보");
		System.out.print("수정할 이름을 입력 >>> ");
		String name = sc.next();
	
		int index = getUpdateMember(name);
		MemberVO member;
		if(index == -1){
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}else{
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("이메일 : ");
			String email = sc.next();		
					
			member = MemberMain.members.get(index);
			member.setAge(age);
			member.setEmail(email);
		}
	}//end

	private int getUpdateMember(String name) {
		int index = -1;
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member;
		for(int i=0;i<members.size();i++) {
			member = (MemberVO)members.get(i);
			if(member.getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}//end
	
}//class END
