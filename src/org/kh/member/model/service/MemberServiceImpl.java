package org.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.dao.MemberDAOImpl;
import org.kh.member.model.vo.MemberVo;

import common.MybatisCommon;

public class MemberServiceImpl implements MemberService {

	public MemberServiceImpl() {
	}

	@Override
	public String checkId(String id) {
		SqlSession session = MybatisCommon.getSqlSession();
		String result = new MemberDAOImpl().checkId(session, id);
		return result;
	}

	public MemberVo memberOneInfo(MemberVo mv) {
		SqlSession session = MybatisCommon.getSqlSession();
		MemberVo getMv = new MemberDAOImpl().memberOneInfo(session, mv);
		return getMv;
	}

	public int signup(MemberVo mv) {
		SqlSession session = MybatisCommon.getSqlSession();
		int result = new MemberDAOImpl().signup(session, mv);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		return result;
	}

	public int memberModify(MemberVo mv) {
		SqlSession session = MybatisCommon.getSqlSession();
		int result = new MemberDAOImpl().memberModify(session, mv);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		return result;
	}

	public int memberDelete(MemberVo mv) {
		SqlSession session = MybatisCommon.getSqlSession();
		int result = new MemberDAOImpl().memberDelete(session, mv);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		return result;
	}

	public ArrayList<MemberVo> selectAll() {
		SqlSession session = MybatisCommon.getSqlSession();
		ArrayList<MemberVo> aList = new MemberDAOImpl().selectAll(session);
		return aList;
	}

}
