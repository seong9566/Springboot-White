package site.metacoding.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기 
// GET -> QueryString , PathVariable(PK)-> Form(Get) -> 브라우저( 주소뒤 ? 붙이기)
// get도 http body가 없다

// POST , PUT -> http body에 담아준다 -> Form(POST) -> JS

// DELETE 는 http body가 없다 -> QueryString(WHERE값이 PK가 아닐 경우 사용), PathVariable(WHERE이 PK일 경우 사용를 사용 한다. 

@RestController
public class SecondController {
	@GetMapping("/second/{id}") // pk가 1인 값을 받기 - PathVariable 사용
	public String getData(@PathVariable Integer id) {
		return "id :" +id;
	}
	
	// QueryString는 x-www-form ~ 타입이다. 
	// header에 담아 보낸다.
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title : "+ title + " ,content : "+ content;
	}
	
	// body에 담아 보낸다.
	// Spring이 BufferedReader로 title=제목&content=내용을 받는다, content 타입은 x-www-form~
	@PostMapping("/second")
	public String postData(String title,String content) {// 스프링 파싱 기본 전략(데이터 받기) : x-www-form ~
		return "title : "+ title + " ,content : "+ content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) {// 스프링 파싱 기본 전략(데이터 받기) : x-www-form ~
		return "title : "+ title + " ,content : "+ content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) {// 스프링 파싱 기본 전략(데이터 받기) : x-www-form ~
		return "id : "+id;
	}
	
	
}
