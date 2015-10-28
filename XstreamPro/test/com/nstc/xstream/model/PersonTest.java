package com.nstc.xstream.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.nstc.xstream.util.XmlUtil;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person();
		person.setName("yaoxs");
		person.setAddress("beijing");
		person.setBirthDate(new Date());
		
		String xml = XmlUtil.simpleObj2Xml(person);
		System.out.println(xml);
		
		Person temp = (Person)XmlUtil.simpleXml2Object(xml, new Person());
		
		System.out.println(temp.getName());
		System.out.println(temp.getAddress());
		System.out.println(temp.getBirthDate());
	}
}
