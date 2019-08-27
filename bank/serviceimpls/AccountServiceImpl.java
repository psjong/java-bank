package com.bitcamp.bank.serviceimpls;

import com.bitcamp.bank.domains.AccountBean;
import com.bitcamp.bank.services.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountBean[] account = null;
	private int count;
	
	public AccountServiceImpl () {
		account = new AccountBean[10];
		count = 0;
	}
	
	@Override
	public void createAccount(int money) {
		account[count] = new AccountBean();
		count++;
		
		
	}

	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
