package com.winbit.project1.pattern.TemplateMethod;

// 템플릿 메서드 패턴
// => 공통 로직을 부모 클래스에 정의하고, 변하는 부분을 자식 클래스에 구현

// 1. 템플릿 추상 클래스
public abstract class PostHandlerTemplate {
	
	// 템플릿 메서드(변경 불가, 실행 순서 고정)
	public final void handlePost(String title) {
		validate(title);	// 공통 처리
		save(title);		// 개별 처리(추상메서드)
		notifyUsers(title); // 공통 처리
	}
	
	protected void validate(String title) {
		if(title == null || title.isEmpty()) {
			throw new IllegalArgumentException("제목 필수");
		}
	}
	
	// 하위(자식) 클래스에서 구현해야 할 부분
	protected abstract void save(String title);
	
	protected void notifyUsers(String title) {
		System.out.println("새 게시글 알림 : " + title);
	}
	
}
