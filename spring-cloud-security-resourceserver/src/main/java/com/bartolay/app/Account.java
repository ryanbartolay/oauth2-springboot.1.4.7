package com.bartolay.app;

public class Account {
	private long id;
	private String accountNumber;
	private String holderName;
	private String bankName;
	
	public Account() {
		super();
	}
	public Account(long id, String accountNumber, String holderName, String bankName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.bankName = bankName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", holderName=" + holderName + ", bankName="
				+ bankName + "]";
	}
}
