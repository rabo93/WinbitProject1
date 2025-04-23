package com.winbit.project1.pattern.TemplateMethod;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	//의존성 추가
	private final TextPostHandler textPostHandler;
	
	public PostController(TextPostHandler textPostHandler) {
		this.textPostHandler = textPostHandler;
	}
	
	@PostMapping("/text-post")
	public String post(@RequestParam String title) {
		textPostHandler.handlePost(title);
		return "작성완료";
	}
	
}
