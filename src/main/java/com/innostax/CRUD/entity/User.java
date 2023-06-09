package com.innostax.CRUD.entity;




public class User implements Comparable{
	private int id ;
	private String name ; 
	private String email ; 
	private int age ;
	
	public User () {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public User(int id, String name, String email, int age) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}


	@Override
	public int compareTo(Object o) {
		User u = (User) o;
		return this.name.compareTo(u.name);
	}
}
