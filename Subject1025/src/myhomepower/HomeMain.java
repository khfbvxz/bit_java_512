package myhomepower;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class HomeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			HomeDAO dao = new HomeDAO();
			dao.appAllShow();  // ��� ���߿� 
			
			while (true) {
				System.out.print("1.������ǰ�űԵ��  2.��ü ���  3.������ǰ���� 4.������ǰ����  5.����Ʈȣ���˻�  0.���� >>>");
				int sel = Integer.parseInt(sc.nextLine());
				if(sel==0) {System.out.println("���α׷��� �����մϴ�."); System.exit(1);}
				else if (sel == 1) {
					dao.appInsert();
				}else if (sel == 2) {
					dao.appAllShow();
				}else if (sel == 3) {
					
				}else if (sel == 4) {
					dao.appDelete();
				}else if (sel == 5) {
					dao.hoSearch();
					
				}else if (sel == 6) {
					
				}else if (sel == 7) {
					
				}else if (sel == 8) {
					
				}else if (sel == 9) {
					break;
				}
				else {
					System.out.println("MyHome���α׷��� �����մϴ�.");
					System.exit(1);
				}
				
			}
			
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}// main end
}
