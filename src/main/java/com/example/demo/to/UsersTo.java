package com.example.demo.to;

public class UsersTo {

	private Long id;
	private String name;
	private String email;
	
	public UsersTo() {}
	
	public UsersTo(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UsersTo(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Users[id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
