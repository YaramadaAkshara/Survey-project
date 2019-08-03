package com.example.demo.survey;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Domainrequest {
	
	private String email;
	private String email1;
	private int qa1;
	private int qa2;
	private int qa3;
	private int qa4;
	private int qa5;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + qa1;
		result = prime * result + qa2;
		result = prime * result + qa3;
		result = prime * result + qa4;
		result = prime * result + qa5;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domainrequest other = (Domainrequest) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (email1 == null) {
			if (other.email1 != null)
				return false;
		} else if (!email1.equals(other.email1))
			return false;
		if (qa1 != other.qa1)
			return false;
		if (qa2 != other.qa2)
			return false;
		if (qa3 != other.qa3)
			return false;
		if (qa4 != other.qa4)
			return false;
		if (qa5 != other.qa5)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Domainrequest [email=" + email + ", email1=" + email1 + ", qa1=" + qa1 + ", qa2=" + qa2 + ", qa3=" + qa3
				+ ", qa4=" + qa4 + ", qa5=" + qa5 + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
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

}
