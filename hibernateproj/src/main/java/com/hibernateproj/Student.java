package com.hibernateproj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name="Stud")
public class Student {
@Id //primary key
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name="Learners_Name",length=20,nullable=false,unique=true)
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
