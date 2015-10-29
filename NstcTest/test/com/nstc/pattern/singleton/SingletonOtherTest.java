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

public class SingletonOtherTest {

	@Test
	public void testGetInstance() throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonOther sin1 = SingletonOther.getInstance();
		SingletonOther sin2 = SingletonOther.getInstance();
		System.out.println(sin1 == sin2);
		
		
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Person.txt")));
        oo.writeObject(sin1);
        oo.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Person.txt")));
        SingletonOther person = (SingletonOther) ois.readObject();
        ois.close();
        
        System.out.println(sin1 == person);
	}

}
