package com.example.deploy_demo_alt_21.Model.DTO;

public class HelloAltResponse {
	String messsage;
	
	

	public HelloAltResponse(String messsage) {
		super();
		this.messsage = messsage;
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	@Override
	public String toString() {
		return "HelloAltResponse [messsage=" + messsage + "]";
	}
	
	
}
