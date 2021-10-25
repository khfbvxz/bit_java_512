package myhomepower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class HomeDAO implements DAOinterface {
	private Connection CN = null; // DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조
	private Statement ST = null; // 정적인명령어
	private PreparedStatement PST = null; // 동적인 명령어 2021-10-21-목요일
	private ResultSet RS = null; // 조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
	private String msg, msg2, aptNameA, aptloc, appname, appbrand, purchase;
	private int Gtotal, aptno, roomno, energy, power, showno, ck;
	Scanner sc = new Scanner(System.in);

	public HomeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");
			ST = CN.createStatement();
		} catch (Exception e) {
			System.out.println("DB서버 연결 실패 " + e.toString());
		}
	}// 생성자 end

	@Override
	public void appAllShow() {
		try {
//			msg = "select count(*) as cnt from appliances";
//			RS = ST.executeQuery(msg);
//			RS.next();
//			Gtotal = RS.getInt("cnt");
			System.out.println("\t\t전체레코드갯수 : " + appCountAll());

			System.out.println("아파트명\t\t 호\t 가전제품\t 브랜드\t 구매년도\t ");
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
			System.out.println("에러이유 " + ex);
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
						System.out.print(count + "번째 지역 : " + lo + "  ");
						count++;
					}
					System.out.print("\n아파트의 지역을 입력하세요");
					aptloc = sc.nextLine();
					msg = "select count(*) as cn from apartment where loc = '" + aptloc + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == true) { // 함수로 쪼개야됨..
						int total2 = RS.getInt("cn");
						if (total2 == 0) {
							System.out.println("그 지역에 아파트가 존재하지 않습니다.");
							ck = 1;
						}
					}
					System.out.print("호수를 입력하세요 >> ");
					roomno = Integer.parseInt(sc.nextLine());
					msg = "select DISTINCT roomno from APPLIANCES, APARTMENT where roomno=" + roomno + " and loc = '"
							+ aptloc + "' and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == false) {
						System.out.println("호수가 존재하지 않습니다. ");
						ck=1;
					}else {ck=0;}
					
					msg = "select aptno from APARTMENT where loc = '" + aptloc + "' and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					RS.next();
					aptno = RS.getInt("aptno");
				} else if (aptNC == 1) {
					System.out.print("호수를 입력하세요 >> ");
					roomno = Integer.parseInt(sc.nextLine());
					msg = "select DISTINCT roomno from APPLIANCES, APARTMENT where roomno=" + roomno+" and aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					if (RS.next() == false) {
						System.out.println("호수가 존재하지 않습니다.  ");
						ck=1;
					}else {ck=0;}
					
					msg = "select aptno from APARTMENT where aptName = '" + aptName + "'";
					RS = ST.executeQuery(msg);
					RS.next();
					aptno = RS.getInt("aptno");

				} else if (aptNC == 0) {
					System.out.println("등록된 아파트가 없습니다.");
					ck = 1;
				}
			}

		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}

	}

	@Override
	public void appInsert() {
		try {

			while (true) {
				System.out.print("아파트이름입력>>");
				aptNameA = sc.nextLine();

				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
			System.out.print("가전제품 이름 입력 >> ");
			appname = sc.nextLine();
			System.out.print("브랜드 입력 >> ");
			appbrand = sc.nextLine();
			System.out.print("에너지효율등급 입력 >> ");
			energy = Integer.parseInt(sc.nextLine());
			System.out.print("평균 하루사용전력량 입력 >>");
			power = Integer.parseInt(sc.nextLine());
			System.out.print("구매년도 입력 >> ");
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
				System.out.println(aptNameA + "아파트 " + roomno + "호 에 " + appname + "을 등록하였습니다.");
				this.appShow();
			}

		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}

	}

	@Override
	public void appDelete() {
		try {
//			System.out.print("아파트 명 입력 >> ");
//			aptNameA = sc.nextLine();
			while (true) {
				System.out.print("(삭제)아파트 이름 입력>>");
				aptNameA = sc.nextLine();
//				int a = 
				aptNameCheck(aptNameA);
				if (ck == 1) {
					return;
				}
				break;
			}
			System.out.print("삭제할 가전제품 입력 >> ");
			appname = sc.nextLine();
			msg = "select count(*) cnt from APPLIANCES where roomno =" + roomno + " and aptno = " + aptno
					+ "and appName ='" + appname + "'";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
			if (Gtotal == 0) {
				System.out.println(appname + "은 등록되어 있지 않습니다.");
				return;
			} else if (Gtotal > 1) {
				System.out.print("삭제할 가전제품의 브랜드를 입력하세요>> ");
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
				System.out.println(aptNameA + "아파트 " + roomno + "호 의 " + appname + "의 기록이 삭제되었습니다. ");
				this.appShow();
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

	}

	@Override
	public void appUpdate() {
		// TODO Auto-generated method stub

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
				System.out.print("검색할 아파트 명을 입력하세요");
				aptNameA = sc.nextLine();
				aptNameCheck(aptNameA);
				if (ck == 1) {
//					System.out.println(ck);
					return;
				}
				else if(ck==0) {this.appShow();}
				break;
			}
		}catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}
	public void appShow() {
		try {

			msg2 = "select count(*) as cnt from APPLIANCES where roomno= " + roomno + " and aptno = " + aptno;
			RS = ST.executeQuery(msg2);
			RS.next();
			int c = RS.getInt("cnt");
			System.out.println(aptNameA + "아파트 " + roomno + "호 에 등록된 가전제품은 " + c + " 개 입니다.");
			System.out.println("------------------------------------------");
			System.out.println("가전제품명\t 브랜드 \t 구매년도");
			msg = "select appname, appbrand, PURCHASEYEAR from APPLIANCES where roomno= " + roomno + " and aptno = "
					+ aptno;
			RS = ST.executeQuery(msg);
			while (RS.next() == true) {
				String a = RS.getString("appname");
				String b = RS.getString("appbrand");
				String y = RS.getString("PURCHASEYEAR");
				System.out.println(a + "\t" + b + "\t" + y);
			}
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}

}
