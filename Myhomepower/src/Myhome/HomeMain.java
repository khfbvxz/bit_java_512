package Myhome;

import java.util.*;
import java.io.*;

public class HomeMain {
	static ArrayList<Appliances> appli;
	public static void main(String[] args) {
		appli = new ArrayList<Appliances>();
		Appliances a = new Appliances("������","�Ｚ", 1);
		System.out.println(a.getPowerHour());
		Appliances b = new Appliances("Tv","�Ｚ", 2);
		System.out.println(b.getPowerHour());
		Appliances c = new Appliances("������","���н�", 2);
		System.out.println(c.getPowerHour());
	}
}
