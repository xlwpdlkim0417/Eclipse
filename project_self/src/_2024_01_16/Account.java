package _2024_01_16;

import java.io.Serializable;

public class Account implements Serializable {

	String name;
	String ssn;
	String phn;
	String id;
	String pw;
	int balance;

	public Account() {

	}

	public Account(String name, String ssn, String phn, String id, String pw, int balance) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phn = phn;
		this.id = id;
		this.pw = pw;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", phn=" + phn + ", id=" + id + ", pw=" + pw + ", balance="
				+ balance + "]";
	}

}