package net.bitcamp.guest;

public class GuestDTO { //GuestVO.java=�ڹٹ���/�ڹٹ���,  �ڹٹ���/��jsp���� ����
  private int code;
  private String title;
  private int pay;
  private String email;
  private int rn; //���ȣ rownum=rn
  
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
