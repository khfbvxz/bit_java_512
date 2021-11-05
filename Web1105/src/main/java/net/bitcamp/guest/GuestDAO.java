package net.bitcamp.guest;


import java.util.ArrayList;
import net.bitcamp.common.DB;

public class GuestDAO extends Global implements Guest {

   public GuestDAO(){
	 try {
       CN = DB.getConnection();
       ST = CN.createStatement();
	 }catch(Exception e){ System.out.println("에러이유 " + e.toString());} 
   }//생성자 end

	@Override
	public void dbInsert(int dcode, String dtitle, int dpay, String demail) {
	  try {
		System.out.println("dbInsert함수 넘어온 코드 = " + dcode ); //콘솔창출력
		System.out.println("dbInsert함수 넘어온 제목 = " + dtitle );
		System.out.println("dbInsert함수 넘어온 급여 = " + dpay);
		System.out.println("dbInsert함수 넘어온 메일 = " + demail );
		  
		msg ="insert into guest values(?,?,?,?)";
		PST = CN.prepareStatement(msg);
		  	PST.setInt(1, dcode);
		  	PST.setString(2, dtitle);
		  	PST.setInt(3, dpay);
		  	PST.setString(4, demail);
		PST.executeUpdate();  //진짜 저장성공처리
		System.out.println("콘솔출력 guest테이블 저장성공했습니다 11월05일") ;  
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	}//end
	
	
	@Override
	public int dbCountAll() {
	  try {	
		msg = "select count(*) as cnt from guest ";
		ST = CN.createStatement(); 
	    RS = ST.executeQuery(msg);
	    if(RS.next()==true){Gtotal = RS.getInt("cnt");  }
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	  return Gtotal; //Gtotal리턴값으로 하세요 
	}//end
	
	@Override
	public void dbInsert(GuestDTO dto) {
	  try {
		  
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}	
	}

	@Override
	public ArrayList<GuestDTO> dbSelectAll() {
	  ArrayList<GuestDTO> alist = new ArrayList<GuestDTO>();
	  try {
		msg = "select * from guest order by code ";
		ST = CN.createStatement(); 
		RS = ST.executeQuery(msg);
		//while문장 GueustDTO dto개체해서  alist.add(dto)
		while(RS.next()==true) {
			GuestDTO dto = new GuestDTO();
			dto.setCode(RS.getInt("code"));
			dto.setTitle(RS.getString("title"));
			dto.setPay(RS.getInt("pay"));
			dto.setEmail(RS.getString("email"));
			alist.add(dto);
		}
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}	
	  return alist;
	}//end
	


	@Override
	public void dbSearch(String find) {
	 try {
		 
	 }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	}
	
	@Override
	public int dbSearchCount(String key) {
	  try {
		  
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	  return 0;
	}

	@Override
	public void dbDelete() {
	  try{
	   	
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}	  
	}
	
	@Override
	public void dbDelete(int data) {
	  try {
		 msg ="delete from guest  where code = " + data ;
		 ST = CN.createStatement();
		 int OK = ST.executeUpdate(msg);
		 if (OK>0){
		  System.out.println(data + " 데이터 삭제 성공 했습니다");
		 }else{ }  
	  }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	}//end
	
	@Override
	public void dbUpdate() {
	 try{
		
	 }catch(Exception e){ System.out.println("에러이유 " + e.toString());}		 
	}
	
	@Override
	public void dbUpdate(int code) {
	 try {
		
	 }catch(Exception e){ System.out.println("에러이유 " + e.toString());}
	}//end
	
        
}//GuestDAO END
