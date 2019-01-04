package com.test02;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private String name;
	private transient String addr;
	private static String tel;

	@SuppressWarnings("static-access")
	public Address(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	@SuppressWarnings("static-access")
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}

}
