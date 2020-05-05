package com.example.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSender implements Runnable{

	private DatagramSocket client;
	private BufferedReader reader;
	private String destIP;
	private int destPort;

	public TalkSender(int port, String destIP, int destPort) {
		this.destIP = destIP;
		this.destPort = destPort;
		try {
			client = new DatagramSocket(port);
			reader = new BufferedReader(new InputStreamReader(System.in));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			String data;
			try {
				data = reader.readLine();
				byte[] bytes = data.getBytes();
				DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length,
						new InetSocketAddress(this.destIP, this.destPort));
				client.send(packet);
				System.out.println("·¢ËÍÏûÏ¢:" + data);
				if ("bye".equals(data)) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		client.close();
	}
	
}
