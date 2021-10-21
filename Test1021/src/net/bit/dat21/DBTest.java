package net.bit.dat21;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 졸려 !!!");
		try {
			TestDAO dao = new TestDAO();
			dao.dbSelectAll();
			
			while (true) {
				System.out.print("1.신규등록  2.전체 출력  3.삭제 4.수정  5.이름검색  9.종료 >>>");
				int sel = Integer.parseInt(sc.nextLine());
				if (sel == 9) {System.out.println("test 데이블 crud 처리를 종료합니다.");System.exit(1);} 
				
				else if (sel == 1) {dao.dbInsert();}
				else if (sel == 2) {dao.dbSelectAll();} 
				else if (sel == 3) {dao.dbDelete();}
				else if (sel == 4) {dao.dbUpdate();} 
				else if (sel == 5) {
					System.out.print("\n이름검색 키워들 입력하세요 ");
					String find = sc.nextLine();
					dao.dbNameSearch(find);
				} 
				else if(sel==9){break;}
			    else{	 
			      	 System.out.println("test테이블 crud처리를 종료합니다"); 
			      	 System.exit(1);
		       }
			}
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// main end
}
// class END