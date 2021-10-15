package net.bit.day15;
import java.text.DecimalFormat;
public class Restaurant {
	public static void main(String[] args) {
	    // 주문을 위한 메뉴 선정
	    Menu pizza = new Menu("치즈",  4600);
	    Menu steak = new Menu("T본",  8900);
	    Menu col = new Menu("콜라", 250);
	    
	    // 메뉴를 조합하여 주문을 생성
	    Menu[] menuArr = { pizza, steak, col };
	    Order order = new Order(123, menuArr);
	    
	    // 주문 결과 출력
	    System.out.println("주문 합계 : " + order.totalPrice() +"원");
	  }//end

}//Restaurant class END

class Menu {
	  // 필드
	  String name;
	  int price;
	  // 생성자
	  public Menu(String str, int i) {
	    name = str;
	    price = i;
	    System.out.println(this.name + "메뉴  "+price +"원 주문하셨습니다");
	  }
}//Menu class END

class Order {
	  // 필드(인스턴스 필드)
	  int tot=0;
	  int orderNum;
	  Menu[] menus;
	  
	  // 생성자
	  public Order(int i, Menu[] arr) {
	    orderNum = i;
	    menus = arr;
	  }
	  
	  public int totalPrice() { //Order order = new Order(123, menuArr);
		 System.out.println();
		 DecimalFormat df=new DecimalFormat("##,###");
		 System.out.println("합계 결과 : " +df.format(13750)+"원");
		 for(int i=0;i<menus.length; i++) {
		    tot = tot + menus[i].price;
		  }
	    return tot;
	  }//end
} //Order class END