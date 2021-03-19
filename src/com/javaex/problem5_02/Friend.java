package com.javaex.problem5_02;

public class Friend {

	private String name;
	private String tel;
	private String school;
	
	
	public Friend() {
		super();
	}

	public Friend(String name, String tel, String school) {
		super();
		this.name = name;
		this.tel = tel;
		this.school = school;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.printf("이름:%s 핸드폰:%s 학교:%s\n",this.getName(),this.getTel(),this.getSchool());
	}
	
	
}
