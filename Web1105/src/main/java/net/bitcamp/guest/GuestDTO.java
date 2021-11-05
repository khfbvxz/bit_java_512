package net.bitcamp.guest;

public class GuestDTO { //GuestVO.java=자바문서/자바문서,  자바문서/웹jsp문서 연결
  private int code;
  private String title;
  private int pay;
  private String email;
  private int rn; //행번호 rownum=rn
  
	public int getRn() {return rn;	}
	public void setRn(int rn) {this.rn = rn;}
	public int getCode() {return code;	}
	public void setCode(int code) {this.code = code;}
	public String getTitle() {return title;	}
	public void setTitle(String title) {this.title = title;	}
	public int getPay() {	return pay;	}
	public void setPay(int pay) {	this.pay = pay;	}
	public String getEmail() {	return email;	}
	public void setEmail(String email) {this.email = email;}
}//GuestDTO END
