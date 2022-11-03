package com.naemom.board.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.naemom.board.dao.vo.BoardVo;

/**
 * 
 * @author JW-CHOI
 *
 * 
 */
@Mapper
public interface BoardDao {

	// 게시판 조회
	public List<BoardVo> getListBoard();
	
	// 게시판 등록   @mapper 인터페이스에서 전달하고자 하는 변수들은 @param을 사용
	public int insertBoard(@Param("title") String title, @Param("contents") String contents,
			@Param("userName") String userName, @Param("birth") Date birth, @Param("gender") String gender);

}
