package day03;

public class Bank {

	// rule 1: variables must be private
	
	private String bankName;
	private int bankCode;
	
	// rule 2: must have setter and getter methods
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	
	
}
