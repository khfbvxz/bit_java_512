package net.bit.day12;

import java.util.*;

public class TestMotel {
	private int floor;
	private int room;
	public static String[ ][ ] name = new String[3][5]; //������ �̸�
	
	public void alertMsg(int num){
		switch(num){
			case 1 : System.out.println("\n!!! ���ڸ� �Է°����մϴ� !!!"); break;
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("!!!! 1 ~ " + num + " ���ڸ� �Է� �����մϴ�. !!!!"); 
				process();break;
			case 6 : System.out.println("!!! �� ���� �̹� �������Դϴ� !!!"); process();break;
			case 7 : System.out.println("!!! �� ���� �̹� ����Դϴ� !!!"); process();break;
			case 9 : System.out.println("\n!!! ���α׷��� �����մϴ� !!!"); break;
		}
	}//end
	
	public int inputCheck(String input, int first, int last){
		int sel = Integer.parseInt(input);
		
		if (sel<first || sel>last ){		//������ ���� ���ڸ� �Է��������
			if(last==4 ) alertMsg(4);		//�ʱ�޴� (1~4)���� ������ ���� ���� �Է��������
			else if(last==3 ) alertMsg(3);	//����	(1~3)���� ������ ���� ���� �Է��������
			else if(last==5 ) alertMsg(5);	//ȣ��(1~5)���� ������ ���� ���� �Է��������
			else return 0;	// 0�� ����
		}
		return sel; //�ùٸ� ���� �Է�������� �Է¹��� ���� �����Ѵ�
	}//end
	
	public void checkIn(){
		Scanner sc = new Scanner(System.in);
		String ro, fl, guestName;
		
		while(true){
			try{
				
				System.out.print(" >������ �Խ�? ");
				fl = sc.nextLine();
				floor = this.inputCheck(fl, 1, 3);
				if (floor == 0) continue; 	// 0 �� �Ѿ�Դٸ� while ������ ���ư� �Է��� �ٽ� �޴´�

				System.out.print(" >��ȣ�� �Խ�? ");
				ro = sc.nextLine();
				room = this.inputCheck(ro, 1, 5);
				if (room == 0) continue;	// 0 �� �Ѿ�Դٸ� while ������ ���ư� �Է��� �ٽ� �޴´�
				
				if (name[floor-1][room-1] != null){	//�̹� �̸��� �ִٸ�(������)
					alertMsg(6);
					continue;								//�Խ����� �ʰ�, �Է��� �ٽù޴´�.
				}else{										
															//�̸��� ���ٸ� checkIn ��Ų��.							
					System.out.print(" >���� �̸�? ");
					guestName = sc.nextLine();
		
					name[floor-1][room-1] = guestName;
	
					System.out.println( guestName + "�� checkIn �Ϸ� �Ǽ̽��ϴ�");
					break;
				}
			}catch(Exception ex){ alertMsg(1);}// int ���������� ���ڰ� ��������� ����ó��										
		} //while end
	} //end
	
	public void checkOut(){
		Scanner sc = new Scanner(System.in);
		String ro, fl, guestName;
		
		while(true){
			try{
				System.out.print(" >�������� ���? ");
				fl = sc.nextLine();
				floor = this.inputCheck(fl, 1, 3);
				if ( floor == 0) continue; 		// 0 �� �Ѿ�Դٸ� �Է��� �ٽ� �޴´�

				System.out.print(" >��ȣ���� ���? ");
				ro = sc.nextLine();
				room = this.inputCheck(ro, 1, 5);
				if ( room == 0) continue;//0�� �Ѿ�Դٸ� �Է��� �ٽ� �޴´�
				
				if ( name[floor-1][room-1] == null){//�濡 �̸��� ���ٸ�..	
					alertMsg(7);					//�̹� ����Դϴ� �޼���
					continue;						//���ó�� �ٽ�
				}else{
					guestName = name[floor-1][room-1];
					name[floor-1][room-1] = null;
					
					System.out.println(guestName + "�� checkOut �Ϸ� �Ǽ̽��ϴ�");
					break;	
				}
			}catch(Exception ex){alertMsg(1);} 
		}//while end
	} //end
	
	public void showStatus(){
		System.out.println("\n\n\t***************  ȣ���� ��������   *****************");
		//��øfor if��
		for(int i=0; i<name.length; i++){
			for(int j=0; j<name[i].length; j++){
				if(name[i][j] == null){
					System.out.print(""+ (i+1) +"0" + (j+1) + "ȣ" + " ��\t" + "\t");
				}else{
					System.out.print(""+ (i+1) +"0" + (j+1) + "ȣ" + " ��\t" + name[i][j] + "\t");
				}
			}
			System.out.println();
		}
	} //end
	
	public void process(){
		Scanner sc = new Scanner(System.in); 
		int sel=0;
		String input;
		
		while(true){
			this.showStatus();//üũ�� ���¸� ������ ���鼭 �Խ����
			try{
				System.out.print("1.����  2.���  3.��ü����  4.���� >>> ");
				input = sc.nextLine();
				sel = this.inputCheck(input, 1, 4);
			}catch(Exception ex){alertMsg(1);} //���ڸ� �Է�
			
			switch(sel){
				case 1: this.checkIn();break;			//üũ��
				case 2: this.checkOut();break;			//üũ�ƿ�
				case 3: this.process();break;			//��Ȳ����
				case 4: alertMsg(9);System.exit(1);	//���α׷��� �����մϴ�.
			}
		} //while end
	}//end
	
	public static void main(String[] args) {
		TestMotel ht = new TestMotel();
		ht.process();//ȣ�ڽý��� ���ø޴� �޼ҵ� ȣ��
	}//end
	
}//TestMotel class END

