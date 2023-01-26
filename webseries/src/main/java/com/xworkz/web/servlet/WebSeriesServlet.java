package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 99, urlPatterns = "/web")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running in it configuration...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get from Web server...");
		System.out.println(Thread.currentThread().getName());
		String webSeriesName = req.getParameter("webSeriesName");
		String language = req.getParameter("language");
		String episodes = req.getParameter("episodes");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(webSeriesName);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("Web Series name " + webSeriesName + " is sent successfully.");
		writer.print("Web Series language " + language + " is sent successfully.");
		writer.print("Web Series episodes " + episodes + " is sent successfully.");
		writer.print("Web Series ott " + ott + " is sent successfully.");
		writer.print("Web Series budget " + budget + " is sent successfully.");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
