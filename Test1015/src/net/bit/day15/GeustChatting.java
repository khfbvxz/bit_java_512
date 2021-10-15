package net.bit.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import net.bit.common.GuestDAO;
import net.bit.common.GuestDTO;

public class GeustChatting {
	public static void main(String[] args) {
		Vector<GuestDTO> vt = new Vector<GuestDTO>(); // 동기화처리 network 프로그램 필수
		ArrayList<GuestDTO> ai = new ArrayList<GuestDTO>();
		
		int cnt = 0;
		String[] a = {"aaa","bbb","ccc"};
		int [] b = {24,27,21};
		double[]c = {7.1,6.1,5.99};
		while(true) {
			GuestDTO dto = new GuestDTO();
			dto.setName(a[cnt]);
			dto.setAge(b[cnt]);
			dto.setPoint(c[cnt]);
			ai.add(dto);
			cnt++;
			if(cnt==3) {break;}
		}
		GuestDAO dao = new GuestDAO();
		dao.dbDisplay(ai);
//		GuestDTO dto = new GuestDTO();
//		dto.setName("bit");
//		dto.setAge(23);
//		dto.setPoint(7.8);
//		ai.add(dto);
		
		
//		ai.add(true);
//		ai.add('K');
//		ai.add("bit");
		
	}//main end
}//class end
