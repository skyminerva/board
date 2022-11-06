package com.naemom.board.dao;

import com.naemom.board.dao.vo.BoardVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
/**
 * 
 * @author JW-CHOI
 *
 */
@Repository
public abstract class BoardDaoImpl implements BoardDao {
	
	// sqlsession 사용
	@Autowired
	SqlSession session;
	
	// sql mapper 네임스페이스 
	String namespace = "com.naemom.board.dao.BoardMapper.";

	// boardDao override
	@Override
	public List<BoardVo> getListBoard(){
		
		// sql 처리 값 리턴
		return session.selectList(namespace + "getListBoard");
	}
}
