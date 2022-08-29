package site.metacoding.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studyController {
	
	@GetMapping("/study/{id}") //SELECT 할때 사용
	public String getData(@PathVariable Integer id) {
		return "id : "+id;
	}
	
	@GetMapping("/study")
	public String getData2(String title, String content) {// PK값이 아닐 경우 쿼리 스트링 방식
		return "title : "+title+ " / content : "+ content ;
	}
	
	@PostMapping("/study")
	public String postData(String title, String content) {// 데이터를 Insert
		return "title : "+title+ " / content : "+ content ;
	}
	
	@DeleteMapping("/study/{id}")
	public String deleteData(@PathVariable Integer id) {
		return "id : " + id ;
		
	}
	
//	@PutMapping("/study") // UPDATE
//	public String putData(String title, String content) {
//		return "title : "+title+ " / content : "+ content ;
//	}
}
