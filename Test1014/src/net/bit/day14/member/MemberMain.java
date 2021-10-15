package net.bit.day14.member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberMain {
	static ArrayList<MemberVO> members;  // �������� static ���� OBJ ����Ʈ 
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();  // ��� ���� ��ü ����
		Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
		// ArrayList<Integer> String  ArrayList<>(); 
		members = new ArrayList<MemberVO>(); // ���� . 
		boolean isStop = false;  //  �ݺ��� ���ѷ��� �����°� �ߴܽ�ų���� ��������� 
		MemberF fist = new MemberF(); // ���� �߰��Ѱ� 
		fist.file(); // �����߰��Ѱ�  
		do {
			System.out.println( );
			System.out.println("1.ȸ�� ����");
			System.out.println("2.ȸ�� ��� ����");
			System.out.println("3.ȸ�� ����");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� �˻�");
			System.out.println("9.����");
			System.out.print("���ϴ� �۾��� �����ϼ���>>> ");
			String command = sc.nextLine();
		
			Action action = null;
			
			switch(command){
					case "1":
						action = new AddAction();
						memberService.process(action, sc); //�� ���Ϸ��� 
						break;
					case "2":
						action = new ListAction();
						memberService.process(action, sc);
						break;
					case "3":
						action = new DeleteAction();
						memberService.process(action, sc);
						break;
						
					case "4":
						action = new UpdateAction();
						memberService.process(action, sc);
						break;
					case "5":
						action = new SearchAction();
						memberService.process(action, sc);
						break;
					case "9":
						action = new CRUDAction();
						memberService.process(action, sc);
						System.out.println("ȸ��������α׷��� �����մϴ�");
						isStop = true;
						break; // ���� �߰���
					default:
//						System.out.println("ȸ��������α׷��� �����մϴ�");
						break;
				}
		}	while(!isStop);
	}//main end
	
}//class END

