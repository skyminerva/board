package com.naemom.board.dao.vo;

import java.util.Date;

/**
 * getter, setter
 * 
 * @author JW-CHOI
 *
 */

public class BoardVo {
	
	// id
	private String boardId;
	
	// title
	private String title;
	
	// 내용
	private String contents;
	
	//이름
	private String userName;
	//생일
	private Date birth;
	//성별
	private String gender;
	//등록날짜
	private Date createDate;
	// 수정날짜
	private Date updateDate;
	
	
	/**
	 * getter, setter
	 * @return
	 */
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	@Override
	public String toString() {
		return "BoardVo [boardId=" + boardId + ", title=" + title + ", contents=" + contents + ", userName=" + userName
				+ ", birth=" + birth + ", gender=" + gender + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}
	
	// sql 칼럼
	public BoardVo(String boardId, String title, String contents, String userName, Date birth, String gender,
			Date createDate, Date updateDate) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.contents = contents;
		this.userName = userName;
		this.birth = birth;
		this.gender = gender;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}



}