package servletstart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exID")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		
		/*
		 * String userID = request.getParameter("userID"); String[] hobby =
		 * request.getParameterValues("hobby");
		 * 
		 * System.out.println("userID 입력한 값: " + userID);
		 * 
		 * for(String s : hobby) { System.out.println("hobby 값 : "+s);
		 * 
		 * }
		 */
		    	 
		     }
		 
		     
       	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	
	 String userID =request.getParameter("userID");
	 String userPW =request.getParameter("userPW");
	 
	  System.out.println("userID :" + userID);
	  System.out.println("userPW :" + userPW);
	  
	  response.setContentType("text/html; charset=utf-8");
	  PrintWriter out = response.getWriter();
	  
	  String data = "<html><body> 당신이 적은 아이디는 <h1>"+  userID +"</h1>입니다</h1></body></html>";
	  out.print(data);
	  String data1 = "<html><body> 당신이 적은 비밀번호는 <h1>"+ userPW + "</h1> 입니다</h1></body></html>";
	  out.print(data1);
	}
      
}
