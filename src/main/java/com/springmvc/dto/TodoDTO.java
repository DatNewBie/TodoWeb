package com.springmvc.dto;

public class TodoDTO {
	
	private int id;
	private String username;
	private String description;
	private java.sql.Date targetDate;
	boolean done;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public java.sql.Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(java.sql.Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}

	
}
