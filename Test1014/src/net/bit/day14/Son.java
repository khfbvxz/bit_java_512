package net.bit.day14;

public class Son extends Father{
	public static void main(String[] args)  {
		System.out.println("Son Ŭ���� main �޼ҵ�");
		Son kim_j = new Son();
		kim_j.study();
		
//		int B = this.bank(); // static ������ this ��� �ȵ�
	}// main end
	
	@Override
	public int bank() {
		int value=0;
		return value;
//		return super.bank();
	}
	
	
	public void study() {
		System.out.println("SonŬ���� study �޼ҵ�");
		System.out.println("�ڹ� ������\n");
		int A = super.bank();
		int B = this.bank();  // this Ű���� ��������
		int C = bank();
		System.out.println("A="+A); // �θ�
		System.out.println("B="+B);
		System.out.println("C="+C);
	}//study end
	
	
	
}//class end
