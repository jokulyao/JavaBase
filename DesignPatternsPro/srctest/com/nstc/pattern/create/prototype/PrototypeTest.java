package com.nstc.pattern.create.prototype;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.nstc.pattern.create.prototype.Prototype;
import com.nstc.pattern.create.prototype.SerializableObject;

public class PrototypeTest {

	@Test
	public void test() {
		SerializableObject sObj = new SerializableObject();
		Prototype pro = new Prototype();
		pro.setObj(sObj);
		try {
			Prototype proLightClone = (Prototype)pro.clone();
			proLightClone.getObj().setI(9);
			// 浅复制后，原型pro和浅克隆出来的proLightClone中的SerializableObject实例指向同一个对象
			System.out.println("浅克隆--- " + pro.getObj().getI());
			
			pro.getObj().setI(8);
			
			Prototype proDeepClone = (Prototype)pro.deepClone();
			proDeepClone.getObj().setI(9);
			System.out.println("深克隆--- " + pro.getObj().getI());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


