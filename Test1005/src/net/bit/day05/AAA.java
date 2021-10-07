package net.bit.day05;

import java.io.*;
import java.util.StringTokenizer;

/// X보다 작은수 
public class AAA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st, stt;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int [] innum=new int[n];
		stt = new StringTokenizer(br.readLine());
		for (int i =0 ; i<n;i++) {
			innum[i]=Integer.parseInt(stt.nextToken());
		}	
		for (int i = 0 ; i<n ;i++) {

			if (innum[i]<x) 
				bw.write(String.valueOf(innum[i])+" ");
		}
		bw.flush();	
	}
}
/*
 * import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for ( int i = 1 ; i <=T ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
					
			bw.write("Case #"+String.valueOf(i)+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}
}

 */
