package com.example.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoTest {

	public static final String readFilePath = "ball.jpg";
	public static final String writeFilePath = "copy.jpg";

	public static void main(String[] args) {
		byte[] bytes = fileToByteArray(readFilePath);
		byteArrayToFile(bytes, writeFilePath);
	}

	public static byte[] fileToByteArray(String path) {

		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(path);
			int len;
			baos = new ByteArrayOutputStream();
			byte[] flush = new byte[1024 * 10];
			while ((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);
			}
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != is) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	private static void byteArrayToFile(byte[] bytes, String path) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new ByteArrayInputStream(bytes);
			os = new FileOutputStream(path);
			byte[] flush = new byte[1024 * 10];
			int len;
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
