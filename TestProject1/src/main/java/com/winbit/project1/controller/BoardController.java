package com.winbit.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.winbit.project1.dto.BoardDTO;
import com.winbit.project1.service.BoardService;


@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	//----------------------------------------------------------------------------------------
	// 게시글 목록 조회
	@ResponseBody
	@GetMapping("/getBoardList")
	public List<BoardDTO> getBoardList() {
		
		List<BoardDTO> result = boardService.getBoardList();
//		System.out.println("DB 결과 :  " + result.toString());
		// DB 결과 :  [BoardDTO(idx=1, writer=testid, title=제목1, content=내용1, regDate=Tue Apr 15 16:35:01 KST 2025, hit=0)
		//			, BoardDTO(idx=2, writer=김보라, title=제목2, content=내용2, regDate=Tue Apr 15 16:35:38 KST 2025, hit=10)]
		return result;
	}
	//----------------------------------------------------------------------------------------
	// 게시글 상세 내용 조회
	@GetMapping("/view")
	public String getDetailBoard(@RequestParam("idx") int idx, Model model) {
		//조회수 +1 처리
		boardService.incrementHit(idx);
		
		
		BoardDTO boardDTO = boardService.getBoardById(idx);
		System.out.println("DB 결과 :  " + boardDTO);
		//DB 결과 :  BoardDTO(idx=1, writer=testid, title=제목1, content=내용1, regDate=2025-04-15T16:35:01, hit=0)
		
		
		if(boardDTO != null) {
			model.addAttribute("board", boardDTO);
			return "board/board_detail";
		} else { // 게시글이 없는 경우
			model.addAttribute("msg", "게시글을 찾을 수 없습니다.");
			return "/";
		}
		
	}
	
	
	

	
}
