package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(
        name = "MyServlet", 
        urlPatterns = {""}
    )
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		String name=req.getParameter("input"); 
		
		String reverse = new StringBuffer(name).reverse().toString();
		pw.print("<html><body>");
		pw.print("<h2>"+ reverse +" </h2>");
		pw.print("</body></html>");
		
	
		
		pw.close();  
		

	
    }
    
}
