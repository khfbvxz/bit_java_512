package net.bit.day14;
import java.util.*;
public class TestList2 {
	public static void main(String[] args) {
		
		
		// �Խ��� �۾���, ����, ��ȸ , �ۿø� ��¥ X5
		
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		list.add("nick");  // Ÿ���� �����ּ���
		list.add(new String("nick"));
		list.add(new String("27"));
		list.add(new String("3.14"));
		//���� ȥ�� �׸��� ������ ������ Vector ����ȭ ( ���ſ� ����)  , ArrayList �񵿱�ȭ()
		// �׸� �߰� add() get(��ġ), size()
		for(int i=0 ; i<list.size(); i++) {
			System.out.print(list.get(i)+ "  ");
		}
		
	}
}
