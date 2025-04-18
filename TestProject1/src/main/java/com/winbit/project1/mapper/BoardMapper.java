package com.winbit.project1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.winbit.project1.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	// 게시글 목록 불러오기
	List<BoardDTO> getBoardList();

	// 조회수 증가 처리
	void updateHit(int idx);
	
	// idx에 해당하는 게시글 상세 조회
	BoardDTO getBoardById(int idx);

	
	
	
	
	
	
}
