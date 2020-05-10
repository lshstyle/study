package com.example.design.action.chainofReposibility;

public class LeaveRequest {

	private String name;
	private int leavDays;
	private String reason;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeavDays() {
		return leavDays;
	}
	public void setLeavDays(int leavDays) {
		this.leavDays = leavDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LeaveRequest(String name, int leavDays, String reason) {
		super();
		this.name = name;
		this.leavDays = leavDays;
		this.reason = reason;
	}
	
	
}
