package com.lti.mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentData")
public class Student {
	
	@Id
	@Column(name="studentid")
	private int studid;
	
	@Column(name="studentname")
	private String sname;
	
	
	@Column(name="Gender")
	private String gender;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "SMCDetails",joinColumns= {@JoinColumn(referencedColumnName="studentid")},
       inverseJoinColumns = {@JoinColumn(referencedColumnName = "courseid")})
	private Set<Course> courses;
	
	public Student() {
		super();
		
	}
	
	
	public Student(int studid, String sname, String gender) {
		super();
		this.studid = studid;
		this.sname = sname;
		this.gender = gender;
	}




	public int getStudid() {
		return studid;
	}


	public void setStudid(int studid) {
		this.studid = studid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="studentsCourse")
	private Course course;
	
	public Student() {
		super();
		
	}
	
	public Student(int studid, String sname, Course course) {
		super();
		this.studid = studid;
		this.sname = sname;
		this.course = course;
	}

	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}*/

}
