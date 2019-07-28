package com.maren.demosec.controller;//java package(ajit95)

import java.io.IOException;//importing all the classes from the packages(ajit95)
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2(ajit95)
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(ajit95)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//sharing out data among resources(ajit95)
		String req = (String) request.getAttribute("REQUEST");//process current request(ajit95)
		String ses = (String) request.getSession().getAttribute("SESSION");//return current request(ajit95)
		String app = (String) getServletContext().getAttribute("app");
		PrintWriter out=response.getWriter();//return a printwriter obj that can send char to client(ajit95)
		out.println("req:"+req);
		out.println("session:"+ses);
		out.println("application:"+app);

	}

}
