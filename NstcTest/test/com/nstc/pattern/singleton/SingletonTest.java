package com.nstc.pattern.singleton;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetInstance() throws FileNotFoundException,
    IOException, ClassNotFoundException {
		Singleton sin1 = Singleton.getInstance();
		Singleton sin2 = Singleton.getInstance();
		System.out.println(sin1 == sin2);
//		http://www.cnblogs.com/xdp-gacl/p/3777987.html
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Person.txt")));
        oo.writeObject(sin1);
        oo.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Person.txt")));
        Singleton person = (Singleton) ois.readObject();
        
        System.out.println(sin1 == person);
	}
	
    /**
     * MethodName: SerializePerson 
     * Description: 序列化Person对象
     * @author xudp
     * @throws FileNotFoundException
     * @throws IOException
     
    public static void SerializePerson() throws FileNotFoundException,
            IOException {
//        Person person = new Person();
//        person.setName("gacl");
//        person.setAge(25);
//        person.setSex("男");
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }
    */

    /**
     * MethodName: DeserializePerson 
     * Description: 反序列Perons对象
     * @author xudp
     * @return
     * @throws Exception
     * @throws IOException
    
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }
     */
}
