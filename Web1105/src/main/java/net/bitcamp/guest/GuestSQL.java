package net.bitcamp.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import net.bitcamp.common.DB;

public class GuestSQL { //상속안하고 구현
    Connection CN ;
    Statement ST ;
    PreparedStatement PST;
    ResultSet RS ;
	   
	int Grn, Grow, Gsabun, Gcode, Gpay, Ghit, Gtotal, GStotal ;   
     String Gname, Gtitle, Gemail, Gmemo, GID, GPWD ; 
     java.util.Date Gdate, Gwdate ;
     String Gmsg, msg, Gdata;
     
     int Rrn, Rnum, Rsabun, Rcode;
     String Rwriter, Rcontent;
     
     int dcode, dpay ; //guestSave.jsp 
     String dtitle,demail ;  //guestSave.jsp
     
     ArrayList alist = new ArrayList();
     java.util.Date  dt = new java.util.Date();

    public GuestSQL() {
     try {
       CN = DB.getConnection();
       ST = CN.createStatement();
     }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
    }//end
     
    public void dbInsert() {
      try {
    	  
      }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
    }//end
    
 	public void dbInsert(GuestDTO dto) {
 	  try {
 		  
 	 }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
 	}//end
 	
 	public ArrayList<GuestDTO>  dbSelectAll(){
 	 ArrayList<GuestDTO> alist=null;
 	  try {
 		 
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
 	  return alist;
 	}//end
 	
 	public int  dbCountAll() {
	  try {
 	 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
	  return 0;
 	}//end
 	
 	public void dbSearch(String find) {	  
 		try {
		  
	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
     }//end
 	
 	public int  dbSearchCount(String key) {
	  try {
 	 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
	  return 0;
 	}//end
 	
 	
 	public void dbDelete() {
 	  try {
 	 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
 	}//end
 	
 	public void dbDelete(int code) {
	  try {
 	 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
 	}//end
 	
 	public void dbUpdate() {
	  try {
 	 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }	
 	}//end
 	
 	public void dbUpdate(int code) {
 	  try {
 		  
 	  }catch (Exception ex){System.out.println("에러발생이유 " + ex.toString()); }
 	}//end
 	
}//GuestSQL END
