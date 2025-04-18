package com.winbit.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.winbit.project1.controller.BoardController;
import com.winbit.project1.dto.BoardDTO;
import com.winbit.project1.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;

	
	// 게시글 목록 불러오기
	public List<BoardDTO> getBoardList() {
		return boardMapper.getBoardList();
	}

	// 조회수 증가 처리
	public void incrementHit(int idx) {
		boardMapper.updateHit(idx);
	}
	
	// idx에 해당하는 게시글 상세 조회
	public BoardDTO getBoardById(int idx) {
		return boardMapper.getBoardById(idx);
	}
	
	

}
