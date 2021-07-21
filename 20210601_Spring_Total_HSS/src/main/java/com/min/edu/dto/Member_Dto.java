package com.min.edu.dto;

public class Member_Dto {
	
	private String id;
	private String name;
	private String pw;
	private String auth;
	private String delflag;
	private String regdate;
	
	public Member_Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member_Dto(String id, String name, String pw, String auth, String delflag, String regdate) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.auth = auth;
		this.delflag = delflag;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Member_Dto [id=" + id + ", name=" + name + ", pw=" + pw + ", auth=" + auth + ", delflag=" + delflag
				+ ", regdate=" + regdate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
}
