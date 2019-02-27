package com.flipkart;

public class PojoClass {

	
	private String email;
	private String password;
	private String repeatpassword;
	public PojoClass(String email, String password, String repeatpassword) {
		super();
		this.email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
//	@Override
//	public String toString() {
//		return "PojoClass [email=" + email + ", password=" + password + ", repeatpassword=" + repeatpassword
//				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRepeatpassword()="
//				+ getRepeatpassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}

}
