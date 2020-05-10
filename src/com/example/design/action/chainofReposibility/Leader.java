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
        	 System.out.println("Ա��:" + request.getName() + " �������:" + 
                 request.getLeavDays() + " ���ԭ��:" + request.getReason());
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
        	 System.out.println("Ա��:" + request.getName() + " �������:" + 
                 request.getLeavDays() + " ���ԭ��:" + request.getReason());
        	 System.out.println("����:" + this.name + " ��׼!!!");
         } else {
        	 System.out.println("�����ڼ����������볤��");
         }
	}
	
}
