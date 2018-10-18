package com.capgemini.uas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;


@Entity
@Table(name = "Programs_Scheduled")
public class ProgramScheduledBean {
	
	//Variable Declaration
	@Id
	private String scheduleProgId; 
	private String progName;
	private String location;
	private Date start;
	private Date end;
	private int session;
	
	//Getters and Setters Methods
	@Column(name="Scheduled_program_id")
	public String getScheduleProgId() {
		return scheduleProgId;
	}
	public void setScheduleProgId(String scheduleProgId) {
		this.scheduleProgId = scheduleProgId;
	}

	@Column(name="ProgramName")
	public String getProgName() {
		return progName;
	}
	public void setProgName(String progName) {
		this.progName = progName;
	}

	@Column(name="Location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name="start_date")
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}

	@Column(name="end_date ")
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	@Column(name="session_per_week")
	public int getSession() {
		return session;
	}
	public void setSession(int session) {
		this.session = session;
	}
	
	//toString() Method Overriden
	@Override
	public String toString() {
		return "Program Scheduled\nScheduled Progam Id = " + scheduleProgId
				+ "\n Program Name = " + progName + "\nLocation = " + location
				+ "\nStart Date = " + start + "\nEnd Date = " + end + "\nSession = "
				+ session + "]";
	}

	// Parameterized Constructor
	public ProgramScheduledBean(String scheduleProgId, String progName,
			String location, Date start, Date end, int session) {

		this.scheduleProgId = scheduleProgId;
		this.progName = progName;
		this.location = location;
		this.start = start;
		this.end = end;
		this.session = session;
	}
	
	//Default Constructor
	public ProgramScheduledBean() {
		
	}
}
