package com.bl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdServlet
 */
public class JdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JdServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		
	String s=request.getParameter("joiningdate");

String[] val=s.split("-");

//int year=Integer.parseInt(val[0]);
//int month=Integer.parseInt(val[1]);
//int date=Integer.parseInt(val[2]);

request.setAttribute("year", val[0]);
request.setAttribute("month", val[1]);
request.setAttribute("date", val[2]);

RequestDispatcher dispatcher=request.getRequestDispatcher("/CalServlet");
dispatcher.forward(request, response);

//RequestDispatcher 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
