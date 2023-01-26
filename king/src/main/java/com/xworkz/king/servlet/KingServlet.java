package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	public KingServlet() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running in it configuration...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get from king...");
		System.out.println(Thread.currentThread().getName());
		String kingName = req.getParameter("kingName");
		String region = req.getParameter("region");
		String numberOfQueen = req.getParameter("numberOfQueen");
		String dob = req.getParameter("dob");
		String dod = req.getParameter("dod");

		System.out.println(kingName);
		System.out.println(region);
		System.out.println(numberOfQueen);
		System.out.println(dob);
		System.out.println(dod);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("Web Series name " + kingName + " is sent successfully.");
		writer.print("Web Series language " + region + " is sent successfully.");
		writer.print("Web Series episodes " + numberOfQueen + " is sent successfully.");
		writer.print("Web Series ott " + dob + " is sent successfully.");
		writer.print("Web Series budget " + dod + " is sent successfully.");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
