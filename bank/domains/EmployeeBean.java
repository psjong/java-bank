package com.bitcamp.bank.domains;

public class EmployeeBean extends MemberBean {

	private int sabun;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getSabun() {
		return this.sabun;
	}
	
	@Override
		public String toString() {
			return String.format("이름 : %s \n"
					+ "사번 : %d \n", super.getName(), sabun);
		}
	
}
