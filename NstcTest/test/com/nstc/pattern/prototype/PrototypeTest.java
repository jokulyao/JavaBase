package com.nstc.pattern.prototype;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testPrototype() throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Prototype pro = new Prototype();
		SerializableObject obj = new SerializableObject();
		pro.setName("aaaaa");
		pro.setObj(obj);
		Prototype pro2 = (Prototype)pro.clone();
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
		System.out.println(pro.getObj().getI());
		System.out.println(pro2.getObj().getI());
		pro.setName("aaaa");
		pro.getObj().setI(9);
		System.out.println(pro.getObj().getI());
		System.out.println(pro2.getObj().getI());
		
		pro.getObj().setI(8);
		System.out.println("-------------------------------");
		
		Prototype pro3 = (Prototype)pro.deepClone();
		System.out.println(pro.getObj().getI());
		System.out.println(pro3.getObj().getI());
		pro.setName("aaaa");
		pro.getObj().setI(9);
		System.out.println(pro.getObj().getI());
		System.out.println(pro3.getObj().getI());
	}
}
