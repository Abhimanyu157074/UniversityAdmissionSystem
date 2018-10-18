package com.capgemini.uas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Programs_Offered")
public class ProgramOfferedBean {
	
	//Variable Declaration
	@Id
	private String progName;
	private String desc;
	private String appEligibility;
	private int duration;
	private String degreeOffered;
	
	
	//Getters and Setters Methods
	@Column(name="ProgramName")
	public String getProgName() {
		return progName;
	}
	public void setProgName(String progName) {
		this.progName = progName;
	}
	
	@Column(name="description")
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Column(name="applicant_eligibility")
	public String getAppEligibility() {
		return appEligibility;
	}
	public void setAppEligibility(String appEligibility) {
		this.appEligibility = appEligibility;
	}
	
	@Column(name="duration")
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Column(name="degree_certificate_offered")
	public String getDegreeOffered() {
		return degreeOffered;
	}
	public void setDegreeOffered(String degreeOffered) {
		this.degreeOffered = degreeOffered;
	}
	
	//toString() Method Overriden
	@Override
	public String toString() {
		return "Program Offered\nName = " + progName + "\nDescription = " + desc
				+ "\nEligibility Criteria = " + appEligibility + "\nDuration = "
				+ duration + "\nDegree Offered = " + degreeOffered + "]";
	}
	
	
	// Parameterized Constructor
	public ProgramOfferedBean(String progName, String desc, String appEligibility,
			int duration, String degreeOffered) {

		this.progName = progName;
		this.desc = desc;
		this.appEligibility = appEligibility;
		this.duration = duration;
		this.degreeOffered = degreeOffered;
	}
	
	// Default Constructor
	public ProgramOfferedBean() {
		
	}
}
