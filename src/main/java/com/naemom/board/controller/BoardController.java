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
	 * @param model ��� ��
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start(Locale locale, Model model) {
		
		//���ÿ��� date�� get
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		// date ����
		String formattedDate = dateFormat.format(date);
		
		// model�� ���  add
		model.addAttribute("serverTime", formattedDate );
		
		// index ȭ�� ǥ��
		return "index";
	}
	
	/**
	 * �Խ��� list
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listBoard() throws Exception {
		
		// ��ȸ ���񽺸� ���� result ����
//		List<BoardVo> result = BoardService.getListBoard();

		// ȭ�������� ���� mav
		ModelAndView mav = new ModelAndView();
		
		// mav�� ��ȸ ����� ������ ȭ�� set >> model���� mav�� ���� ȣȯ
		mav.setViewName("/board");
		
		// ��ȸ ��� result�� ȭ�� board�� �ִ´�.
		mav.addObject("board");

		return mav;
	}
	
	/**
	 * �Խ��� �� insert
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ModelAndView boardNew() throws Exception {

		// ȭ�� ������ ���� mav ����
		ModelAndView mav = new ModelAndView();
		
		// ȭ�� ����
		mav.setViewName("/insertBoard");

		return mav;
	}

}