package net.bit.common;

import java.util.ArrayList;

public class GuestDAO { // DTO=VO= �����͸� �ڽ����·� ����
	public void dbDisplay(ArrayList<GuestDTO> list) {
		System.out.println("�ݺ����� ����");
		System.out.println("-----------------------");
		for(int i = 0 ; i<list.size();i++) {
			GuestDTO gg = (GuestDTO)list.get(i);
//			System.out.println((GuestDTO)list.get(i));
			System.out.print(gg.getName()+"  "+gg.getAge()+"  "+gg.getPoint()+"\n");
//			System.out.println(gg.getAge());
//			System.out.println(gg.getPoint());
			System.out.println("-----------------------");
		}
		System.out.println("--------------------");
		System.out.println("�ݺ��� �ع�");
		for (GuestDTO dt : list) {
			System.out.print(dt.getName()+"  ");
			System.out.print(dt.getAge()+"  ");
			System.out.println(dt.getPoint());
		}
	}//end
	
	

}//class END
