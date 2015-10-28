package com.nstc.xstreamOther;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.StringReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

import org.dom4j.io.SAXReader;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.DocumentException;

public class XStreamDemo {
	public static void main(String args[]) {
		testBean2XML();
	}

	/**
	 * ����һ��Persons����
	 * 
	 * @return Persons����
	 */
	public static Persons getPersons() {
		Address add1 = new Address("type1", "֣���о���·�Ƹ��㳡1");
		Address add2 = new Address("type2", "֣���о���·�Ƹ��㳡2");
		List<Address> addlist1 = new ArrayList<Address>();
		addlist1.add(add1);
		addlist1.add(add2);

		Address add3 = new Address("type3", "֣���о���·�Ƹ��㳡3");
		Address add4 = new Address("type4", "֣���о���·�Ƹ��㳡4");
		List<Address> addlist2 = new ArrayList<Address>();
		addlist2.add(add3);
		addlist2.add(add4);

		Addresses addes1 = new Addresses(addlist1);
		Addresses addes2 = new Addresses(addlist2);
		Person person1 = new Person(addes1, "6666554", "lavasoft", "man");
		Person person2 = new Person(addes2, "7777754", "yutian", "man");

		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(person1);
		listPerson.add(person2);
		Persons persons = new Persons(listPerson, "001");
		return persons;
	}

	/**
	 * ����XStream��Java�����XML֮���໥ת��
	 */
	public static void testBean2XML() {
		System.out.println("��Java����ת��Ϊxml��\n");
		Persons persons = getPersons();
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("address", Address.class);
		xstream.alias("addresses", Addresses.class);
		xstream.alias("person", Person.class);
		xstream.alias("persons", Persons.class);
		String xml = xstream.toXML(persons);
		System.out.println(xml);

		System.out.println("\n��xmlת��ΪJava����");
		Persons cre_person = (Persons) xstream.fromXML(xml);
		System.out.println(cre_person.toString());
	}
}