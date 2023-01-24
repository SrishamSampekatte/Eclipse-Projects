package com.xworkz.methods.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/onboarding")
public class OnboardingServlet extends HttpServlet {
	public OnboardingServlet() {
		System.out.println("Created" + getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init of Onboarding..");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from Onboarding..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from Onboarding..");
		String data = "jingo,bingo,chinese,";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put from Onboarding...");
		String ref1 = "Lemon Juice,GobhiManchuri";
		PrintWriter writer2 = resp.getWriter();
		// ServletOutputStream write = resp.getOutputStream();
		writer2.print(ref1);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete from Onboarding...");
		String ref2 = "Delete maaadu,alisu";
		PrintWriter writer2 = resp.getWriter();
		writer2.print(ref2);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Head from Onboarding");
		String ref3 = "Tale,shira";
		PrintWriter writer3 = resp.getWriter();
		writer3.print(ref3);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Options from Onboarding...");
		String ref4 = "Optional,ayke";
		PrintWriter writer4 = resp.getWriter();
		writer4.print(ref4);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Trace from Onboarding..");
		String ref5 = "Track madu,trace madu";
		PrintWriter writer5 = resp.getWriter();
		writer5.print(ref5);
		resp.setContentType("text/plain");
	}

}
