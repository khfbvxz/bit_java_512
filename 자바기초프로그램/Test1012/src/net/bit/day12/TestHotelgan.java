package net.bit.day12;

import java.util.*;

public class TestHotelgan {
	public int floor; //��
	public int room;  //ȣ 
	public static String[ ][ ] name = new String[3][5]; //������ �̸�
	public static String title = "������" , ip = "�Խ�", ti = "���";
	
	
	public TestHotelgan() {
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
	      title="�δ��佺Ʈȣ��";
	      System.out.println("\t\t[ "+ title +" ���� ���� ]");
	      for(int i = 0; i < 3; i++){
	            for(int b = 0; b < 5; b++){
	               System.out.print((i+1)+"0"+(b+1)+"\t");
	            }
	            System.out.println(); //�̸�ǥ�� ������Դϴ�
	            for(int j = 0; j < 5; j++){
	               if(name[i][j] == null){
	                  System.out.print("\t");
	                  continue;
	               }//if end
	               System.out.print(name[i][j]+"\t"); //���� \t������ �ξ� ���ƿ�  hong TabŰ LEE 
	               //System.out.print(this.name[i][j]);  ���� �ڵ庸�� \t������  hongLEE 
	            }//j end
	            System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�"); 
	      }//for i end
	   } //list() end


	
	public static void main(String[] args) {
//	   num();
		list();
		
	}//end
}//TestHotel class END
