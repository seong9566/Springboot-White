package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class RespDto<T> {
	private Integer code; // -1 실패 1 성공
	private String msg; // 통신 결과를 메세지로 담기
	private T body;
	
	
}
