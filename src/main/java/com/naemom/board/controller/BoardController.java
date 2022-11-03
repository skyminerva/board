package com.naemom.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naemom.board.service.BoardService;

/**
 * BoardController
 * 
 * @author JW-CHOI
 *
 */
@Controller
public class BoardController {
	
	// logger
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// service
	@Autowired
	private BoardService boardService;
	
	/**
	 * 
	 * @param locale 
	 * @param model 결과 값
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(Locale locale, Model model) {
		
		//로컬에서 date를 get
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		// date 포맷
		String formattedDate = dateFormat.format(date);
		
		// model에 결과  add
		model.addAttribute("serverTime", formattedDate );
		
		// index 화면 표시
		return "index";
	}
	
	/**
	 * 게시판 list
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listBoard() throws Exception {
		
		// 조회 서비스를 수행 result 생성
//		List<BoardVo> result = BoardService.getListBoard();

		// 화면정보를 담을 mav
		ModelAndView mav = new ModelAndView();
		
		// mav에 조회 결과를 전달할 화면 set >> model보다 mav가 상위 호환
		mav.setViewName("/board");
		
		// 조회 결과 result를 화면 board에 넣는다.
		mav.addObject("board");

		return mav;
	}
	
	/**
	 * 게시판 글 insert
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ModelAndView boardNew() throws Exception {

		// 화면 정보를 가질 mav 생성
		ModelAndView mav = new ModelAndView();
		
		// 화면 정보
		mav.setViewName("/insertBoard");

		return mav;
	}

}