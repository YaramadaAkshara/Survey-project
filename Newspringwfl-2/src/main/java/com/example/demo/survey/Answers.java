package com.example.demo.survey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answers {
	
    @Autowired
	Userentity obj;
	
	@Id
	@GeneratedValue
	@Column(name="userno")
	private int userno;
	@Column(name="email")
	@JsonIgnore
	public String email=obj.getEmail();
	@Column(name="userqA1")
	private int qa1;
	@Column(name="userqA2")
	private int qa2;
	@Column(name="userqA3")
	private int qa3;
	@Column(name="userqA4")
	private int qa4;
	@Column(name="userqA5")
	private int qa5;
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQa1() {
		return qa1;
	}
	public void setQa1(int qa1) {
		this.qa1 = qa1;
	}
	public int getQa2() {
		return qa2;
	}
	public void setQa2(int qa2) {
		this.qa2 = qa2;
	}
	public int getQa3() {
		return qa3;
	}
	public void setQa3(int qa3) {
		this.qa3 = qa3;
	}
	public int getQa4() {
		return qa4;
	}
	public void setQa4(int qa4) {
		this.qa4 = qa4;
	}
	public int getQa5() {
		return qa5;
	}
	public void setQa5(int qa5) {
		this.qa5 = qa5;
	}
	@Override
	public String toString() {
		return "Answers [userno=" + userno + ", email=" + email + ", qa1=" + qa1 + ", qa2=" + qa2 + ", qa3=" + qa3
				+ ", qa4=" + qa4 + ", qa5=" + qa5 + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
