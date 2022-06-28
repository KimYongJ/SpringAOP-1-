package com.spring.common;

public class loginNoticeAspect {
	//로그인 성공시 실행되는 공통 로직
	public void noticeLoginUser(Object name) {
		if(name!=null) {
			System.out.println("환영 합니다 " + name + "님");
		}
	}
	public void noticeLoginSuccess(Object name) {
		if(name!=null) {
			System.out.println(name + "님 로그인 성공");
		}
	}
	//로그인 실패시 실행되는 공통 로직
	public void noticeLoginException(Exception e) {
		System.out.println("발생된 문제 : "+e.getMessage());
	}
	
}
