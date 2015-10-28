package com.nstc.xstream.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlUtil {
	public static String simpleObj2Xml(Object obj){
		XStream	xstream = new XStream(new DomDriver());
		xstream.alias(obj.getClass().getSimpleName(), obj.getClass());
		String xml = xstream.toXML(obj);
		return xml;
	}
	
	public static Object simpleXml2Object(String xml, Object obj){
		XStream	xstream = new XStream(new DomDriver());
		xstream.alias(obj.getClass().getSimpleName(), obj.getClass());
		Object retObj = xstream.fromXML(xml);
		return retObj;
	} 
}
