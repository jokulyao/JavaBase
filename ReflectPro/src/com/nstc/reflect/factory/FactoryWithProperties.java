package com.nstc.reflect.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.nstc.reflect.factory.modal.Fruit;

public class FactoryWithProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = init.getPro();
		Fruit f = FactoryProperties.getInstance(pro.getProperty("apple"));
		if (f != null) {
			f.eat();
		}
	}
}

//操作属性文件类(如果没有fruit.properties，则创建)
class init {
	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File("fruit.properties");
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("apple", "com.nstc.reflect.factory.modal.Apple");
			pro.setProperty("orange", "com.nstc.reflect.factory.modal.Orange");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}

//	构造工厂类（使用反射+配置文件）
class FactoryProperties {
	public static Fruit getInstance(String ClassName) {
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(ClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

