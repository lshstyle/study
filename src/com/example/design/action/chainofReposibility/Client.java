package com.example.design.action.chainofReposibility;

public class Client {

	public static void main(String[] args) {
		Leader director = new Director("李主管"); 
		Leader manager = new Manager("李经理");
		
		director.setNextLeader(manager);
		LeaveRequest request = new LeaveRequest("小李", 8, "回家");
		director.aduit(request);
	}
}
