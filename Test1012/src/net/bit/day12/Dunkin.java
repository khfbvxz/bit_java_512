package net.bit.day12;

public class Dunkin {
	public static void main(String[] args) {
		System.out.println("Dunkin�������� Ŀ�� 10:17�� 10:18 10:19");
		Dunkin.note();
		
		// �޸����� = �ڵ������Լ� main�Լ� 
	}// main end

	public static void note() {
//		����System.out.println("å����="+title);
//		����System.out.println("å����="+m);
//		����System.out.println("����Ʈ="+point);
		String a = book();
		int b = price();
		double c = save();
		System.out.println("å����=" + a); //����
		System.out.println("å����=" + b ); //����
		System.out.println("����Ʈ=" + c); //����

		
	}//note �޼ҵ� end

	public static String book() {  // static �޼ҵ� ���ϰ� String
		String title="�����";
		return title;
	}//book �޼ҵ� end

	public static int price() { // 
		int m = 2700;
		return m;
	}//price �޼ҵ� end
	public static double save() {
		double point = 8.2;
		return point;
	}//save �޼ҵ� end

}
