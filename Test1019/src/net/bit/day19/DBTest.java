package net.bit.day19;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {

	private Connection CN = null; // DB�����ּҹ� id,pwd ������ CN����ϰ� ��ɾ�����Ҷ� ����
	private Statement ST = null; // �����θ�ɾ�
	private ResultSet RS = null; // ��ȸ�Ѱ����� RS = ST.executeQuery("select"); while(RS.next()){ }
	private String msg, Gmsg, nameB;
	private int Gtotal, codeA, hitD;

	public DBTest() {
		try {
			CN = DB.getConnection();
			ST = CN.createStatement();
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}// �⺻ ������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			DBTest ob = new DBTest();
			ob.dbSelectAll();
//			ob.dbInsert();
			while (true) {
				System.out.print("1.�űԵ��  2.��ü ���  3.���� 4.����  5.�̸��˻�  9.���� >>>");
				int sel = Integer.parseInt(sc.nextLine());

				if (sel == 9) {
					System.out.println("test ���̺� crud ó���� �����մϴ�.");
					System.exit(1);
				} else if (sel == 1) {
					ob.dbInsert();
				} else if (sel == 2) {
					ob.dbSelectAll();
				} else if (sel == 3) {
					ob.dbDelete();
				}else if(sel ==4) {
//					System.out.println("������ �����մϴ�.");
					ob.dbUpdate();
				}
				else if(sel == 5) {
					ob.dbNameSearch();
				}
				else {
					System.out.println("���ڸ� ����� �Է��ϼ���");
				}
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}// main end
	public void dbUpdate() {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("������ �ڵ带 �Է��ϼ��� >> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int total = RS.getInt("cnt");
					if (total == 0) {
						System.out.println(codeA + " ���� �����ʹ� �������Դϴ�\n ");
						continue;
					}
					break;
				}
			} // while 
			System.out.print("������ �̸��� �Է��ϼ��� >> "); 
			nameB = sc.nextLine();
			msg="update test set name= '"+nameB+"' where code = "+codeA;
			int OK = ST.executeUpdate(msg); // ��¥����
//			System.out.println(OK);
			if (OK>0) {
				System.out.println(codeA + " ������ ���� �����߽��ϴ�");
				this.dbSelectAll();
			}else {
				System.out.println(codeA + " ���������� �����߽��ϴ�");
			}
				
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}
	
	public void dbNameSearch() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("�˻��� �̸��� �Է��ϼ���");
			nameB = sc.nextLine();
			msg = "select * from test where name = '"+nameB+"' order by code asc";
			RS = ST.executeQuery(msg);
			this.dbShow(RS);

			int NS = ST.executeUpdate(msg);

			if (NS>0) {
				System.out.println(nameB+"�� ��� "+NS+"�� �˻�����Դϴ�.");
			}else {
				System.out.println("�̸��� �����ϴ�.");
			}
		} catch (Exception ex) {
			System.out.println("��������" + ex);
		}
	}// dbNameSearch() end
	
	public void dbDelete() { // non -static
		// �ڵ� code �ʵ� ����
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("������ code �Է� >>> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int total = RS.getInt("cnt");
					System.out.println();
					if (total == 0) {
						System.out.println(codeA + " �����ʹ� ���� �������Դϴ�\n ");
						continue;
					}
					break;
				}
			}
			msg = "delete from test where code =" + codeA;
//			RS = ST.executeQuery(msg);
			int DL = ST.executeUpdate(msg); // �Ǹ� ��ȯ 0
//			System.out.println(DL);
			if (DL > 0) { // code�� ��� �����..
				System.out.println(codeA + "������ ���� ����!");
				this.dbSelectAll();
			} else {
				System.out.println(codeA + "������ ���� ����!");
			}
		} catch (Exception ex) {
			System.out.println("��������" + ex);
		}
	}// dbDelete() end

	public void dbInsert() {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("�ڵ�code�Է� >>> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int total = RS.getInt("cnt");
					if (total > 0) {
						System.out.println(codeA + " �����ʹ� �ߺ��� �������Դϴ�\n ");
						continue;
					}
					break;
				}
			} // while end

			System.out.print("�̸�name�Է� >>> ");
			nameB = sc.nextLine();

			msg = "insert into test(code,name,wdate,hit) values(" + codeA + ",'" + nameB + "', sysdate," + hitD + ")";
			int OK = ST.executeUpdate(msg); // ��¥����
			if (OK > 0) {
				System.out.println(codeA + " ���������� �����߽��ϴ�");
				this.dbSelectAll();
			} else {
				System.out.println(codeA + " ���������� �����߽��ϴ�");
			}
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}// dbInsert() end

	public void dbSelectAll() {

		try {
			msg = "select count(*) as cnt from test";
			RS = ST.executeQuery(msg);
			RS.next();
			Gtotal = RS.getInt("cnt");
			System.out.println("\t\t��ü���ڵ尹�� : " + Gtotal);

			msg = "select code,name,wdate,hit from test order by code asc";
			RS = ST.executeQuery(msg); // ��ȸ�Ѱ�� ��ü�� RS���

			this.dbShow(RS);

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}
	public void dbShow(ResultSet RS) {
		System.out.println("\n�ڵ�\t �̸�\t ��¥\t��ȸ��");
		System.out.println("-------------------------------");
		try {
		while (RS.next() == true) {
			int a = RS.getInt("code");
			String b = RS.getString("name");
			Date c = RS.getDate("wdate");
			int d = RS.getInt("hit");
			System.out.println(a + "\t" + b + "\t" + "c" + "\t" + d);
		}}
		catch(Exception ex) {System.out.println("�������� " + ex);}
		System.out.println("-------------------------------");
		System.out.println();
	}
}
// class END