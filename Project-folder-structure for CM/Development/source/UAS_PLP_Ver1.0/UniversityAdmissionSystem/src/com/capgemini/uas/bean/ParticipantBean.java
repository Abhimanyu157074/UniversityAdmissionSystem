package com.capgemini.uas.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Participant")
public class ParticipantBean {

	// Variable Declaration
	@Id
	private String rollNo;
	private String emailId;
	private int appId;
	private String scheduleProgId;

	// Parameterized Constructor
	public ParticipantBean(String rollNo, String emailId, int appId,
			String scheduleProgId) {

		this.rollNo = rollNo;
		this.emailId = emailId;
		this.appId = appId;
		this.scheduleProgId = scheduleProgId;
	}

	public ParticipantBean() {
		// Default Constructor
	}

	// Getters and Setters Methods
	@Column(name="Roll_no")
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Column(name="email_id")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name="application_id")
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}

	@Column(name="Scheduled_program_id")
	public String getScheduleProgId() {
		return scheduleProgId;
	}
	public void setScheduleProgId(String scheduleProgId) {
		this.scheduleProgId = scheduleProgId;
	}

	// toString() Method Overriden
	@Override
	public String toString() {
		return "Participant [rollNo=" + rollNo + ", emailId=" + emailId
				+ ", appId=" + appId + ", scheduleProgId=" + scheduleProgId
				+ "]";
	}

}
