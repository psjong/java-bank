package com.bitcamp.bank.domains;

public class CustomerBean extends MemberBean {
	 private String credit;
	 
	 public void setCredit(String credit) {
		 this.credit = credit;
	 }
	 public String getCredit() {
		 return this.credit;
	 }
	 
	 @Override
		public String toString() {
		 return String.format("아이디 : %s \n"
		 		+ "비밀번호 : %s \n"
		 		+ "이름 : %s \n"
		 		+ "신용도 : %s", super.getId(),super.getPass(), super.getName(), credit);
		}
	
}
