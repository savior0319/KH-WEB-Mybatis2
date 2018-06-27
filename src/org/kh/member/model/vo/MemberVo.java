package org.kh.member.model.vo;

import java.sql.Date;

public class MemberVo {
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", userNick=" + userNick + ", userTel=" + userTel
				+ ", regDate=" + regDate + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public MemberVo(String userId, String userPw, String userNick, String userTel, Date regDate) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userNick = userNick;
		this.userTel = userTel;
		this.regDate = regDate;
	}

	private String userId, userPw, userNick, userTel;
	private Date regDate;

	public MemberVo() {
	}
	
	

}
