package net.bit.dat07;

public class Test07char {
	public static void main(String[] args) {
		// int , char ���� ��ȯ
		// �̱�ǥ����ȸ �ƽ�Ű�ڵ� ����
		
//		char a ='A', b = '1', c=57		;
		char a ='a', b = 'z', c=57		;
		System.out.println(a+"\t"+b+"\t"+c);
		
		System.out.println();
		int x = (int)a;
		int y = (int)b;
		int z = (int)c;
		System.out.println(x+"\t"+y+"\t"+z);
		
		int su=57; // ���� ��
		System.out.print("su=" + su + "\t");
		System.out.println("su=" + (char)su );
		// ǥ�� Ÿ�� = primitiveŸ�� int , double, char , boolean  ...
		
	}
}
