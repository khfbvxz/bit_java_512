package net.bit.day19;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {

	private Connection CN = null; // DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조
	private Statement ST = null; // 정적인명령어
	private ResultSet RS = null; // 조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
	private String msg, Gmsg, nameB;
	private int Gtotal, codeA, hitD;
	Scanner sc = new Scanner(System.in);

	public DBTest() {
		try {
			CN = DB.getConnection();
			ST = CN.createStatement();
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// 기본 생성자.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			DBTest ob = new DBTest();
			ob.dbSelectAll();
//			ob.dbInsert();
			while (true) {
				System.out.print("1.신규등록  2.전체 출력  3.삭제 4.수정  5.이름검색  9.종료 >>>");
				int sel = Integer.parseInt(sc.nextLine());

				if (sel == 9) {
					System.out.println("test 데이블 crud 처리를 종료합니다.");
					System.exit(1);
				} else if (sel == 1) {
					ob.dbInsert();
				} else if (sel == 2) {
					ob.dbSelectAll();
				} else if (sel == 3) {
					ob.dbDelete();
				} else if (sel == 4) {
					ob.dbUpdate();
				} else if (sel == 5) {
//					System.out.print("\n이름검색 키워들 입력하세요 ");
//					String find = sc.nextLine();
//					ob.dbNameSearch2(find);
					ob.dbNameSearch();
				} else {
					System.out.println("숫자를 제대로 입력하세요");
				}
			}

		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// main end

	public void dbSelectCode(int find) { // non-static 일반메소드
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
	}// end

	public void dbNameSearch2(String find) {
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
	}// end
	
	public int dbCountName(String find ) {
		try {
			msg = "select count(*) as cnt from test where name like '%"+find+"%'";
			RS = ST.executeQuery(msg);
			if (RS.next() == true) {
				Gtotal = RS.getInt("cnt");
			}

		} catch (Exception e) {
		}
		return Gtotal;
	}
	
	public void dbUpdate() {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("수정할 코드를 입략하세요 >> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int total = RS.getInt("cnt");
					if (total == 0) {
						System.out.println(codeA + " 없는 데이터는 데이터입니다\n ");
						continue;
					}
					break;
				}
			} // while
			System.out.print("수정할 이름를 입략하세요 >> ");
			nameB = sc.nextLine();
			msg = "update test set name= '" + nameB + "' where code = " + codeA;
			int OK = ST.executeUpdate(msg); // 진짜실행
//			System.out.println(OK);
			if (OK > 0) {
				System.out.println(codeA + " 데이터 변경 성공했습니다");
				this.dbSelectAll();
			} else {
				System.out.println(codeA + " 데이터저장 실패했습니다");
			}

		} catch (Exception ex) {
			System.out.println("수정갱신작업 실패 에러  " + ex.toString());
		}
	}

	public void dbNameSearch() {
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("검색할 이름을 입력하세요");
				nameB = sc.nextLine();
				msg = "select count(*) as cnt from test where name = '" + nameB + "'";
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					int cnt = RS.getInt("cnt");
					if (cnt == 0) {
						System.out.println("검색할 이름이 존재하지 않습니다.");
						return;
					}
				}
				break;
			}
			msg = "select * from test where name = '" + nameB + "' order by code asc";
			RS = ST.executeQuery(msg);
			this.dbShow(RS);
			int NS = ST.executeUpdate(msg);
			if (NS > 0) {
				System.out.println(nameB + "의 결과 " + NS + "건 검색결과입니다.");
			} else {
				System.out.println("이름이 없습니다.");
			}
		} catch (Exception ex) {
			System.out.println("이름 조회 에러 " + ex.toString());
		}
	}// dbNameSearch() end

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

	public void dbDelete() { // non -static
		// 코드 code 필드 삭제
		try {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("삭제할 code 입력 >>> ");
				codeA = Integer.parseInt(sc.nextLine());
				msg = "select count(*) as cnt from test where code = " + codeA;
				RS = ST.executeQuery(msg);
				if (RS.next() == true) {
					Gtotal = RS.getInt("cnt");
					if (Gtotal == 0) {
						System.out.println(codeA + " 데이터는 없는 데이터입니다\n ");
						continue;
					}
					break;
				}
			}
			msg = "delete from test where code =" + codeA;
//			RS = ST.executeQuery(msg);
			int DL = ST.executeUpdate(msg); // 되면 반환 0
//			System.out.println(DL);
			if (DL > 0) { // code가 없어도 실행됨..
				System.out.println(codeA + "데이터 삭제 성공!");
				this.dbSelectAll();
			} else {
				System.out.println(codeA + "데이터 삭제 실패!");
			}
		} catch (Exception ex) {
			System.out.println("에러이유" + ex);
		}
	}// dbDelete() end

	public void dbDelete2() { // 10-20-수요일아침 non-static
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
	}// end

	public void dbInsert() {
		try {
			Scanner sc = new Scanner(System.in);
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

			msg = "insert into test(code,name,wdate,hit) values(" + codeA + ",'" + nameB + "', sysdate," + hitD + ")";
			int OK = ST.executeUpdate(msg); // 진짜실행
			if (OK > 0) {
				System.out.println(codeA + " 데이터저장 성공했습니다");
				this.dbSelectAll();
			} else {
				System.out.println(codeA + " 데이터저장 실패했습니다");
			}
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// dbInsert() end

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
	}

	public void dbShow(ResultSet RS) {
		System.out.println("\n코드\t 이름\t 날짜\t\t조회수");
		System.out.println("-----------------------------------");
		try {
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
		System.out.println("-------------------------------");
		System.out.println();
	}
}
// class END