package net.bit.day14;
import java.util.*;
public class TestList {
	public static void main(String[] args) {

		// �Խ��� �۾���, ����, ��ȸ , �ۿø� ��¥ X5
		ArrayList list = new ArrayList();
		String nick = new String("nick");
		
		Integer age = new Integer(27);
//		int age = new int(27); //����
//		int[] su = new int[27];//�迭
		Boolean gender = new Boolean(true);
		Double  avg = new Double(3.14);
		
		list.add(nick);
		list.add(new String("nick"));
		list.add(age);
		list.add(new Integer(27));
		list.add(gender);
		list.add(new Boolean(true));
		list.add(avg);
		list.add(new Double(3.14));
		//����ȥ���׸��� �����ͳ����� Vector����ȭ,ArrayList�񵿱�ȭ
		//�׸��߰� add(), get(��ġ), size()
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		
	}
}
