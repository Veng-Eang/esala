package com.vengeang.esala.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {
//	@NotNull(message = "Not null error custom!")
	@NotNull
	private Integer id;

	@NotBlank
	@NotEmpty
	private String name;
	private String gender;
	
	public User() {
		super();
	}
	public User(@NotNull Integer id,@NotBlank @NotEmpty String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
