package site.metacoding.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.demo.domain.Third;

// 고급 데이터 받기(Json, x-www-form-~,text) 

@RestController
public class ThirdController {
	
		// RequestDto 라고 한다. 
		@PostMapping("/third")
		// 오브젝트 타입을 넘겨서 받아주면 오브젝트로 가서 set을 실행해 준다. 
		// set을 하지 않아도 Spring에서 자동으로 set을 실행 해 준다. 
		public String postData(Third third) {
			return "id : "+ third.getId()+", title : "+third.getTitle()+", content : "+third.getContent();
		}
		
		
		//UPDATE third SET title=?,content=?, WHERE id =?
		@PutMapping("/third/{id}")// id(PK)는 WHERE절이기 때문에 주소값에 담는다. 
		public String putData(@PathVariable Integer id,  Third third) {
			return third.toString();
		}
		
		@PutMapping("/third/{id}/json") // id(PK)는 WHERE절이기 때문에 주소값에 담는다.
		public String putJsonData(@PathVariable Integer id, @RequestBody Third third) {
			return third.toString();
		}
}
