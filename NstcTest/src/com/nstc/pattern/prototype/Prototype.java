package com.nstc.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.sql.rowset.serial.SerialJavaObject;

public class Prototype implements Cloneable, Serializable {
	private String name;

	private SerializableObject obj;
	
	public Object clone() throws CloneNotSupportedException{
		Prototype pro = (Prototype)super.clone();
		return pro;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(this);
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		return objectInputStream.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
}

class SerializableObject implements Serializable{
	
	private static final long serialVersionUID = 89444317517821220L;
	
	private int i = 8;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}