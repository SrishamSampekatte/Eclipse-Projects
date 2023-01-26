package com.xworkz.smartwatch.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/smartwatch")
public class SmartWatchServlet extends HttpServlet {
	public SmartWatchServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init configuration");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do getfrom SmartWatch");
		String name = req.getParameter("name");
		String company = req.getParameter("company");
		String investedBy = req.getParameter("investedBy");
		String dialType = req.getParameter("dialType");
		String battery = req.getParameter("battery");
		String chargingDuration = req.getParameter("chargingDuration");
		String typeOfShell = req.getParameter("typeOfShell");
		String batteryDuration = req.getParameter("batteryDuration");
		String beltType = req.getParameter("beltType");
		String caseMaterial = req.getParameter("caseMaterial");
		String thicknessOfMaterial = req.getParameter("thicknessOfMaterial");
		String key = req.getParameter("key");
		String noOfPortionInDisplay = req.getParameter("noOfPortionInDisplay");
		String noOfHands = req.getParameter("noOfHands");
		String buckleType = req.getParameter("buckleType");
		String suitableFor = req.getParameter("suitableFor");
		String price = req.getParameter("price");
		String adjustmentHoles = req.getParameter("adjustmentHoles");
		String freeLoop = req.getParameter("freeLoop");
		String NoOfScrews = req.getParameter("NoOfScrews");

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("Smart Watch name " + name + " is sent successfully.");
		writer.print("Smart Watch language " + company + " is sent successfully.");
		writer.print("Smart Watch episodes " + investedBy + " is sent successfully.");
		writer.print("Smart Watch ott " + dialType + " is sent successfully.");
		writer.print("Smart Watch budget " + battery + " is sent successfully.");
		writer.print("Smart Watch name " + chargingDuration + " is sent successfully.");
		writer.print("Smart Watch name " + typeOfShell + " is sent successfully.");
		writer.print("Smart Watch language " + batteryDuration + " is sent successfully.");
		writer.print("Smart Watch episodes " + beltType + " is sent successfully.");
		writer.print("Smart Watch ott " + caseMaterial + " is sent successfully.");
		writer.print("Smart Watch budget " + thicknessOfMaterial + " is sent successfully.");
		writer.print("Smart Watch name " + key + " is sent successfully.");
		writer.print("Smart Watch language " + noOfPortionInDisplay + " is sent successfully.");
		writer.print("Smart Watch episodes " + noOfHands + " is sent successfully.");
		writer.print("Smart Watch ott " + buckleType + " is sent successfully.");
		writer.print("Smart Watch budget " + suitableFor + " is sent successfully.");
		writer.print("Smart Watch name " + price + " is sent successfully.");
		writer.print("Smart Watch language " + batteryDuration + " is sent successfully.");
		writer.print("Smart Watch episodes " + adjustmentHoles + " is sent successfully.");
		writer.print("Smart Watch ott " + freeLoop + " is sent successfully.");
		writer.print("Smart Watch budget " + NoOfScrews + " is sent successfully.");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
