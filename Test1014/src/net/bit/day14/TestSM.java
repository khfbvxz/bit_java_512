package net.bit.day14;
import java.util.*;
public class TestSM {
	public static void main(String[] args) {
		int a = 85; // ���࿡ 60 �� �����Ͱ� �ʿ��ϸ� ������ 60�� ����
		int[] b = new int[60]; // b[0]~b[59] �迭�� ���� ����Ÿ��, ũ�����
//		b[0]="ad" // ����
		
		// �Խ��� �۾���, ����, ��ȸ , �ۿø� ��¥ X5
		ArrayList list = new ArrayList();

		
		Boolean gender = new Boolean(true);
		Double avg = new Double(3.14);
		
		list.add("sky");  // Ÿ���� �����ּ���
		list.add(27);
		list.add(true);
		list.add("��Ʈ");
		//���� ȥ�� �׸��� ������ ������ Vector ����ȭ ( ���ſ� ����)  , ArrayList �񵿱�ȭ()
		// �׸� �߰� add() get(��ġ), size()
		for(int i=0 ; i<list.size(); i++) {
			System.out.print(list.get(i)+ "  ");
		}
		
	}
}
