package net.bitcamp.guest.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher; //2시 13분에 임포트 추가함
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bitcamp.guest.GuestDAO;
import net.bitcamp.guest.GuestDTO;


@WebServlet("/guestList.do")
public class GuestList extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		//서블릿문서를 실행하면 기본스타트 실행메소드는 goGet(1,2)방식
		doUser(request, response);
		System.out.println("GuestList doGet방식");
	}//end

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
		System.out.println("GuestList doPost방식");
	}//end

	public void doUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //한글지원
		PrintWriter out = response.getWriter();
		out.println("<h2>GuestInsert.java서블릿문서 실습 </h2>");  
		out.println("<img src='images/bar.gif'></img> <br>");
				
		GuestDAO dao = new GuestDAO();	
		ArrayList<GuestDTO> LG = dao.dbSelectAll(); //모든데이터가져오는 함수 
		//LG객체를  어떻게 guestList.jsp문서로 넘기는거 
		//데이터받는 guestList.jsp문서를 여기서 명시를 해야 하죠 
		
		request.setAttribute("LG", LG);
		RequestDispatcher dis = request.getRequestDispatcher("guestList.jsp");
		dis.forward(request, response);
		
		out.println("<h1>");
		out.println("<a href=guestWrite.jsp>[guest등록]</a>");
		out.println("<a href=index.jsp>[index]</a>");
		out.println("<a href=bbsList.jsp>[bbsList]</a>");
		out.println("</h1>");	
	}//end
	
}//GuestInsert END









