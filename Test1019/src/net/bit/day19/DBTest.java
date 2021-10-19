package net.bit.day19;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {
   public static void main(String[] args) {
       Connection CN = null ; //DB서버주소및 id,pwd 정보를 CN기억하고 명령어생성할때 참조 
       Statement ST = null ;  //정적인명령어
       ResultSet RS = null ;  //조회한결과기억 RS = ST.executeQuery("select"); while(RS.next()){ }
       String msg="insert,delete,update,select" ;
       int  codeA=0, hitD=79;
       String nameB="";
       
     try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
       CN=DriverManager.getConnection(url, "system", "1234");
       //System.out.println("오라클DB서버연결성공 10:47 10:49");
       
       ST = CN.createStatement(); //  명령어 한번 생성후 재활용 
       msg = "select code,name,wdate,hit from test order by code" ;
       RS = ST.executeQuery(msg); //조회한결과 전체를 RS기억
       
       System.out.println("코드\t 이름\t 날짜\t조회수");
       System.out.println("-------------------------------");
       while(RS.next()==true) {
          int a = RS.getInt("code");
          String b = RS.getString("name");
          Date c = RS.getDate("wdate");
          int d = RS.getInt("hit");
          System.out.println(a+"\t"+b+"\t"+"c"+"\t"+d);
       }
       System.out.println("-------------------------------");
       System.out.println();
     
       //코드,이름 입력하고 날짜하고hit기본값으로
       Scanner sc = new Scanner(System.in);
       System.out.print("코드code입력 >>> ");
       codeA = Integer.parseInt(sc.nextLine());
       
       System.out.print("이름name입력 >>> ");
       nameB = sc.nextLine();
       
       //msg ="insert into test(code,name,wdate,hit) values( 2200, 'lee', sysdate, 79)";
       msg ="insert into test(code,name,wdate,hit) values( "+codeA+", '"+nameB+"', sysdate, "+hitD+")";
       System.out.println(msg);
       int OK = ST.executeUpdate(msg); // 진짜 실행
       if(OK>0) {
    	   System.out.println(codeA +"데이터 저장 성공했습니다.");
       }else { System.out.println(codeA +"데이터 저장 실패했습니다.");}
       // 다시 한번 전체 출력
       msg = "select code,name,wdate,hit from test order by code" ;
       RS = ST.executeQuery(msg); //조회한결과 전체를 RS기억
       System.out.println("\n코드\t 이름\t 날짜\t조회수");
       System.out.println("-------------------------------");
       while(RS.next()==true) {
          int a = RS.getInt("code");
          String b = RS.getString("name");
          Date c = RS.getDate("wdate");
          int d = RS.getInt("hit");
          System.out.println(a+"\t"+b+"\t"+"c"+"\t"+d);
       }
       System.out.println("-------------------------------");
       System.out.println();
       
     }catch (Exception ex) {System.out.println("에러이유 " + ex);}
   }//end
   
}//class END