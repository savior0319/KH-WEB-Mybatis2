package org.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;

@WebServlet(name = "Mybatis1", urlPatterns = { "/mybatis1" })
public class Mybatis1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Mybatis1Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");

		String result = new MemberServiceImpl().checkId(id);
		String send = "";
		if (result != null) {
			send = "1";
		} else {
			send = "0";
		}

		response.getWriter().print(send);
		response.getWriter().close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
