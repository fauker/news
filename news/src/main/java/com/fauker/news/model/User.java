package com.fauker.news.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fauker.news.util.Repository;

@Entity
@Table(name = "news_user")
public class User extends Repository {

	private static final long serialVersionUID = -7956709754169326705L;

	@Id
	private Long id;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
