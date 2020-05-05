package com.example.net.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		System.out.println("-----------client------------");
		Socket client = new Socket("localhost", 8888);
		boolean isFlag = true;
		while (isFlag) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String sendMsg = bufferedReader.readLine();
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(sendMsg);
			dos.flush();
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String reciveMsg = dis.readUTF();
			System.out.println("client收到消息:" + reciveMsg);
			if (sendMsg.equals("bye") || reciveMsg.equals("bye")) {
				isFlag = false;
			}
			dos.close();
			dis.close();
		}

		client.close();
	}

}
