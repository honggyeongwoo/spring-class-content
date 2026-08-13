package com.yonsai.Day57_20260812_2.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 아래 RestController 가 없다면 그냥 일반 자바 파일임

@RestController // 나는 서버를 만들겠다. 
public class HomeController {
	
	// 어떤 url을 처리하려고?
	// 리액트로 하나의 화면을 만들면 -> 하나의 url이 생성되고
	// 하나의 처리하는 자바코드랑 연결하면 됨. (Spring)
	@GetMapping("/hi") // /hi라는 url이 들어오면 실행
	public String hi() {
		
		// return? 유저에게 보낼 데이터를 적는, 연결된 프론트엔드 코드로 보내진다.
		return "안녕하세요 hi랑 연결된 서버 입니다.";
	}

@GetMapping("/main2") // 메인페이지 접속 했을 때	
public String main2() {
	
	return "main 페이지 입니다.";
}
	
@GetMapping("/mypage")
public String mypage() {
	
	return "마이페이지 입니다.";
}

@GetMapping("/date")
public String date() {
	
    return LocalDateTime  //현재 실시간으로 시간을 가져오는 라이브러리
    		.now() // 현재 시간가져와!
    		.toString();  // date타입을 문자로 변경해서 화면 에띄운다.
}



}

/*
 * 데이터를 달라고 요청할때는 규칙(HTTP) 
 * 
 *  요청종류
 *  GET  - 서버에게 데이터 달라고 할 때 (데이터나 웹페이지)
 *  POST - 서버에게 데이터를 보내고 싶을 때 
 *         네이버 회원가입할께! 
 *         유튜브 최근목록(나중에 볼 목록)에 영상 저장해줘!
 * 
 * 
 * 
 * 
 * 
 */
