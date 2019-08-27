package com.bitcamp.bank.domains;

public class MemberBean {

	private String id, pass, name ;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.pass;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	@Override
	public String toString() {
		return String.format("아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "이름 : %s \n"
				+ "주민번호 : %s \n", id, pass, name);
	}
	
}



