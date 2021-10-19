package net.bit.day19;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {
	public static void main(String[] args) {
		Connection CN = null; // DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조
		Statement ST = null; // 정적인명령어
		ResultSet RS = null; // 조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
		String msg = "insert,delete,update,select";
		int codeA = 0, hitD = 79;
		String nameB = "";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");
			ST = CN.createStatement();
			dbSelectAll();

			// 코드,이름 입력하고 날짜하고hit기본값으로
			Scanner sc = new Scanner(System.in);
			// 강사님 
			while(true) {
				System.out.print("코드code입력 >>> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code =" + codeA;
				RS = ST.executeQuery(msg);
				if(RS.next()==true) {
					int total = RS.getInt("cnt");
					if(total>0) {
						System.out.println(codeA+" 데이터는 중복된 데이터입니다.\n ");
						continue;
					}
					break;
				}
			}//while end
//			boolean codecheck = true;
//			while (codecheck) {
//				System.out.print("코드code입력 >>> ");
//				codeA = Integer.parseInt(sc.nextLine());
//				// 코드 중복 체크
//				msg = "select count(*) as cnt from test where code =" + codeA;
//				RS = ST.executeQuery(msg);
//				RS.next();
////	       System.out.println(RS.next());
//				int a = 0;
//				a = RS.getInt("cnt");
//				System.out.println("a  " + a);
//				if (a == 1) {
//					System.out.println("코드가 중복되었습니다.1");
//					System.out.println("다시 입력하세요");
//					codecheck = true;
//				} else {
//					System.out.println("중복이 없습니다.");
//					codecheck = false;
//				}
//			}

			System.out.print("이름name입력 >>> ");
			nameB = sc.nextLine();

			msg = "insert into test(code,name,wdate,hit) values( " + codeA + ", '" + nameB + "', sysdate, " + hitD
					+ ")";
			System.out.println(msg);
			int OK = ST.executeUpdate(msg); // 진짜 실행
			if (OK > 0) {
				System.out.println(codeA + "데이터 저장 성공했습니다.");
			} else {
				System.out.println(codeA + "데이터 저장 실패했습니다.");
			}
			dbSelectAll();
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// main end

	public static void dbSelectAll() {
		// 다시 한번 전체 출력
		Connection CN = null; // DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조
		Statement ST = null; // 정적인명령어
		ResultSet RS = null; // 조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
		String msg = "insert,delete,update,select";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			CN = DriverManager.getConnection(url, "system", "1234");

			ST = CN.createStatement(); // 명령어 한번 생성후 재활용

			msg = "select code,name,wdate,hit from test order by code asc";
			RS = ST.executeQuery(msg); // 조회한결과 전체를 RS기억

			System.out.println("\n코드\t 이름\t 날짜\t조회수");
			System.out.println("-------------------------------");
			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + "c" + "\t" + d);
			}
			System.out.println("-------------------------------");
			System.out.println();
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}
}
// class END