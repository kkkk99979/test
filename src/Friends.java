
public class Friends {

	private String name;
	private String phone;
	private String school;
	
	public Friends(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public Friends(String name) {
		super();
		this.name = name;
	}
	public Friends(String name, String phone, String school) {
		super();
		this.name = name;
		this.phone = phone;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void show() {
		System.out.printf("이름:%s 핸드폰:%s 학교:%s\n",getName(),getPhone(),getSchool());
	}

}
