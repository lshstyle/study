package com.example.net.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("--------------server--------------------");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("一个客户端建立了连接");
		boolean isFlag = true;
		while (isFlag) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String sendMsg = bufferedReader.readLine();
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(sendMsg);
			dos.flush();
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String reciveMsg = dis.readUTF();
			System.out.println("server收到消息:" + reciveMsg);
			if (sendMsg.equals("bye") || reciveMsg.equals("bye")) {
				isFlag = false;
			}
			dos.close();
			dis.close();
		}
		client.close();
	}
 
}
