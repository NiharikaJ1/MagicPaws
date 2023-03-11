package com.springcore.MagicPaws.entity;

public class appointmentDetails {
private String appointmentNo;
private String cost;
private String atime;
private String adate;
private long id;
private String service;
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public String getAppointmentNo() {
	return appointmentNo;
}
public void setAppointmentNo(String appointmentNo) {
	this.appointmentNo = appointmentNo;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getAtime() {
	return atime;
}
public void setAtime(String atime) {
	this.atime = atime;
}
public String getAdate() {
	return adate;
}
public void setAdate(String adate) {
	this.adate = adate;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Override
public String toString() {
	return "appointmentDetails [appointmentNo=" + appointmentNo + ", cost=" + cost + ", atime=" + atime + ", adate="
			+ adate + ", id=" + id + ", service=" + service + ", getService()=" + getService() + ", getAppointmentNo()="
			+ getAppointmentNo() + ", getCost()=" + getCost() + ", getAtime()=" + getAtime() + ", getAdate()="
			+ getAdate() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}