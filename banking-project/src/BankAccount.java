
public class BankAccount {

	public String bankName;
	public String accountHoldeName;
	private long acoountNumber;
	public String ifscCode;

	public BankAccount() {
		System.out.println("Created BankAccounts  details");
	}

	public BankAccount(String bankName, String accountHoldeName, long acoountNumber, String ifscCode) {
		super();
		this.bankName = bankName;
		this.accountHoldeName = accountHoldeName;
		this.acoountNumber = acoountNumber;
		this.ifscCode = ifscCode;
	}

	public long getAcoountNumber() {
		return acoountNumber;
	}

	public void setAcoountNumber(long acoountNumber) {
		this.acoountNumber = acoountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", accountHoldeName=" + accountHoldeName + ", ifscCode=" + ifscCode
				+ "]";
	}

}
