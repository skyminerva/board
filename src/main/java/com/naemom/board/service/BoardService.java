package com.naemom.board.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naemom.board.dao.BoardDao;
import com.naemom.board.dao.vo.BoardVo;

/**
 * 게시판 service
 * 
 * @author JW-CHOI
 *
 */
@Service
public class BoardService {
	
	// logger
	private final Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Autowired
	private BoardDao boardDao;
	
	/**
	 * 게시판 조회
	 * @return
	 */
	public List<BoardVo> getListBoard(){
		
		// 게시판 전체 조회
		return boardDao.getListBoard();
		
	}
	/**
	 * 게시판 등록 (등록할 파라미터)
	 * @param title 
	 * @param contents
	 * @param userName
	 * @return
	 */
	public int insertBoard(String title, String contents, String userName, Date birth, String gender) {
		
		// dao에서 insert 리턴
		return boardDao.insertBoard(title, contents, userName, birth, gender);
	}
	
}
