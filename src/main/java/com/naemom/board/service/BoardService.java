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
 * �Խ��� service
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
	 * �Խ��� ��ȸ
	 * @return
	 */
	public List<BoardVo> getListBoard(){
		
		// �Խ��� ��ü ��ȸ
		return boardDao.getListBoard();
		
	}
	/**
	 * �Խ��� ��� (����� �Ķ����)
	 * @param title 
	 * @param contents
	 * @param userName
	 * @return
	 */
	public int insertBoard(String title, String contents, String userName, Date birth, String gender) {
		
		// dao���� insert ����
		return boardDao.insertBoard(title, contents, userName, birth, gender);
	}
	
}
