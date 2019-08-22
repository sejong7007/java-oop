package com.bitcamp.domains;

public class MemberBean {

	private String id, pw, name, snn, birth, adult, blood;
	private double height, weight;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return this.name;
	}

	public void setSnn(String snn) {
		this.snn = snn ;
	}
	public String getSnn() {
		return this.snn;
	}
	
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return this.birth;
	}
	
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getAdult() {
		return this.adult;
	}
	
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		//아이디, 비밀번호, 이름, 주민번호, 키, 몸무게, 혈액형
		return String.format("[회원정보 \n"
				+ "아이디 : %s \n" 
				+ "비밀번호 : %s \n" 
				+ "이름 : %s \n"
				+ "주민번호 : %s \n" 
				+ "생년월일 : %s \n" 
				+ "성인여부 : %s\n" 
				+ "키 : %scm \n" 
				+ "몸무게 : %sfkg \n" 
				+ "혈액형 : %s형 ]\n", 
				id, pw, name,snn, birth, adult,height, weight, blood);
	}
	
	
}















