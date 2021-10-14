package net.bit.day14;

public class GuestDTO { // lombok = 롬복
	private String name;
	private java.util.Date wdate; // 멤버 필드 4개 멤버 변수 
	private String title;
	private int cnt;
	private double point;
	public String getName() { // 멤버변수 접근 가져올때
		return name;
	}
	public void setName(String name) { // 멤버 변수 접근할때 
		this.name = name;
	}
	public java.util.Date getWdate() {
		return wdate;
	}
	public void setWdate(java.util.Date wdate) {
		this.wdate = wdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
}//class end 
