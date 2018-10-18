package com.capgemini.uas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;


@Entity
@Table(name = "Application")
public class ApplicantBean {
	
	@Id
	private int appId;
	private String appName;
	private Date appDOB;
	private String qualification;
	private int marks;
	private String goals;
	private String emailId;
	private String scheduleProgId;
	private String status;
	private Date appDOI;

	public ApplicantBean() {
		//Default Constructor
	}
		
	//Getters and Setters Methods
	@Column(name="application_id")
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	
	@Column(name="full_name")
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	@Column(name="date_of_birth")
	public Date getAppDOB() {
		return appDOB;
	}
	public void setAppDOB(Date appDOB) {
		this.appDOB = appDOB;
	}
	
	@Column(name="highest_qualification")
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Column(name="marks_obtained")
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Column(name="goals")
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	
	@Column(name="email_id")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name="Scheduled_program_id")
	public String getScheduleProgId() {
		return scheduleProgId;
	}
	public void setScheduleProgId(String scheduleProgId) {
		this.scheduleProgId = scheduleProgId;
	}
	
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name="Date_Of_Interview")
	public Date getAppDOI() {
		return appDOI;
	}
	public void setAppDOI(Date appDOI) {
		this.appDOI = appDOI;
	}
	
	//toString() Method Overriden
	@Override
	public String toString() {
		return "Applicant \nId = " + appId + "\nName = " + appName
				+ "\nDOB = " + appDOB + "\nQualification = " + qualification
				+ "\nMarks = " + marks + "\nGoals = " + goals + "\nEmail-Id = "
				+ emailId + "\nScheduled Program Id = " + scheduleProgId + "\n Application status = "
				+ status + "\nAppDOI = " + appDOI + "]";
	}
}