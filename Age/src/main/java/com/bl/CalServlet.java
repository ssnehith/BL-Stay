package com.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int year=Integer.parseInt((String)request.getAttribute("year"));
		int month=Integer.parseInt((String)request.getAttribute("month"));
		int date=Integer.parseInt((String)request.getAttribute("date"));
		
		
		LocalDate jd=LocalDate.of(year, month,date);
		Period period=Period.between(jd,LocalDate.now());
		
		response.setContentType("text/html");
		
		
		PrintWriter printWriter=response.getWriter();
		
		
/**HTML CODE*/		
		printWriter.println("<!DOCTYPE html>");
		printWriter.println("<html>");
		printWriter.println("");
		printWriter.println("<head>");
		printWriter.println("<meta charset=\"ISO-8859-1\">");
		printWriter.println("<title>Days</title>");
		printWriter.println("<link rel=\'stylesheet\' href=\'style.css\'>");
		printWriter.println("</head>");
		printWriter.println("<body>");
		printWriter.println("<header>");
		printWriter.println("<h1 style=\"color: blue;\">BriteLifeFoundation</h1>	");
		printWriter.println("</header>");
		printWriter.println("<menu>");
		
		printWriter.println("<h2 style='color:Tomato;'>"+"Your Stay in Rehab = "+period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days" +"</h2>");
		
		printWriter.println("</menu>");
		printWriter.println("<footer>© 2024 BriteLife Foundation, Inc.</footer>");
		printWriter.println("</body>");
		printWriter.println("</html>");
	

	
	System.out.println("Cal Servlet :"+year+" "+month+" "+date);
	
	System.out.println("Joining Date Setted :"+jd);

	System.out.println("Period :"+"Years="+period.getYears() +" Months="+period.getMonths()+" Days="+period.getDays());

	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
