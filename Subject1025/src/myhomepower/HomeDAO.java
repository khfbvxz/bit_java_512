package myhomepower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class HomeDAO implements DAOinterface {
	private Connection CN = null; 
	private Statement ST = null; 
	private PreparedStatement PST = null; 
	private ResultSet RS = null; 
	private String msg, msg2, aptNameA, aptloc, appname, appbrand, purchase, change;
	private int Gtotal, aptno, roomno, energy, power, showno, ck;
	Scanner sc = new Scanner(System.in);

	public HomeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");
			ST = CN.createStatement();
		} catch (Exception e) {
			System.out.println("DB���� ���� ���� " + e.toString());
		}
	}// ������ end

	@Override
	public void powerTotal() {
		try {
			while (true) {
				System.out.print("����Ʈ�̸��Է�>>");
				aptNameA = sc.nextLine();

				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
						
			msg = "select sum(powerofday) from APPLIANCES  where roomno = "+roomno+" and aptno="+aptno;
			RS = ST.executeQuery(msg);
			RS.next();
			int a = RS.getInt("sum(powerofday)");
			System.out.println(aptNameA+"����Ʈ "+roomno+"ȣ �� �Ϸ� �� ������·��� : "+ a);
			System.out.println();
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}

	public void appAllShow() {
		try {		
			System.out.println("\t\t��ü���ڵ尹�� : " + appCountAll());

			System.out.println("����Ʈ��\t\t ȣ\t ������ǰ\t �귣��\t ���ų⵵\t ");
			System.out.println("-------------------------------");

			msg = "select aptname, roomno, appname , appbrand, PURCHASEYEAR\r\n" + "from APARTMENT t , APPLIANCES p\r\n"
					+ "where t.aptno=p.aptno order by p.aptno , roomno";
			RS = ST.executeQuery(msg);
			while (RS.next() == true) {
				String aname = RS.getString("aptname");
				int rno = RS.getInt("roomno");
				String pname = RS.getString("appname");
				String brand = RS.getString("appbrand");
				String year = RS.getString("PURCHASEYEAR");
				System.out.println(aname + "\t" + rno + "\t" + pname + "\t" + brand + "\t" + year);
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}

	}

	public void aptNameCheck(String aptName) {
		try {
			
			msg = "select count(*) as cnt from apartment where aptName = '" + aptName + "'";
			RS = ST.executeQuery(msg);
			int count = 1;
			if (RS.next() == true) {
				int aptNC = RS.getInt("cnt");
				if (aptNC > 1) {
					msg = "select loc from apartment where aptname='" + aptName + "'";
					RS = ST.executeQuery(msg);
					while (RS.next()) {
						String lo = RS.getString("loc");
						System.out.print(count + "��° ���� : " + lo + "  ");
						count++;
					}
					System.out.print("\n����Ʈ�� ������ �Է��ϼ���");
					aptloc = sc.nextLine();
					msg = "select count(*) as cn from apartment where loc = '" + aptloc + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == true) { // �Լ��� �ɰ��ߵ�..
						int total2 = RS.getInt("cn");
						if (total2 == 0) {
							System.out.println("�� ������ ����Ʈ�� �������� �ʽ��ϴ�.");
							ck = 1;
						}
					}
					System.out.print("ȣ���� �Է��ϼ��� >> ");
					roomno = Integer.parseInt(sc.nextLine());
					msg = "select DISTINCT roomno from APPLIANCES, APARTMENT where roomno=" + roomno + " and loc = '"
							+ aptloc + "' and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == false) {
						System.out.println("ȣ���� �������� �ʽ��ϴ�. ");
						ck=1;
					}else {ck=0;}
					
					msg = "select aptno from APARTMENT where loc = '" + aptloc + "' and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					RS.next();
					aptno = RS.getInt("aptno");
				} else if (aptNC == 1) {
					System.out.print("ȣ���� �Է��ϼ��� >> ");
					roomno = Integer.parseInt(sc.nextLine());
					msg = "select DISTINCT roomno from APPLIANCES, APARTMENT where roomno=" + roomno+" and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == false) {
						System.out.println("ȣ���� �������� �ʽ��ϴ�.  ");
						ck=1;
					}else {ck=0;}
					
					msg = "select aptno from APARTMENT where aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					RS.next();
					aptno = RS.getInt("aptno");

				} else if (aptNC == 0) {
					System.out.println("��ϵ� ����Ʈ�� �����ϴ�.");
					ck = 1;
				}
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}

	}

	@Override
	public void appInsert() {
		try {

			while (true) {
				System.out.print("����Ʈ�̸��Է�>>");
				aptNameA = sc.nextLine();

				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
			System.out.print("������ǰ �̸� �Է� >> ");
			appname = sc.nextLine();
			System.out.print("�귣�� �Է� >> ");
			appbrand = sc.nextLine();
			System.out.print("������ȿ����� �Է� >> ");
			energy = Integer.parseInt(sc.nextLine());
			System.out.print("��� �Ϸ������·� �Է� >>");
			power = Integer.parseInt(sc.nextLine());
			System.out.print("���ų⵵ �Է� >> ");
			purchase = sc.nextLine();

			msg = "INSERT INTO APPLIANCES VALUES ( APPLIANCES_SEQ.NEXTVAL , ?,  ?, ? , ?, ? , ?,?)";

			PST = CN.prepareStatement(msg);
			PST.setString(1, appname);
			PST.setString(2, appbrand);
			PST.setInt(3, energy);
			PST.setInt(4, power);
			PST.setString(5, purchase);
			PST.setInt(6, roomno);
			PST.setInt(7, aptno);
			int OK = PST.executeUpdate();
			if (OK > 0) {
				System.out.println(aptNameA + "����Ʈ " + roomno + "ȣ �� " + appname + "�� ����Ͽ����ϴ�.");
				this.appShow();
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}

	}

	@Override
	public void appDelete() {
		int count =1;
		try {
			while (true) {
				System.out.print("(����)����Ʈ �̸� �Է�>>");
				aptNameA = sc.nextLine();
				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
			System.out.print("������ ������ǰ �Է� >> ");
			appname = sc.nextLine();
			msg = "select count(*) cnt from APPLIANCES where roomno =" + roomno + " and aptno = " + aptno
					+ "and appName ='" + appname + "'";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
			if (Gtotal == 0) {
				System.out.println(appname + "�� ��ϵǾ� ���� �ʽ��ϴ�.");
				return;
			} else if (Gtotal > 1) {
				msg = "select appbrand from APPLIANCES where roomno = "+roomno+" and aptno="+aptno+" and appname='"+appname+"'";
				RS=ST.executeQuery(msg);
				while(RS.next()==true) {
					String o = RS.getString("appbrand");
					System.out.print(count + "��° �귣�� : " + o + "  ");
					count++;
				}
				System.out.print("\n������ ������ǰ�� �귣�带 �Է��ϼ���>> ");
				appbrand = sc.nextLine();
			
				msg = "delete from APPLIANCES where roomno = ? and aptno = ? and appname = ? and appbrand =? ";
				PST = CN.prepareStatement(msg);
				PST.setInt(1, roomno);
				PST.setInt(2, aptno);
				PST.setString(3, appname);
				PST.setString(4, appbrand);
			} else {
				msg = "delete from APPLIANCES where roomno = ? and aptno = ? and appname = ? ";
				PST = CN.prepareStatement(msg);
				PST.setInt(1, roomno);
				PST.setInt(2, aptno);
				PST.setString(3, appname);
			}
			int OK = PST.executeUpdate();
			if (OK > 0) {
				System.out.println(aptNameA + "����Ʈ " + roomno + "ȣ �� " + appname + "�� ����� �����Ǿ����ϴ�. ");
				this.appShow();
			}

		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}

	}

	@Override
	public void appUpdate() {
		int count = 1;
		try {
			while (true) {
				System.out.print("(����)����Ʈ �̸� �Է�>>");
				aptNameA = sc.nextLine();
				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
			System.out.print("������ ������ǰ�� �Է��ϼ���>> ");
			appname = sc.nextLine();
			msg = "select count(*) cnt from APPLIANCES where roomno =" + roomno + " and aptno = " + aptno
					+ "and appName ='" + appname + "'";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
			if (Gtotal == 0) {
				System.out.println(appname + "�� ��ϵǾ� ���� �ʽ��ϴ�.");
				return;
			}else if (Gtotal > 1) { // TV�� �ΰ� �϶� 
				msg = "select appbrand from APPLIANCES where roomno = "+roomno+" and aptno="+aptno+" and appname='"+appname+"'";
				RS=ST.executeQuery(msg);
				while(RS.next()==true) {
					String o = RS.getString("appbrand");
					System.out.print(count + "��° �귣�� : " + o + "  ");
					count++;
				}
				System.out.print("������ ������ǰ�� �귣�带 �Է��ϼ���>> ");
				appbrand = sc.nextLine();
				System.out.print("����� ������ǰ�� �귣�带 �Է��ϼ���>> ");
				change = sc.nextLine();
				System.out.print("������ȿ����� �Է� >> ");
				energy = Integer.parseInt(sc.nextLine());
				System.out.print("��� �Ϸ������·� �Է� >>");
				power = Integer.parseInt(sc.nextLine());
				System.out.print("���ų⵵ �Է� >> ");
				purchase = sc.nextLine();
				msg = "update APPLIANCES set appbrand = '"+change+"' , purchaseyear ='"+purchase+"' ,  energygrade = "+energy+" ,powerofday = "+power+" where roomno = "+roomno+" and aptno= "+aptno+" and appname = '"+appname+"' and appbrand = '"+appbrand+"'";

				ST.executeUpdate(msg);
				System.out.println(aptNameA + "����Ʈ " + roomno + "ȣ �� " + appname + "�� ����� ����Ǿ����ϴ�. ");
				this.appShow();
			} else {
				System.out.print("����� ������ǰ�� �귣�带 �Է��ϼ���>> ");
				String change = sc.nextLine();
				System.out.print("������ȿ����� �Է� >> ");
				energy = Integer.parseInt(sc.nextLine());
				System.out.print("��� �Ϸ������·� �Է� >>");
				power = Integer.parseInt(sc.nextLine());
				System.out.print("���ų⵵ �Է� >> ");
				purchase = sc.nextLine();
				
				msg = "update APPLIANCES set appbrand = ? , purchaseyear =? ,  energygrade = ? ,powerofday = ?  "+
						"where roomno = ? and aptno= ? and appname = ? ";
				PST = CN.prepareStatement(msg);
				PST.setString(1, change);
				PST.setString(2, purchase);
				PST.setInt(3, energy);
				PST.setInt(4, power);
				PST.setInt(5, roomno);
				PST.setInt(6, aptno);
				PST.setString(7, appname);
				int OK = PST.executeUpdate();// ��¥ ���� ó��
				if (OK > 0) {
					System.out.println(aptNameA + "����Ʈ " + roomno + "ȣ �� " + appname + "�� ����� ����Ǿ����ϴ�. ");
					this.appShow();
				}
				
			}
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}

	}

	@Override
	public int appCountAll() {
		try {
			msg = "select count(*) as cnt from appliances";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
		} catch (Exception e) {
		}
		return Gtotal;

	}
	
	@Override
	public void hoSearch() {
		try {
			ck=0;
			while(true) {
				System.out.print("�˻��� ����Ʈ ���� �Է��ϼ��� >> ");
				aptNameA = sc.nextLine();
				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				else if(ck==0) {this.appShow();}
				break;
			}
		}catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}
	public void appShow() {
		try {

			msg2 = "select count(*) as cnt from APPLIANCES where roomno= " + roomno + " and aptno = " + aptno;
			RS = ST.executeQuery(msg2);
			RS.next();
			int c = RS.getInt("cnt");
			System.out.println(aptNameA + "����Ʈ " + roomno + "ȣ �� ��ϵ� ������ǰ�� " + c + " �� �Դϴ�.");
			System.out.println("------------------------------------------");
			System.out.println("������ǰ��\t �귣�� \t ���ų⵵");
			msg = "select appname, appbrand, PURCHASEYEAR from APPLIANCES where roomno= " + roomno + " and aptno = "
					+ aptno+ "order by appname ";
			RS = ST.executeQuery(msg);
			while (RS.next() == true) {
				String a = RS.getString("appname");
				String b = RS.getString("appbrand");
				String y = RS.getString("PURCHASEYEAR");
				System.out.println(a + "\t" + b + "\t" + y);
			}
		} catch (Exception ex) {
			System.out.println("�������� " + ex);
		}
	}

}
