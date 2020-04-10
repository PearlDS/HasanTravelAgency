package be.intecBrussel;

public class Person {
	private String name;
	private String lastName;
	private Address address;
	
	public Person () {
		
	}
	public Person (String name,String lastName , Address address) {
		this.name=name;
		this.lastName= lastName;
		this.address= address;
	}
	public String getName() {
		//TODO: Pro-tip! never leave code in comments, unless it's meant to explain something. Points can get substracted otherwise
		//System.out.println("Ahmad");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		//System.out.println("The inf of the person:");
		return "The info of the person:   " + getName() +" " + getLastName() + " " + getAddress();
		
	}
}
