package by.htp.hometask.view;

import by.htp.hometask.bean.*;

public class PrintInfo {
	
	public void printCustomer(Customer customer) {
		
		System.out.println(customer);
		
	}
	
	public void printSum(int sum) {
		
		System.out.println("Сумма по счетам " + sum);
	}
	
	public void printAccount(BankAccount account) {
		
		System.out.println(account);
	}

}
