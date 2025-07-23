package com.ajit.association;

public class Association {
	
	public static void main(String[] args) {
		Bank b = new Bank("SBI");
		Bank b1 = new Bank();
		b1.setBank("Ajit Bank Of India");
		b1.setId(500);
		System.out.println(b1.getId());
		System.out.println(b1.getBankName());
		Employee e1 = new Employee("Ajit");
		Employee e2 = new Employee("Ramesh");

		System.out.println(b.getBankName());
		System.out.println(e1.getEmployee());

		System.out.println(e2.getEmployee());

	}

}

class Bank {

	private int id;
	private String name;

	public Bank() {

	}

	public Bank(String name) {
		this.name = name;

	} 
	public Bank(int id) {
		this.id = id;
	}

	public Bank(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
	public void setBank(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int i) {
		this.id = i;
	}

}
class Employee {
	private int id;
	private String name;
	
	public Employee() {
		
	}
	public Employee(int id) {
		this.id = id;
	}
		
	Employee(String name) {
		this.name = name;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getEmployee() {
		return this.name;
	}
}


