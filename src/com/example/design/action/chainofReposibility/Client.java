package com.example.design.action.chainofReposibility;

public class Client {

	public static void main(String[] args) {
		Leader director = new Director("������"); 
		Leader manager = new Manager("���");
		
		director.setNextLeader(manager);
		LeaveRequest request = new LeaveRequest("С��", 8, "�ؼ�");
		director.aduit(request);
	}
}
