package Myhome;

import java.util.Scanner;

public class Appliances {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String brand;
	private int energyGrade;
	private int powerHour;
	private int useTime;
	public Appliances(String name, String brand, int energyGrade) {
		super();
		name = name.toUpperCase();
		this.name = name;
		this.brand = brand;
		this.energyGrade =energyGrade;
		this.powerHour = setPower(name);
		// TV �� PC �Է½� ��ҹ��� ���� 
		// ������ TV ��Ź�� ����� PC ���� ���� power �� �ְ� �������� ���������ڿ켱 �� �ִ°ɷ�?, 
	}
//	public Appliances(String name, String brand, int energyGrade,int powerHour) {
//		super();
//		this.name = name;
//		this.brand = brand;
//		this.energyGrade =energyGrade;
//		// ������ TV ��Ź�� ����� PC ���� ���� power �� �ְ� �������� ���������ڿ켱 �� �ִ°ɷ�?, 
//	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public int getEnergyGrade() {return energyGrade;}
	public void setEnergyGrade(int energyGrade) {this.energyGrade = energyGrade;}

	public int getPowerHour() {return powerHour;}
	public void setPowerHour(int powerHour) {this.powerHour = powerHour;}
	
	public int getUseTime() {return useTime;}
	public void setUseTime(int useTime) {this.useTime = useTime;}
	// ������ TV ��Ź�� ����� PC ���� ���� power �� �ְ� �������� ���������ڿ켱 �� �ִ°ɷ�?,	
	public int setPower(String name) {
		int power;
		if(name.equals("������")) {
			power = 200;
		}
		else if(name.equals("TV")||name.equals("�����")) {
			power = 100;
		}
		else if(name.equals("��Ź��")||name.equals("PC")) {
			power = 150;
		}else {
//			System.out.printf("%s�� ���¼Ҹ��� �⺻���� �����ϴ�.",);
			System.out.printf("%1$s�� ���¼Ҹ��� �⺻���� �����ϴ�.\n%1$s�� �ð��� ���¼Ҹ��� �Է��ϼ��� : ",name);
			power = Integer.parseInt(sc.next());
		}
		
		return power;
	}// set power end
}
