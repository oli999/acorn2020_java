package test.dto;

public class BirthDto {
	//필드 정의 하기
	private int num;
	private String name;
	private String birth;
	
	//디폴트 생성자 
	public BirthDto() {}

	public BirthDto(int num, String name, String birth) {
		super();
		this.num = num;
		this.name = name;
		this.birth = birth;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
