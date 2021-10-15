package net.bit.day15;
import java.text.DecimalFormat;
public class Restaurant {
	public static void main(String[] args) {
	    // �ֹ��� ���� �޴� ����
	    Menu pizza = new Menu("ġ��",  4600);
	    Menu steak = new Menu("T��",  8900);
	    Menu col = new Menu("�ݶ�", 250);
	    
	    // �޴��� �����Ͽ� �ֹ��� ����
	    Menu[] menuArr = { pizza, steak, col };
	    Order order = new Order(123, menuArr);
	    
	    // �ֹ� ��� ���
	    System.out.println("�ֹ� �հ� : " + order.totalPrice() +"��");
	  }//end

}//Restaurant class END

class Menu {
	  // �ʵ�
	  String name;
	  int price;
	  // ������
	  public Menu(String str, int i) {
	    name = str;
	    price = i;
	    System.out.println(this.name + "�޴�  "+price +"�� �ֹ��ϼ̽��ϴ�");
	  }
}//Menu class END

class Order {
	  // �ʵ�(�ν��Ͻ� �ʵ�)
	  int tot=0;
	  int orderNum;
	  Menu[] menus;
	  
	  // ������
	  public Order(int i, Menu[] arr) {
	    orderNum = i;
	    menus = arr;
	  }
	  
	  public int totalPrice() { //Order order = new Order(123, menuArr);
		 System.out.println();
		 DecimalFormat df=new DecimalFormat("##,###");
		 System.out.println("�հ� ��� : " +df.format(13750)+"��");
		 for(int i=0;i<menus.length; i++) {
		    tot = tot + menus[i].price;
		  }
	    return tot;
	  }//end
} //Order class END