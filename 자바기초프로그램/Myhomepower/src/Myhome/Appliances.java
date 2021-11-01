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
		// TV 나 PC 입력시 대소문자 구분 
		// 에어컨 TV 세탁기 냉장고 PC 등은 고정 power 가 있고 나머지는 지정해주자우선 다 넣는걸로?, 
	}
//	public Appliances(String name, String brand, int energyGrade,int powerHour) {
//		super();
//		this.name = name;
//		this.brand = brand;
//		this.energyGrade =energyGrade;
//		// 에어컨 TV 세탁기 냉장고 PC 등은 고정 power 가 있고 나머지는 지정해주자우선 다 넣는걸로?, 
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
	// 에어컨 TV 세탁기 냉장고 PC 등은 고정 power 가 있고 나머지는 지정해주자우선 다 넣는걸로?,	
	public int setPower(String name) {
		int power;
		if(name.equals("에어컨")) {
			power = 200;
		}
		else if(name.equals("TV")||name.equals("냉장고")) {
			power = 100;
		}
		else if(name.equals("세탁기")||name.equals("PC")) {
			power = 150;
		}else {
//			System.out.printf("%s의 전력소모량의 기본값이 없습니다.",);
			System.out.printf("%1$s의 전력소모량의 기본값이 없습니다.\n%1$s의 시간당 전력소모량을 입력하세요 : ",name);
			power = Integer.parseInt(sc.next());
		}
		
		return power;
	}// set power end
}
