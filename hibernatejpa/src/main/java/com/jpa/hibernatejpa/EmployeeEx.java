package com.jpa.hibernatejpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEx {
@Id
private int id;
@Column(name="Employee_Name")
private String Ename;
@Column(name="Employee_dep")
private String Edep;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getEdep() {
	return Edep;
}
public void setEdep(String edep) {
	Edep = edep;
}

public EmployeeEx() {
	super();
}
public EmployeeEx(int id, String ename, String edep) {
	super();
	this.id = id;
	Ename = ename;
	Edep = edep;
}
}
