package net.bit.day19;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class DBTest {
   public static void main(String[] args) {
       Connection CN = null ; //DB�����ּҹ� id,pwd ������ CN����ϰ� ��ɾ�����Ҷ� ���� 
       Statement ST = null ;  //�����θ�ɾ�
       ResultSet RS = null ;  //��ȸ�Ѱ����� RS = ST.executeQuery("select"); while(RS.next()){ }
       String msg="insert,delete,update,select" ;
       int  codeA=0, hitD=79;
       String nameB="";
       
     try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
       CN=DriverManager.getConnection(url, "system", "1234");
       //System.out.println("����ŬDB�������Ἲ�� 10:47 10:49");
       
       ST = CN.createStatement(); //  ��ɾ� �ѹ� ������ ��Ȱ�� 
       msg = "select code,name,wdate,hit from test order by code" ;
       RS = ST.executeQuery(msg); //��ȸ�Ѱ�� ��ü�� RS���
       
       System.out.println("�ڵ�\t �̸�\t ��¥\t��ȸ��");
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
     
       //�ڵ�,�̸� �Է��ϰ� ��¥�ϰ�hit�⺻������
       Scanner sc = new Scanner(System.in);
       System.out.print("�ڵ�code�Է� >>> ");
       codeA = Integer.parseInt(sc.nextLine());
       
       System.out.print("�̸�name�Է� >>> ");
       nameB = sc.nextLine();
       
       //msg ="insert into test(code,name,wdate,hit) values( 2200, 'lee', sysdate, 79)";
       msg ="insert into test(code,name,wdate,hit) values( "+codeA+", '"+nameB+"', sysdate, "+hitD+")";
       System.out.println(msg);
       int OK = ST.executeUpdate(msg); // ��¥ ����
       if(OK>0) {
    	   System.out.println(codeA +"������ ���� �����߽��ϴ�.");
       }else { System.out.println(codeA +"������ ���� �����߽��ϴ�.");}
       // �ٽ� �ѹ� ��ü ���
       msg = "select code,name,wdate,hit from test order by code" ;
       RS = ST.executeQuery(msg); //��ȸ�Ѱ�� ��ü�� RS���
       System.out.println("\n�ڵ�\t �̸�\t ��¥\t��ȸ��");
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
       
     }catch (Exception ex) {System.out.println("�������� " + ex);}
   }//end
   
}//class END