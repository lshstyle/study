package com.example.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReciver  implements Runnable{

	private DatagramSocket server;
	private String sender;
	public TalkReciver(int port, String sender) {
		this.sender= sender;
		try {
			server = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			byte[] container = new byte[1024*60];
			DatagramPacket packet = new DatagramPacket(container, 0, container.length);
			try {
				server.receive(packet);
				byte[] datas = packet.getData();
				int len = packet.getLength();
				String data = new String(datas, 0, len);
				if (data.equals("bye")) {
					break;
				}
				System.out.println(sender + "˵:" + data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		server.close();
	}

}
