package com.capgemini.java_dev.framework.hibernate_jpa;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student implements Serializable{
	@Id
	private Integer id;
	private String name;
	private String email;
	private Long phn;
	public Student() {
		
	}
	public Student(Integer id, String name, String email, Long phn) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phn = phn;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhn() {
		return phn;
	}
	public void setPhn(Long phn) {
		this.phn = phn;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phn=" + phn + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(phn, other.phn);
	}
	
	
	
	
	
	
	

}
