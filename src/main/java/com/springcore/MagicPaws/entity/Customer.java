package com.springcore.MagicPaws.entity;


public class Customer {
	
private String name;
private int mobileNo;
private String address;
private String patientName;
private String service;
private int id;
String username;


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", mobileNo=" + mobileNo + ", address=" + address + ", patientName=" + patientName
			+ ", service=" + service + ", id=" + id + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	
	this.name = name;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}