package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	//for Tomcat -- better to explicitly create a no-args constructor 
	public HelloServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Print to the response (build the response body)
		PrintWriter pw =res.getWriter();
		pw.print("<h1> Hello from your doGet method </h1>");
		
	}
	
	//Tomcat will handle all the ServletExceptions
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out =res.getWriter();
		out.print("<h1> Hello from your doPost method </h1>");
	}
	
	
}
