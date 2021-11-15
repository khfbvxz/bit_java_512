package net.bitcamp.guest.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher; //2�� 13�п� ����Ʈ �߰���
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
		//���������� �����ϸ� �⺻��ŸƮ ����޼ҵ�� goGet(1,2)���
		doUser(request, response);
		System.out.println("GuestList doGet���");
	}//end

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doUser(request, response);
		System.out.println("GuestList doPost���");
	}//end

	public void doUser(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //�ѱ�����
		PrintWriter out = response.getWriter();
		out.println("<h2>GuestInsert.java�������� �ǽ� </h2>");  
		out.println("<img src='images/bar.gif'></img> <br>");
				
		GuestDAO dao = new GuestDAO();	
		ArrayList<GuestDTO> LG = dao.dbSelectAll(); //��絥���Ͱ������� �Լ� 
		//LG��ü��  ��� guestList.jsp������ �ѱ�°� 
		//�����͹޴� guestList.jsp������ ���⼭ ��ø� �ؾ� ���� 
		
		request.setAttribute("LG", LG);
		RequestDispatcher dis = request.getRequestDispatcher("guestList.jsp");
		dis.forward(request, response);
		
		out.println("<h1>");
		out.println("<a href=guestWrite.jsp>[guest���]</a>");
		out.println("<a href=index.jsp>[index]</a>");
		out.println("<a href=bbsList.jsp>[bbsList]</a>");
		out.println("</h1>");	
	}//end
	
}//GuestInsert END









