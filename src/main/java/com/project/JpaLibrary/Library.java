package com.project.JpaLibrary;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
	@Id
	private int lid;
	private String lname;
	private String branch;
	
	@OneToMany
	private List<Student>student;

	public Library(int lid, String lname, String branch, List<Student> student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.branch = branch;
		this.student = student;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", branch=" + branch + ", student=" + student + "]";
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
}
