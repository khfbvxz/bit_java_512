package net.bit.day15;

public abstract class Mother {
	// interface �ƴ� class������ �߻�޼ҵ� ���� 
	// �߻�޼ҵ尡 �ϳ��� ������ �ڵ� �߻�Ŭ����
	// �߻�Ŭ���� new Ű���� ��� �Ұ�
	public abstract double notebook() ; // �߻�޼ҵ� 
//	public double notebook() {
//		double avg = 7.8;
//		return avg;
//	}
	
	public static void house() {//static �޼ҵ�
//		System.out.println("static house �޼ҵ�");
	}
	public static void house(String dong) {//static �޼ҵ�
//		System.out.println("static house �޼ҵ�"+dong);
	}
	
	public void bc() {  //�Ϲ� �޼ҵ�
		System.out.println("non-static bc�޼ҵ�");
	}
	public void bc(String com) {  //�Ϲ� �޼ҵ�
		System.out.println("non-static bc�޼ҵ�"+ com);
	}
	public void bc(String com, int year) {  //�Ϲ� �޼ҵ�
		System.out.println("non-static bc�޼ҵ�"+ com+"  "+year);
	}
}// class END
