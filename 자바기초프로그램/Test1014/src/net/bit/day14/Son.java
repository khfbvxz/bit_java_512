package net.bit.day14;

public class Son extends Father implements Board,Guest{
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
	
	@Override
	public boolean boardInsert() {
		return false;
	}
	@Override
	public void boardDelete(int code) {}
	@Override
	public void boardList() {}
	@Override
	public int getCount() {return 0;}
	@Override
	public void guestUpdate() {
	
	}//end 
	
}//class end
