package net.bit.day14;

public class GuestDTO { // lombok = �Һ�
	private String name;
	private java.util.Date wdate; // ��� �ʵ� 4�� ��� ���� 
	private String title;
	private int cnt;
	private double point;
	public String getName() { // ������� ���� �����ö�
		return name;
	}
	public void setName(String name) { // ��� ���� �����Ҷ� 
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
