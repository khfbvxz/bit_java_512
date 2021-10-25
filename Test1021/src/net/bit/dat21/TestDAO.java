package net.bit.dat21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class TestDAO implements Test {
	private Connection CN = null; // DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조
	private Statement ST = null; // 정적인명령어
	private PreparedStatement PST = null; // 동적인 명령어 2021-10-21-목요일
	private ResultSet RS = null; // 조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
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
			System.out.println("DB서버 연결 실패 "+ e.toString());
		}
	}// 생성자 end 
	
	
	public void coffee() {
		System.out.println("점심시간이후 커피");
	}//end


	@Override
	public void dbSelectCode(int find) {
		try {
//	    	msg="";
//	    	System.out.println("\t\t전체레코드갯수:"+ dbCountAll());
			msg = "select code,name,wdate,hit from test  where code = " +  find ; 
			RS = ST.executeQuery(msg); // 조회한결과 전체를 RS기억
			System.out.println("코드\t 이름\t 날짜\t조회수");
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
			System.out.println("에러이유 " + ex);
		}
		
	}


	@Override
	public void dbNameSearch(String find) {
		try {
			int data = dbCountName(find);
			if (data == 0) {
				System.out.println(find + " 검색 결과가 존재하지 않습니다.\n");
				return; // 아래 문장 처리 안하고 함수 탈출
			}
			System.out.println("\t\t전체레코드갯수 : " + data);
			System.out.println("-------------------------------");
			msg = "select * from test where name like '%" + find + "%' order by code "; // 조회결과가 나오고, 조회레코드갯수 출력
			RS = ST.executeQuery(msg);
			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
			}
//			System.out.println("쿼리문장 " + msg);
			// while반복문 출력
			System.out.println();
		} catch (Exception e) {
			System.out.println("이름조회 실패 " + e.toString());
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
			System.out.print("수정할 코드를 입력하세요>>");
			codeA = Integer.parseInt(sc.nextLine());
			msg = "select count(*) as cnt from test where code = " + codeA;
			RS = ST.executeQuery(msg);
			if (RS.next() == true) { Gtotal = RS.getInt("cnt");}
			if (Gtotal == 0) {
				System.out.println(codeA + " 코드데이터가 존재하지 않습니다. \n수정처리데이터가 불가합니다.\n ");
				return;
			}
			System.out.print(codeA +" 의 PST수정할  이름를 입력하세요>>");
			nameB = sc.nextLine();
			System.out.print(codeA +" 의 PST수정할 조회수를 입력하세요>>");
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
				System.out.println(codeA + "  데이터 PST 변경 성공했습니다");
				this.dbSelectAll();
			}else {
				System.out.println(codeA + " 데이터 PST 저장 실패했습니다");
			}	
		} catch (Exception ex) {
			System.out.println("PST 수정갱신작업 실패 에러  " + ex.toString());
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
			System.out.print("삭제코드code입력 >>> ");
			codeA = Integer.parseInt(sc.nextLine());
			msg = "select count(*) as cnt from test where code = " + codeA;
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}
			if (Gtotal == 0) {
				System.out.println(codeA + " 코드데이터 존재하지 않습니다\n");
				return;
			}
			msg = "delete from test where code = " + codeA;
			ST.executeUpdate(msg); // 진짜삭제처리
			System.out.println(codeA + " 코드데이터 삭제 성공했습니다\n");
			dbSelectAll(); // 전체조회메소드를 호출
		} catch (Exception e) {
			System.out.println(codeA + " 코드데이터 삭제 실패했습니다");
		}
		
	}// delete end


	@Override
	public void dbInsert() {
		try {
//			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("코드code입력 >>> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int total = RS.getInt("cnt");
					if (total > 0) {
						System.out.println(codeA + " 데이터는 중복된 데이터입니다\n ");
						continue;
					}
					break;
				}
			} // while end
			System.out.print("이름name입력 >>> ");
			nameB = sc.nextLine();
			System.out.print("조회 hit 입력 >>> ");
			hitD = Integer.parseInt(sc.nextLine());
			
//			msg = "insert into test(code,name,wdate,hit) values(" + codeA + ",'" + nameB + "', sysdate," + hitD + ")";
//			int OK = ST.executeUpdate(msg); // 진짜실행
			msg = "insert into test(code,name,wdate,hit) values(? , ? , sysdate, ?)";
			//데이터 매칭
			PST = CN.prepareStatement(msg);
				PST.setInt(1, codeA);  // 첫번째 물음표
				PST.setString(2, nameB);
//				PST.setDate(3, sysdate);
				PST.setInt(3, hitD);
			int OK = PST.executeUpdate();// 진짜 저장 처리
			
			if (OK > 0) {
				System.out.println(codeA + " 데이터저장 성공했습니다");
				this.dbSelectAll();
			}
		} catch (Exception ex) {System.out.println("에러이유 " + ex);}
	}// dbInsert() end


	@Override
	public void dbSelectAll() {
		try {
			msg = "select count(*) as cnt from test";
			RS = ST.executeQuery(msg);
			RS.next();
			Gtotal = RS.getInt("cnt");
			System.out.println("\t\t전체레코드갯수 : " + dbCountAll());

			msg = "select code,name,wdate,hit from test order by code asc";
			RS = ST.executeQuery(msg); // 조회한결과 전체를 RS기억

			System.out.println("\n코드\t 이름\t 날짜\t\t조회수");
			System.out.println("-----------------------------------");

			while (RS.next() == true) {
				int a = RS.getInt("code");
				String b = RS.getString("name");
				Date c = RS.getDate("wdate");
				int d = RS.getInt("hit");
				System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
			}

		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
		
	}//dbSelectAll() end 
}// class
