package net.bit.day14.member;

public class MemberVO {
	private String name;  // 이름
	private int age; 	  // 나이
	private String email; // 이메일 
//10  MemberVO a = new MemberVO("가나다",10,"aa@na.com")
	public MemberVO( String name, int age,  String email) {
		super(); //  
		this.name = name;   // this.name 객체 멤버  = 매개변수 
		this.age = age;
		this.email = email;
	}
		public int getAge() {
			return age; // 그 값을 보고싶을떄  a.getAge(); 
		}
		public void setAge(int age) {  // a.setAge(30) 10 ->30 
			this.age = age; //수정할떄 
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
			//return  "이름=" + name + ", 나이=" + age +  ", email=" + email +"," ;
			return  name+"," + age +  "," + email +",\n" ;
		}
}//class END



