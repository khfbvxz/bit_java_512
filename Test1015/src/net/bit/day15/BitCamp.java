package net.bit.day15;

public class BitCamp {
	private String name="�ڹ�������";
	public static void main(String[] args) {
		BitCamp bc = new BitCamp();
		bc.note();
		// static Ű���尡 �ִ� ������ this ��� �Ұ� 
	}// main end
	
	public void note() { // Non-static �޼ҵ�
		String name = "��Ʈ�е�";
		System.out.println("�������� ����="+this.name);
		System.out.println("�������� ����="+name);
		System.out.println();
		String a = this.book();
		double b = this.save();
//		System.out.println("å���� = " + title);
		System.out.println("å���� = " + a);
//		System.out.println("å���� = " + book());
//		System.out.println("����Ʈ = " + point);
		System.out.println("����Ʈ = " + b);
//		System.out.println("����Ʈ = " + save());
	}//end
	
	public String book(){	// Non-static �޼ҵ�
		String title="�����";
		
		return title;	
	}//end
	
	public double save() {	// Non-static �޼ҵ�
		double point = 7.8;
		return point;
	}
}// class end
