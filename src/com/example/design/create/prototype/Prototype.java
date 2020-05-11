package com.example.design.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Administrator
 *
 */
public class Prototype {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          shallowCopy();
          deepCopy();
	}
	
	public static void shallowCopy() throws CloneNotSupportedException {

		Date date = new Date(1000000l);
		Sheep sheep = new Sheep(date, "克隆羊");
		Sheep sheep2 = (Sheep)sheep.clone();
		date.setTime(20000000l);
		System.out.println("克隆前:" + sheep);
		System.out.println("克隆后:" + sheep2);
	}
	
	public static void deepCopy() throws Exception {
		Date date = new Date(1000000l);
		Sheep sheep = new Sheep(date, "克隆羊");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(sheep);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		Sheep sheep2 = (Sheep) ois.readObject();
		date.setTime(20000000l);
		System.out.println("克隆前:" + sheep);
		System.out.println("克隆后:" + sheep2);
	}

}

class Sheep implements Cloneable,Serializable {
	private Date date;
	private String name;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Sheep(Date date, String name) {
		this.date = date;
		this.name = name;
	}
	
	public String toString() {
		return this.getDate().getTime() + " " + this.getName();
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}
	
}
