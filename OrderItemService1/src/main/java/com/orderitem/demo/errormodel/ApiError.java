package com.orderitem.demo.errormodel;

public class ApiError {
	
	private String feildname;
	private String errormessage;
	private Integer statuscode;
	public Integer getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}
	public String getFeildname() {
		return feildname;
	}
	public void setFeildname(String feildname) {
		this.feildname = feildname;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	

}
