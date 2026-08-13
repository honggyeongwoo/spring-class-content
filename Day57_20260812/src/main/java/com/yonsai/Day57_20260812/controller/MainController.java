package com.yonsai.Day57_20260812.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//URL이 들어오면 처리할 수있도록! 간편하게 세팅을 해주는 
//키워드!
//Controller키워드
//브라우저에서 요청(URL)이 들어왔을 때
//어떤 작업을 처리할지 작성하는 자바파일
//쉽게 말하면 요청 처리 담당자!

//자바파일이 스프링한테 알려주는 표시!
//spring initalizr  스프링 부트 프로젝트를 만들어주는 시작 도구!
//springboot  우리가 실제로 사용하는 개발환경 세팅!
//톰캣 세팅부터 스프링세팅까지 모두 자동으로 해준다.

@RestController
public class MainController {
	
	@GetMapping("/hello")
	public String hello() {
	return "Hello Spring";
	
	/*
	@GetMapping("/login")
	public String login() {
		return "login처리함";
	*/	
	}

}
