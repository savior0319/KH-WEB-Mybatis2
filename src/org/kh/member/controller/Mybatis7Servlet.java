package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.MemberVo;

@WebServlet(name = "Mybatis7", urlPatterns = { "/mybatis7" })
public class Mybatis7Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Mybatis7Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<MemberVo> aList = new MemberServiceImpl().selectAll();

		if (!aList.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/member/memberAll.jsp");
			request.setAttribute("list", aList);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/Views/error/error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
