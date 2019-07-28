package com.maren.demosec.controller;//java package(ajit95)

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest
 */
@WebServlet("/ScopeTest")
public class ScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// To set a value
		request.setAttribute("REQUEST","Request Scope");
		//get session has access toget and dopost method and set the value of session,request,application
		request.getSession().setAttribute("SESSION","Session Scope");
		getServletContext().setAttribute("APP","Application");
		//getRequestDispatcher provides the facility of dispatching the request to another resource i.e. servlet or html(ajit95)
		request.getRequestDispatcher("/ScopeTest2").forward(request,response);
		response.getWriter().append("served at:").append(request.getContextPath());	//returns a printwriter object that can send char text to the client(ajit95)
		}
	

}
