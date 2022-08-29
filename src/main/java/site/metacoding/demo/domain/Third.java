package site.metacoding.demo.domain;

public class Third {
	private Integer id;
	private String title;
	private String content;
	
	
	
	// Source -> toString으로 생성 
	@Override
	public String toString() {
		return "Third [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	

	// 로그 남기기 위해 디폴트 생성자 만듦
	public Third() {
		System.out.println("디폴트 생성자 실행됨.");
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		System.out.println("setId 실행됨.");
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("setTitle 실행됨.");
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		System.out.println("setContent 실행됨.");
		this.content = content;
	}
	
	
}
