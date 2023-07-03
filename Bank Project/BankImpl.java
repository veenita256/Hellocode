package com.icici;

public class BankImpl implements Bank{
	int balance;

	public BankImpl(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(int amount) {
		System.out.println("Amount Depositing Rs."+amount);
		balance += amount;//balance=balance+amount;
		System.out.println("Ammount Added Successfully");
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= balance) {
			System.out.println("Amount Withdrawing Rs."+amount);
			balance=balance-amount;//balance -= amount;
			System.out.println("Amount Added Successfully");
		}
		else {
			try {
				throw new InsufficientBalanaceException("Insufficient Balance!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public int getBalance() {
		return balance;
	}

}
