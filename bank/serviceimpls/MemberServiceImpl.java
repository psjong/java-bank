package com.bitcamp.bank.serviceimpls;
import com.bitcamp.bank.domains.*;
import com.bitcamp.bank.services.MemberService;

public class MemberServiceImpl implements MemberService{

	private CustomerBean[] customers;
	private EmployeeBean[] employees;
	private int cusCount, empCount;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		employees = new EmployeeBean[10];
		cusCount = 0;
		empCount = 0;
	}
	
	@Override
	public void customerJoin(CustomerBean param) {
		customers[cusCount] = param;
		cusCount++;
	}

	@Override
	public void employeeJoin(EmployeeBean param) {
		employees[empCount] = param;
		empCount++;
	}

	@Override
	public CustomerBean[] findAllCustomers() {
		CustomerBean[] cust = new CustomerBean[cusCount];
		for(int i=0 ; i<cusCount ; i++) {
			cust[i] = customers[i];
		}
		return cust;
	}

	@Override
	public EmployeeBean[] findAllEmployees() {
		EmployeeBean[] empl = new EmployeeBean[empCount];
		for(int i=0 ; i<empCount ; i++) {
			empl[i] = employees[i];
		}
		return empl;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int count1 = 0 ;
		int count2 = 0 ;
		for(int i=0 ; i<cusCount ; i++) {
			if(name.equals(customers[i].getName())) {
				count1++;
			}
		}
		for(int i=0 ; i<empCount ; i++) {
			if(name.equals(employees[i].getName())) {
				count2++;
			}
		}
		MemberBean[] members = new MemberBean[count1+count2];
		int j=0;
		for(int i=0 ; i<cusCount ; i++) {
			if(name.equals(customers[i].getName())) {
				members[j]=customers[i];
				j++;
				if(j==count1) {
					break;
				}
			}
		}
		for(int i=0 ; i<empCount ; i++) {
			if(name.equals(employees[i].getName())) {
				members[j]=customers[i];
				j++;
				if(j==count1+count2) {
					break;
				}
			}
		}
		return members;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0 ; i<cusCount ; i++) {
			if(id.equals(customers[i].getId())) {
				member = customers[i];
				break;
			}
		}
		for(int i=0 ; i<empCount ; i++) {
			if(id.equals(employees[i].getId())) {
				member = employees[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean login(MemberBean param) {
		boolean flag = false;
		for(int i=0 ; i<cusCount ; i++) {
			if(param.getId().equals(customers[i].getId())
					&& param.getPass().equals(customers[i].getPass())) {
				flag = true;
				break;
			}
		}
		for(int i=0 ; i<empCount ; i++) {
			if(param.getId().equals(employees[i].getId())
					&& param.getPass().equals(employees[i].getPass())) {
				flag = true;
				break;
			}
		}		
		return flag;
	}

	@Override
	public int countCustomers() {
		return cusCount;
	}

	@Override
	public int countEmployee() {
		return empCount;
	}

	@Override
	public boolean existId(String id) {
		boolean flag = false;
		for(int i=0 ; i<cusCount ; i++) {
			if(id.equals(customers[i].getId())) {
				flag = true;
				break;
			}
		}
		for(int i=0 ; i<empCount ; i++) {
			if(id.equals(employees[i].getId())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void updatePass(MemberBean param) {
		String[] pws = param.getPass().split(",");
		param.setPass(pws[0]);
		if(login(param)) {
			for(int i=0 ; i<cusCount ; i++) {
				if(param.getPass().equals(customers[i].getPass())) {
					param.setPass(pws[1]);
					break;
				}
			}
			for(int i=0 ; i<empCount ; i++) {
				if(param.getPass().equals(employees[i].getPass())) {
					param.setPass(pws[1]);
					break;
				}
			}
		}
	}

	@Override
	public void deleteMember(MemberBean param) {
		if(login(param)) {
			for(int i=0 ; i<cusCount ; i++) {
				if(param.getId().equals(customers[i].getId())) {
					customers[i] = customers[cusCount-1];
					cusCount--;
					break;
				}
			}
			for(int i=0 ; i<empCount ; i++) {
				if(param.getId().equals(employees[i].getId())) {
					employees[i] = employees[cusCount-1];
					empCount--;
					break;
				}
			}
		}
	}


}
