package site.metacoding.demo;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.demo.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // DS가 four 오브젝트를 받아서 리턴 받고 해당 오브젝트를 MessageConverter에게 전달 
	}
	
	//두번째 방법
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		
		ResponseEntity<Four> response = new ResponseEntity<>(four,HttpStatus.OK);// Http를 응답할때 상태를 같이 응답 해주어야 한다.(OK)
		return response; // DS가 four 오브젝트를 받아서 리턴 받고 해당 오브젝트를 MessageConverter에게 전달 
	}
	
	@GetMapping("/four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1,"성공",four); // 코드 , msg : 성공, 
	}
	
	
}
