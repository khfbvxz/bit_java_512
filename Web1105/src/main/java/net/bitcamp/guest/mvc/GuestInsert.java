package net.bitcamp.guest.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bitcamp.guest.GuestDAO;
import net.bitcamp.guest.GuestDTO;


@WebServlet("/guestInsert.do")
public class GuestInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		//서블릿문서를 실행하면 기본스타트 실행메소드는 goGet(1,2)방식
		doUser(request, response);
		System.out.println("GuestInsert doGet방식");
	}//end

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
		System.out.println("GuestInsert doPost방식");
	}//end

	public void doUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //한글지원
		PrintWriter out = response.getWriter();
		out.println("<h2>GuestInsert.java서블릿문서 실습 </h2>");  
		out.println("<img src='images/a1.png'></img> <br>");
	
		int dcode =  Integer.parseInt(request.getParameter("code"));
		String dtitle =  request.getParameter("title");
		int dpay =  Integer.parseInt(request.getParameter("pay"));
		String demail =  request.getParameter("email");
		System.out.println(dcode +" " + dtitle +" " + dpay + " " + demail);
		
		GuestDTO dto = new GuestDTO();
		GuestDAO dao = new GuestDAO();
		
		dao.dbInsert(dcode, dtitle, dpay, demail);
		System.out.println("GuestInsert컨트롤 guest테이블 저장성공했습니다 ");
		//전체데이터 땡겨오는 GuestList.java서블릿문서 가짜이름으로 send
		response.sendRedirect("guestList.do");
	}//end
	
}//GuestInsert END









