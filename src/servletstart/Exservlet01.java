package servletstart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.serbletstartDB;

@WebServlet("/abc")
public class Exservlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String userAddress = request.getParameter("address");
		String age = request.getParameter("age");
		System.out.println(userName);
		System.out.println(userAddress);
		System.out.println(age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	request.setCharacterEncoding("utf-8");
	
		
		String userName = request.getParameter("userName");
		String userAddress = request.getParameter("address");
		String age = request.getParameter("age");
		System.out.println(userName);
		System.out.println(userAddress);
		System.out.println(age);
		
		serbletstartDB db = new serbletstartDB();
		db.insert(userName, userAddress, Integer.parseInt(age));
	}

}
