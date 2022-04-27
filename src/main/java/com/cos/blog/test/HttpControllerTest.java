package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {

	@GetMapping("/test/hello")
	public String getTest() {
		System.out.println("sdlkfjsdf");
		return "get요청";
	}
	
	@GetMapping("/zzz")
	public String zzz() {
		return "zz";
	}
}
