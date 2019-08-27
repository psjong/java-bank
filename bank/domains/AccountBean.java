package com.bitcamp.bank.domains;

public class AccountBean {

	private String accountNum, today;
	private int money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return this.today;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	
	@Override
		public String toString() {
			return String.format("계좌번호 : %s \n"
					+ "거래일 : %s \n"
					+ "입금액 : %d \n", accountNum,today,money);
		}
	
}
