package org.kh.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.MemberVo;
@SuppressWarnings("all")
public class MemberDAOImpl implements MemberDAO {

	@Override
	public String checkId(SqlSession session, String id) {
		String result = session.selectOne("member.query1", id);
		return result;
	}

	public MemberVo memberOneInfo(SqlSession session, MemberVo mv) {
		MemberVo getMv = session.selectOne("member.query2", mv);
		return getMv;
	}

	public int signup(SqlSession session, MemberVo mv) {
		int result = session.insert("member.query3", mv);
		return result;
	}

	public int memberModify(SqlSession session, MemberVo mv) {
		int result = session.update("member.query4", mv);
		return result;
	}

	public int memberDelete(SqlSession session, MemberVo mv) {
		int result = session.delete("member.query5", mv);
		return result;
	}

	public ArrayList<MemberVo> selectAll(SqlSession session) {
		List list = session.selectList("member.query6");
		return (ArrayList<MemberVo>) list;
	}

}
