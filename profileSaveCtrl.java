//java package(ajit95)
package com.maren.demosec.controller;

import java.io.IOException;//importing all the classes from the packages(ajit95)
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class profileSaveCtrl
 */
@WebServlet("/profileSaveAction")
public class profileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		profile profile95 = new profile();//creating a new object profile or the class(ajit95)
		//that set method would set the value and get method will return the varriable(ajit95) 
		// TODO Auto-generated method stub
		com.maren.demosec.controller.profile profile = new profile();
		profile.setUserid(request.getParameter("userid"));
		profile.setName(request.getParameter("name"));
		profile.setEmail(request.getParameter("email"));
		profile.setMobile(Long.parseLong(request.getParameter("mobile")));//here long class is use parse the char sequence as a signed long with specified radix(ajit95)
		//java is database
		int res = new ProfileDao(),save(profile95);
		request.setAttribute("RES",res);//to set the attribute
		request.getRequestDispatcher("/profileviewctrl").forward(request,response);//getrequest dispatcher provides the facilities of dispatching the request to another resourse i.e. servlet,jap or html(ajit95)
		
	}

	private void save(profile profile95) {
		// TODO Auto-generated method stub
		
	}

}
