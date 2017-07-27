package br.com.ratecoop.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.ratecoop.enums.AttendanceStatusEnum;

@Document
public class Attendance {

	@Id
	private String id;
	private String protocol;
	private Date dateAttendance;
	private String procedure;
	private AttendanceStatusEnum attendanceStatusEnum;
	
	@DBRef
	private User user;
	
	@DBRef
	private Licensed licensed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Date getDateAttendance() {
		return dateAttendance;
	}

	public void setDateAttendance(Date dateAttendance) {
		this.dateAttendance = dateAttendance;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Licensed getLicensed() {
		return licensed;
	}

	public void setLicensed(Licensed licensed) {
		this.licensed = licensed;
	}

	public AttendanceStatusEnum getAttendanceStatusEnum() {
		return attendanceStatusEnum;
	}

	public void setAttendanceStatusEnum(AttendanceStatusEnum attendanceStatusEnum) {
		this.attendanceStatusEnum = attendanceStatusEnum;
	}
	
}
