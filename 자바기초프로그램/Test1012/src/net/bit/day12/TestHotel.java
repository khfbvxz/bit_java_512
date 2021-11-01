package net.bit.day12;

import java.util.*;

public class TestHotel {
	public int floor; //��
	public int room;  //ȣ 
	public static String[ ][ ] name = new String[3][5]; //������ �̸�
	public static String title = "������" , ip = "�Խ�", ti = "���";
	
	
	public TestHotel() {
		//�⺻�����ڻ��������� 
	}//end
	
	public static  void checkOut(){
		Scanner sc = new Scanner(System.in);
		
	} //end
	
	public static void showStatus(){
		System.out.println("\n\t\t["+title+"ȣ���� ��������] \t\t");
		
		for(int i=0; i<name.length; i++){
			for(int j=0; j<name[i].length; j++){
				if(name[i][j] == null){
					System.out.print(""+ (i+1) +"0" + (j+1) + "ȣ" + " ��\t" + "\t");
				}else{
					System.out.print(""+ (i+1) +"0" + (j+1) + "ȣ" + " ��\t" + name[i][j] + "\t");
				}
			}//j end
			System.out.println();
		}//i end
	} //showStatus() end
	
	public static void list(){
		System.out.println("\n\t\t******* list�Լ�  *********");
		
		for(int i=0; i<name.length; i++){
			for(int j=0; j<name[i].length; j++){
				System.out.print(""+ (i+1) +"0" + (j+1)  + "\t");
			}//j end
			System.out.println();
			for(int j=0; j<name[i].length; j++){
				if(name[i][j]==null) {System.out.print("\t");}
				else if (name[i][j]!=null) {System.out.print(name[i][j]);}
			}
			System.out.println();
			System.out.print("-----------------------------------------\n");
		}//i end
	} //list() end
	public static void num() {
		Scanner sc = new Scanner(System.in);
		int fnum =0 ;
		while(true) {
			try {
			System.out.print("1.���� 2.��� 3.list 4.showStatus 9.���� >>>");
			fnum = Integer.parseInt(sc.nextLine());
			if(fnum == 9) {showStatus();break;}
			else if (fnum == 1) {
				checkin();// üũ��
			}else if (fnum == 2) {
				checkout();// üũ�ƿ�
			}else if(fnum == 3) {list();}
			else if(fnum==4) {showStatus();}
			else {System.out.println("���ڰ� �̻��մϴ�");continue;}
			}catch(Exception ex) {System.out.println("�߸� �Է��Ͽ����ϴ�.");num();}
		}
	}
	public static void checkout() {
		Scanner sc = new Scanner(System.in);
		int row,col;
		String gName;
		while(true) {
			try {
				System.out.print(">������ "+ti+"?");
				row = Integer.parseInt(sc.nextLine());
				if(row>=1 && row <=3) {
//					System.out.println(row);
					System.out.print(">��ȣ�� "+ti+"?");
					col = Integer.parseInt(sc.nextLine());
					if(col>=1 && col<=5) {
						if(name[row-1][col-1]!=null) {
							System.out.println("#"+name[row-1][col-1]+" ���������� ����Ͽ����ϴ�.");
							name[row-1][col-1]=null;
							break;
						}
						else if(name[row-1][col-1]==null){
							System.out.println("�̹� ���� ����ֽ��ϴ�.");
							break;
						}
					}else if(col == 0) {num();
					}else if(col<1 ||col >5) {
						System.out.println("ȣ �Է��� �߸��Ǿ����ϴ�. 0�� ������ ó������");}
					
				}
				else if(row==0) {num();}
				else if (row<1 ||row >3 ){
					System.out.println("�� �Է��� �߸��Ǿ����ϴ�. 0�� ������ ó������");}
				
			} catch (Exception e) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");num();
				
			}
		}//while end
	}
	public static void checkin() {
		Scanner sc = new Scanner(System.in);
		int row,col;
		String gName;
		while(true) {
			try {
				System.out.print(">������ "+ip+"?");
				row = Integer.parseInt(sc.nextLine());
				if(row>=1 && row <=3) {
					System.out.print(">��ȣ�� "+ip+"?");
					col = Integer.parseInt(sc.nextLine());
					if(col>=1 && col<=5) {
						if(name[row-1][col-1]!=null) {
							System.out.println("�̹� ������");break;
						}
						else {
							System.out.println("> ���� �̸�? ");
							name[row-1][col-1] = sc.nextLine();
							System.out.println("#"+name[row-1][col-1]+" ���������� �Խ��Ͽ����ϴ�.");
							break;
						}
					}else if(col<1 ||col >5) {
						System.out.println("ȣ �Է��� �߸��Ǿ����ϴ�. 0�� ������ ó������");}
					else if(col==0) {num();}
				}
				else if(row==0) {num();}
				else if (row<1 ||row >3 ){
					System.out.println("�� �Է��� �߸��Ǿ����ϴ�. 0�� ������ ó������");}
			} catch (Exception e) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");num();
			}
		}//while end
	}
	
	public static void main(String[] args) {
	   num();
	}//end
}//TestHotel class END
