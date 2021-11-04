package net.bitcamp.guest;

import java.util.ArrayList;

public interface Guest {
	public void dbInsert();
	public void dbInsert(GuestDTO dto);
	
	public ArrayList dbSelectAll();
	public ArrayList dbCountAll();
	
	public void dbDelete();
	public void dbDelete(int code);
	
	public void dbUpdate();
}
