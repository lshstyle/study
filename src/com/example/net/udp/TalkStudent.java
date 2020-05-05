package com.example.net.udp;

public class TalkStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new TalkSender(7777, "localhost", 9999)).start();
		
		new Thread(new TalkReciver(8888, "¿œ ¶")).start();
	}

}
