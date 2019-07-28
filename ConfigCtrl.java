//java package(ajit95)
package com.maren.demosec.controller;

import java.io.IOException;//importing all the classes from the package(ajit95)

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigCtrl
 */
@WebServlet(
		urlPatterns = { "/ConfigCtrl" }, 
		initParams = { 
				@WebInitParam(name = "univ", value = "cutm"), 
				@WebInitParam(name = "loc", value = "bbsr")
		})
public class ConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
		//gets the value of initialization parameter with the given name(ajit95)
		String univ=config.getInitParameter("univ");
		String loc=config.getInitParameter("loc");
		response.getWriter().append("university is:"+univ+"at:"+loc);//to print the content(ajit95)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(ajit95)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
