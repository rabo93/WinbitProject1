package com.winbit.project1.dto;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data
public class BoardDTO {
	
	private int idx;
	private String writer;
	private String title;
	private String content;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // JSON 응답 시 날짜 포맷 지정 (Jackson)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 요청 파라미터 → LocalDateTime 변환 시 포맷 지정 (예: 컨트롤러에서 바인딩할 때)
	private LocalDateTime regDate;
	private int hit;
	
	
	
}
