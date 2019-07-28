//java package(ajit95)
package com.maren.demosec.controller;
//importing all the classes from the packages(ajit95)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherCtrl(ajit95)
 */
@WebServlet("/DispatcherCtrl")
public class DispatcherCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(ajit95)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ConfigCtrl is the url pattern of ConfigCtrl servlet(ajit95)
		//getRequestDispatcher provides the facilities of dispatching the request to another resource i.e. servlet,jap or html(ajit95)
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/HelloCtrl").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(ajit95)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
