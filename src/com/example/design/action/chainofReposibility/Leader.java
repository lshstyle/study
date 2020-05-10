package com.example.design.action.chainofReposibility;

public abstract class Leader {

	protected String name;
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Leader getNextLeader() {
		return nextLeader;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void aduit(LeaveRequest request);
}

class Director extends Leader {

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aduit(LeaveRequest request) {
		// TODO Auto-generated method stub
		
         if (request.getLeavDays()<3) {
        	 System.out.println("员工:" + request.getName() + " 请假天数:" + 
                 request.getLeavDays() + " 请假原因:" + request.getReason());
         } else {
        	 this.getNextLeader().aduit(request);
         }
	}
	
}


class Manager extends Leader {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aduit(LeaveRequest request) {
		// TODO Auto-generated method stub
		
         if (request.getLeavDays()<10) {
        	 System.out.println("员工:" + request.getName() + " 请假天数:" + 
                 request.getLeavDays() + " 请假原因:" + request.getReason());
        	 System.out.println("主管:" + this.name + " 批准!!!");
         } else {
        	 System.out.println("工期在即，不允许请长假");
         }
	}
	
}
