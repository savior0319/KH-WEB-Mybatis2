package org.kh.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.MemberVo;

@WebServlet(name = "Mybatis4", urlPatterns = { "/mybatis4" })
public class Mybatis4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Mybatis4Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberVo mv = new MemberVo();
		mv.setUserId(id);
		mv.setUserPw(pw);

		MemberVo getMv = new MemberServiceImpl().memberOneInfo(mv);

		if (getMv != null) {
			getMv.getUserId();
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/member/memberModifyInfo.jsp");
			request.setAttribute("memberInfo", getMv);
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
