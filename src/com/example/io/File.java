package com.example.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "assdfasdfasfdasfsdf";
		String path = "E:\\\\a.txt";
		writerFile(msg, path);
		readFile(path);
	}

	public static void readFile(String path) {
		System.out.println("开始读文件");
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			System.out.println("读文件完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {

					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void writerFile(String msg, String path) {
		System.out.println("开始写文件");
		FileWriter fw = null;
		try {
			fw = new FileWriter(path);
			fw.write(msg);
			fw.flush();
			System.out.println("写文件完毕");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {

					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
