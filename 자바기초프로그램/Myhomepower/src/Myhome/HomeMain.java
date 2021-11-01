package Myhome;

import java.util.*;
import java.io.*;

public class HomeMain {
	static ArrayList<Appliances> appli;
	public static void main(String[] args) {
		appli = new ArrayList<Appliances>();
		Appliances a = new Appliances("에어컨","삼성", 1);
		System.out.println(a.getPowerHour());
		Appliances b = new Appliances("Tv","삼성", 2);
		System.out.println(b.getPowerHour());
		Appliances c = new Appliances("정수기","위닉스", 2);
		System.out.println(c.getPowerHour());
	}
}
