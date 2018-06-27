package org.kh.member.model.dao;

import org.apache.ibatis.session.SqlSession;

public interface MemberDAO {
	public String checkId(SqlSession session, String id);
}
