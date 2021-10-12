package net.bit.day12;

import java.util.*;

public class TestHotelgan {
	public int floor; //층
	public int room;  //호 
	public static String[ ][ ] name = new String[3][5]; //투숙객 이름
	public static String title = "가지마" , ip = "입실", ti = "퇴실";
	
	
	public TestHotelgan() {
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
	      title="부다페스트호텔";
	      System.out.println("\t\t[ "+ title +" 투숙 상태 ]");
	      for(int i = 0; i < 3; i++){
	            for(int b = 0; b < 5; b++){
	               System.out.print((i+1)+"0"+(b+1)+"\t");
	            }
	            System.out.println(); //이름표시 공백란입니다
	            for(int j = 0; j < 5; j++){
	               if(name[i][j] == null){
	                  System.out.print("\t");
	                  continue;
	               }//if end
	               System.out.print(name[i][j]+"\t"); //권장 \t있으면 훨씬 좋아요  hong Tab키 LEE 
	               //System.out.print(this.name[i][j]);  위의 코드보다 \t없으면  hongLEE 
	            }//j end
	            System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); 
	      }//for i end
	   } //list() end


	
	public static void main(String[] args) {
//	   num();
		list();
		
	}//end
}//TestHotel class END
