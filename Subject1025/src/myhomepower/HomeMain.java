package myhomepower;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class HomeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			HomeDAO dao = new HomeDAO();
			dao.appAllShow();  // 얘는 나중에 
			
			while (true) {
				System.out.print("1.가전제품신규등록  2.전체 출력  3.가전제품변경 4.가전제품삭제  5.아파트호수검색  0.종료 >>>");
				int sel = Integer.parseInt(sc.nextLine());
				if(sel==0) {System.out.println("프로그램을 종료합니다."); System.exit(1);}
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
					System.out.println("MyHome프로그램을 종료합니다.");
					System.exit(1);
				}
				
			}
			
		} catch (Exception ex) {
			System.out.println("에러이유 " + ex);
		}
	}// main end
}
