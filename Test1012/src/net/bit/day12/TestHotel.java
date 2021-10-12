package net.bit.day12;

import java.util.*;

public class TestHotel {
	public int floor; //층
	public int room;  //호 
	public static String[ ][ ] name = new String[3][5]; //투숙객 이름
	public static String title = "가지마" , ip = "입실", ti = "퇴실";
	
	
	public TestHotel() {
		//기본생성자생략가능함 
	}//end
	
	public static  void checkOut(){
		Scanner sc = new Scanner(System.in);
		
	} //end
	
	public static void showStatus(){
		System.out.println("\n\t\t["+title+"호텔의 투숙상태] \t\t");
		
		for(int i=0; i<name.length; i++){
			for(int j=0; j<name[i].length; j++){
				if(name[i][j] == null){
					System.out.print(""+ (i+1) +"0" + (j+1) + "호" + " □\t" + "\t");
				}else{
					System.out.print(""+ (i+1) +"0" + (j+1) + "호" + " ■\t" + name[i][j] + "\t");
				}
			}//j end
			System.out.println();
		}//i end
	} //showStatus() end
	
	public static void list(){
		System.out.println("\n\t\t******* list함수  *********");
		
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
			System.out.print("1.투숙 2.퇴실 3.list 4.showStatus 9.종료 >>>");
			fnum = Integer.parseInt(sc.nextLine());
			if(fnum == 9) {showStatus();break;}
			else if (fnum == 1) {
				checkin();// 체크인
			}else if (fnum == 2) {
				checkout();// 체크아웃
			}else if(fnum == 3) {list();}
			else if(fnum==4) {showStatus();}
			else {System.out.println("숫자가 이상합니다");continue;}
			}catch(Exception ex) {System.out.println("잘못 입력하였습니다.");num();}
		}
	}
	public static void checkout() {
		Scanner sc = new Scanner(System.in);
		int row,col;
		String gName;
		while(true) {
			try {
				System.out.print(">몇층에 "+ti+"?");
				row = Integer.parseInt(sc.nextLine());
				if(row>=1 && row <=3) {
//					System.out.println(row);
					System.out.print(">몇호에 "+ti+"?");
					col = Integer.parseInt(sc.nextLine());
					if(col>=1 && col<=5) {
						if(name[row-1][col-1]!=null) {
							System.out.println("#"+name[row-1][col-1]+" 성공적으로 퇴실하였습니다.");
							name[row-1][col-1]=null;
							break;
						}
						else if(name[row-1][col-1]==null){
							System.out.println("이미 방이 비어있습니다.");
							break;
						}
					}else if(col == 0) {num();
					}else if(col<1 ||col >5) {
						System.out.println("호 입력이 잘못되었습니다. 0번 누를시 처음으로");}
					
				}
				else if(row==0) {num();}
				else if (row<1 ||row >3 ){
					System.out.println("층 입력이 잘못되었습니다. 0번 누를시 처음으로");}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다.");num();
				
			}
		}//while end
	}
	public static void checkin() {
		Scanner sc = new Scanner(System.in);
		int row,col;
		String gName;
		while(true) {
			try {
				System.out.print(">몇층에 "+ip+"?");
				row = Integer.parseInt(sc.nextLine());
				if(row>=1 && row <=3) {
					System.out.print(">몇호에 "+ip+"?");
					col = Integer.parseInt(sc.nextLine());
					if(col>=1 && col<=5) {
						if(name[row-1][col-1]!=null) {
							System.out.println("이미 예약중");break;
						}
						else {
							System.out.println("> 고객님 이름? ");
							name[row-1][col-1] = sc.nextLine();
							System.out.println("#"+name[row-1][col-1]+" 성공적으로 입실하였습니다.");
							break;
						}
					}else if(col<1 ||col >5) {
						System.out.println("호 입력이 잘못되었습니다. 0번 누를시 처음으로");}
					else if(col==0) {num();}
				}
				else if(row==0) {num();}
				else if (row<1 ||row >3 ){
					System.out.println("층 입력이 잘못되었습니다. 0번 누를시 처음으로");}
			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다.");num();
			}
		}//while end
	}
	
	public static void main(String[] args) {
	   num();
	}//end
}//TestHotel class END
