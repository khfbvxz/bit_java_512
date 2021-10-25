package net.bit.dat21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class TestDAO implements Test {
	private Connection CN = null; // DB�����ּҹ� id,pwd ������ CN����ϰ� ��ɾ�����Ҷ� ����
	private Statement ST = null; // �����θ�ɾ�
	private PreparedStatement PST = null; // ������ ��ɾ� 2021-10-21-�����
	private ResultSet RS = null; // ��ȸ�Ѱ����� RS = ST.executeQuery("select"); while(RS.next()){ }
	private String msg, Gmsg, nameB;
	private int Gtotal, codeA, hitD;
	Scanner sc = new Scanner(System.in);
	
	public TestDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");
			ST = CN.createStatement();
		} catch (Exception e) { 
			System.out.println("DB���� ���� ���� "+ e.toString());
		}
	}// ������ end 
	
	
	public void coffee() {
		System.out.println("���ɽð����� Ŀ��");
	}//end


	@Override
	public void dbSelectCode(int find) {
		try {
//	    	msg="";
//	    	System.out.println("\t\t��ü���ڵ尹��:"+ dbCountAll());
			msg = "select code,name,wdate,hit from test  where code = " +  find ; 
			RS = ST.executeQuery(msg); // ��ȸ�Ѱ�� ��ü�� RS���
			System.out.println("�ڵ�\t �̸�\t ��¥\t��ȸ��");
			System.out.println("-------------------------------");
			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
			}
			System.out.println("-------------------------------");
			System.out.println();
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
		
	}


	@Override
	public void dbNameSearch(String find) {
		try {
			int data = dbCountName(find);
			if (data == 0) {
				System.out.println(find + " �˻� ����� �������� �ʽ��ϴ�.\n");
				return; // �Ʒ� ���� ó�� ���ϰ� �Լ� Ż��
			}
			System.out.println("\t\t��ü���ڵ尹�� : " + data);
			System.out.println("-------------------------------");
			msg = "select * from test where name like '%" + find + "%' order by code "; // ��ȸ����� ������, ��ȸ���ڵ尹�� ���
			RS = ST.executeQuery(msg);
			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
			}
//			System.out.println("�������� " + msg);
			// while�ݺ��� ���
			System.out.println();
		} catch (Exception e) {
			System.out.println("�̸���ȸ ���� " + e.toString());
		}
		
	}


	@Override
	public int dbCountName(String key) {
		try {
			msg = "select count(*) as cnt from test where name like '%"+key+"%'";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}

		} catch (Exception e) {
		}
		return Gtotal;
	}



	
	@Override
	public void dbUpdate() {
		try {
			System.out.print("������ �ڵ带 �Է��ϼ���>>");
			codeA = Integer.parseInt(sc.nextLine());
			msg = "select count(*) as cnt from test where code = " + codeA;
			RS = ST.executeQuery(msg);
			if (RS.next() == true) { Gtotal = RS.getInt("cnt");}
			if (Gtotal == 0) {
				System.out.println(codeA + " �ڵ嵥���Ͱ� �������� �ʽ��ϴ�. \n����ó�������Ͱ� �Ұ��մϴ�.\n ");
				return;
			}
			System.out.print(codeA +" �� PST������  �̸��� �Է��ϼ���>>");
			nameB = sc.nextLine();
			System.out.print(codeA +" �� PST������ ��ȸ���� �Է��ϼ���>>");
			hitD = sc.nextInt();
//			msg = "update test set name = '"+nameB+"' , wdate = sysdate , hit="+hitD +"where code = "+codeA;
//			int up = ST.executeUpdate(msg);
			msg = "update test set name = ? , wdate = sysdate , hit= ? where code = ?";
			PST = CN.prepareStatement(msg);
				PST.setString(1, nameB);
				PST.setInt(2, hitD);
				PST.setInt(3, codeA);
			
			int up = PST.executeUpdate();
			if(up>0) {
				System.out.println(codeA + "  ������ PST ���� �����߽��ϴ�");
				this.dbSelectAll();
			}else {
				System.out.println(codeA + " ������ PST ���� �����߽��ϴ�");
			}	
		} catch (Exception ex) {
			System.out.println("PST ���������۾� ���� ����  " + ex.toString());
		}
		
	}




	@Override
	public int dbCountAll() {
		try {
			msg = "select count(*) as cnt from test";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
		} catch (Exception e) {
		}
		return Gtotal;
	}


	@Override
	public void dbDelete() {
		try {
			System.out.print("�����ڵ�code�Է� >>> ");
			codeA = Integer.parseInt(sc.nextLine());
			msg = "select count(*) as cnt from test where code = " + codeA;
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
			if (Gtotal == 0) {
				System.out.println(codeA + " �ڵ嵥���� �������� �ʽ��ϴ�\n");
				return;
			}
			msg = "delete from test where code = " + codeA;
			ST.executeUpdate(msg); // ��¥����ó��
			System.out.println(codeA + " �ڵ嵥���� ���� �����߽��ϴ�\n");
			dbSelectAll(); // ��ü��ȸ�޼ҵ带 ȣ��
		} catch (Exception e) {
			System.out.println(codeA + " �ڵ嵥���� ���� �����߽��ϴ�");
		}
		
	}// delete end


	@Override
	public void dbInsert() {
		try {
//			Scanner sc = new Scanner(System.in);
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
			System.out.print("��ȸ hit �Է� >>> ");
			hitD = Integer.parseInt(sc.nextLine());
			
//			msg = "insert into test(code,name,wdate,hit) values(" + codeA + ",'" + nameB + "', sysdate," + hitD + ")";
//			int OK = ST.executeUpdate(msg); // ��¥����
			msg = "insert into test(code,name,wdate,hit) values(? , ? , sysdate, ?)";
			//������ ��Ī
			PST = CN.prepareStatement(msg);
				PST.setInt(1, codeA);  // ù��° ����ǥ
				PST.setString(2, nameB);
//				PST.setDate(3, sysdate);
				PST.setInt(3, hitD);
			int OK = PST.executeUpdate();// ��¥ ���� ó��
			
			if (OK > 0) {
				System.out.println(codeA + " ���������� �����߽��ϴ�");
				this.dbSelectAll();
			}
		} catch (Exception ex) {System.out.println("�������� " + ex);}
	}// dbInsert() end


	@Override
	public void dbSelectAll() {
		try {
			msg = "select count(*) as cnt from test";
			RS = ST.executeQuery(msg);
			RS.next();
			Gtotal = RS.getInt("cnt");
			System.out.println("\t\t��ü���ڵ尹�� : " + dbCountAll());

			msg = "select code,name,wdate,hit from test order by code asc";
			RS = ST.executeQuery(msg); // ��ȸ�Ѱ�� ��ü�� RS���

			System.out.println("\n�ڵ�\t �̸�\t ��¥\t\t��ȸ��");
			System.out.println("-----------------------------------");

			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
		
	}//dbSelectAll() end 
}// class
