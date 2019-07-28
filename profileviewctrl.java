//java package(ajit95)
package com.maren.demosec.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class profileviewctrl
 */
@WebServlet("/profileviewctrl")
public class profileviewctrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			int res = (int) request.getAttribute("RES");
			PrintWriter out = response.getWriter();
			if (res == 0)
				out.println("There is some problem ;  Try again .");
			else
				out.println("Data Successfully inserted");
			
			out.print(" <br/> The Datas are");
			List<Profile> list = new ProfileDao().fetchAll();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Profile profile = (Profile) iterator.next();
				out.println("Name : "+ profile.getName() +" Userid : "+ profile.getUserid()+ "mobile "+ profile.getMobile());
			}
			

		}

		