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

	// �Խ��� ��ȸ
	public List<BoardVo> getListBoard();
	
	// �Խ��� ���   @mapper �������̽����� �����ϰ��� �ϴ� �������� @param�� ���
	public int insertBoard(@Param("title") String title, @Param("contents") String contents,
			@Param("userName") String userName, @Param("birth") Date birth, @Param("gender") String gender);

}
