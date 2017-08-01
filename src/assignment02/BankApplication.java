package assignment02;

class Bank{
	private Customer customer;
	
	Bank(Customer customer){
		this.customer = customer;
	}
	
	@Override
	public String toString(){ // converts object to string format
		return customer.toString(); // returns in the form of a object
	} // end of toString
}

class Customer{
	private Address address;
	
	Customer(Address address){
		this.address = address;
	}
	
	@Override
	public String toString(){ // converts object to string format
		return address.toString(); // returns in the form of a object
	} // end of toString
}

class Address{
	private String str;
	
	Address(String str){
		this.str = str;
	}
	
	@Override
	public String toString(){ // converts object to string format
		return str; // returns in the form of a object
	} // end of toString
	
}

public class BankApplication {

	public static void main(String[] args) {
		
		
		Address address = new Address("Bedok");
		Customer customer = new Customer(address);
		Bank bank = new Bank(customer);
		
		System.out.println(bank);
		
		
		

	}

}
