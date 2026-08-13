package com.yonsai.Day57_20260812_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 서버에서 응답할때 html 파일을 주고 싶을때
public class NaverController {

	@GetMapping("/")
	public String main () {
		return "redirect:index.html";
	}
	
	// 네이버 블로그 페이지 보여줘!
		@GetMapping("/blog")
		public String blog() {
	 return "redirect:blog.html";
		}
	
}
