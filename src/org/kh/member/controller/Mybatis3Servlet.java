package org.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.MemberVo;

@WebServlet(name = "Mybatis3", urlPatterns = { "/mybatis3" })
public class Mybatis3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Mybatis3Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String tel = request.getParameter("tel");

		MemberVo mv = new MemberVo();
		mv.setUserId(id);
		mv.setUserPw(pw);
		mv.setUserNick(nick);
		mv.setUserTel(tel);
		
		int result = new MemberServiceImpl().signup(mv);
		
		if(result > 0) {
			response.sendRedirect("/Views/member/signupSuccess.jsp");
		} else {
			response.sendRedirect("/Views/error/error.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
