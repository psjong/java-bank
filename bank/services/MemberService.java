package com.bitcamp.bank.services;
import com.bitcamp.bank.domains.CustomerBean;
import com.bitcamp.bank.domains.MemberBean;
import com.bitcamp.bank.domains.EmployeeBean;

public interface MemberService {

	public void customerJoin(CustomerBean param);
	public void employeeJoin(EmployeeBean param);
	public CustomerBean[] findAllCustomers();
	public EmployeeBean[] findAllEmployees();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	boolean login(MemberBean param);
	int countCustomers();
	int countEmployee();
	boolean existId(String id);
	void updatePass(MemberBean param);
	void deleteMember(MemberBean param);
	
}


