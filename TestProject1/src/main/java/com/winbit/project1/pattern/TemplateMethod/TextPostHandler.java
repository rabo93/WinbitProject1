package com.winbit.project1.pattern.TemplateMethod;

import org.springframework.stereotype.Component;

// 2. 자식클래스 - 텍스트 게시글 저장 방식 구현
@Component
public class TextPostHandler extends PostHandlerTemplate{
	protected void save(String title) {
		System.out.println("텍스트 게시글 저장 : " + title);
	}
}
