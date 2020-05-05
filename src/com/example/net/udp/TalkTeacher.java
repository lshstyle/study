package com.example.net.udp;

public class TalkTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new TalkReciver(9999, "Ñ§Éú")).start();
		
		new Thread(new TalkSender(5555, "localhost", 8888)).start();
	}

}
