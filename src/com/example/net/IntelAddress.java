package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntelAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
		addr = InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());

	}

}
