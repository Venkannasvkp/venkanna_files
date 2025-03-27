package basicsofjava;

public class Account {
	
	private int accountId;
	private int CustomerId;
	private int type;
	private int balance;
   
	public Account(int accountId, int customerId, int type, int balance) {
		super();
		this.accountId = accountId;
		CustomerId = customerId;
		this.type = type;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", CustomerId=" + CustomerId + ", type=" + type + ", balance="
				+ balance + "]";
	}

}
