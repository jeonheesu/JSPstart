package servletstart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exHandle")
public class ExHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
         
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	       request.setCharacterEncoding("utf-8");
	     String userID =  request.getParameter("userID");
	     String userPW =  request.getParameter("userPW");
	     
	     System.out.println("userID값 : " + userID );
	     System.out.println("userPW값 : " + userPW );
	     
	     response.setContentType("text/html; charset=utf-8");
	     PrintWriter out = response.getWriter();
	       String data = "<html><body>";
	       data += "userID값 확인 : " + userID;
	       data += "userPW값 확인 : " + userPW;
	       data += "</body></html>";
	       out.print(data);
	}
}
