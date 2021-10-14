package net.bit.day14.member;

public class MemberDTO {
	private String name;
	private int age;
	private String email;

	public MemberDTO( String name, int age,  String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
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
			return  name+"," + age +  "," + email +"," ;
		}
	
}//class END



