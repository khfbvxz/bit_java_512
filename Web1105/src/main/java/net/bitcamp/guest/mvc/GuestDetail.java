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


@WebServlet("/guestDetail.do")
public class GuestDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
	}//end

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
	}//end

	public void doUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //한글지원
		PrintWriter out = response.getWriter();
		out.println("<h2>GuestDetail.java서블릿문서 실습 </h2>");  
		out.println("<img src='images/bar.gif'></img> <br>");
		out.println("<img src='images/bar.gif'></img> <br>");
				
		GuestDAO dao = new GuestDAO();	
		out.println("<h2>");
		out.println("<a href='guestWrite.jsp'>guest등록</h2>");
		out.println("<a href='guestList.do'>guest전체출력</h2>");
		out.println("</h2>");
		
	}//end
}//GuestInsert END









