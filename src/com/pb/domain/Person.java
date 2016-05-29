package com.pb.domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Person {
	Integer id;
	@NotEmpty
	String name;
	
	Integer age;
	@Email
	String email;
	@Past
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date bithday;
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", bithday=" + bithday
				+ "]";
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBithday() {
		return bithday;
	}
	public void setBithday(Date bithday) {
		this.bithday = bithday;
	}
}
