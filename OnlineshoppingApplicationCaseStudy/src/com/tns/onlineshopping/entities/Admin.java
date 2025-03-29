package com.tns.onlineshopping.entities;

public class Admin extends User {

    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", username=" + username + ", email=" + email + ", getUserId()="
				+ getUserId() + ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
