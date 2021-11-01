package net.bit.dat21;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ���� !!!");
		try {
			TestDAO dao = new TestDAO();
			dao.dbSelectAll();
			
			while (true) {
				System.out.print("1.�űԵ��  2.��ü ���  3.���� 4.����  5.�̸��˻�  9.���� >>>");
				int sel = Integer.parseInt(sc.nextLine());
				if (sel == 9) {System.out.println("test ���̺� crud ó���� �����մϴ�.");System.exit(1);} 
				
				else if (sel == 1) {dao.dbInsert();}
				else if (sel == 2) {dao.dbSelectAll();} 
				else if (sel == 3) {dao.dbDelete();}
				else if (sel == 4) {dao.dbUpdate();} 
				else if (sel == 5) {
					System.out.print("\n�̸��˻� Ű���� �Է��ϼ��� ");
					String find = sc.nextLine();
					dao.dbNameSearch(find);
				} 
				else if(sel==9){break;}
			    else{	 
			      	 System.out.println("test���̺� crudó���� �����մϴ�"); 
			      	 System.exit(1);
		       }
			}
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}// main end
}
// class END