package net.bit.dat07;

public class HomeWork05 {
	public static void main(String[] args) {
		// startsWith  endsWith indexOf length  substring
		String jumin = "951230-2693485";
		//���� ���� ����  1 ,3 2 4  char ���ϰ� charAt(int)
		//���� ���� ����  String ���ϰ� substring(���� , ��+1)
//		String gender = jumin.substring(7,8);
//		int genderNum = Integer.parseInt(gender);
////		System.out.println(gender);
//		if (genderNum ==1 || genderNum == 3) {
//			System.out.println("�����Դϴ�");
//		}
//		else if(genderNum ==2 || genderNum == 4) {
//			System.out.println("�����Դϴ�");
//		}
//		else 
//			System.out.println("����� �ܰ���~");
		/// ����� Ǯ��
		String info = "";
		char gender = jumin.charAt(7);
		if(gender == '1' || gender =='3') {
			info = "����";
		}else if(gender == '2' || gender == '4') {
			info="����";
		}else {
			System.out.println("���� ǥ�� ����");
			return; //  return ������ �ؿ� ��¹� ���� !
		}
		System.out.println("aa����� ������ "+ info + " �Դϴ�.");
		
		
		String msg = jumin.substring(7,8);
		if(msg.equals("1") || msg.equals("3")) {  // ������ �񱳴� equals()
			info = "man";
		}else if(msg.equals("2") ||msg.equals("4")) {
			info="woman";
		}else {
			System.out.println("���� ǥ�� ����");
			return; //  return ������ �ؿ� ��¹� ���� !
		}
		System.out.println("aa����� ������ "+ info + " �Դϴ�.");
		
		
	} // main end 
} // class end
