package net.bit.day14.member;

public class MemberVO {
	private String name;  // �̸�
	private int age; 	  // ����
	private String email; // �̸��� 
//10  MemberVO a = new MemberVO("������",10,"aa@na.com")
	public MemberVO( String name, int age,  String email) {
		super(); //  
		this.name = name;   // this.name ��ü ���  = �Ű����� 
		this.age = age;
		this.email = email;
	}
		public int getAge() {
			return age; // �� ���� ���������  a.getAge(); 
		}
		public void setAge(int age) {  // a.setAge(30) 10 ->30 
			this.age = age; //�����ҋ� 
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			//return  "�̸�=" + name + ", ����=" + age +  ", email=" + email +"," ;
			return  name+"," + age +  "," + email +",\n" ;
		}
}//class END



