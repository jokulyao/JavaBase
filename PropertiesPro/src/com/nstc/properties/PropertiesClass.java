package com.nstc.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) {
//		System.out.println(PropertiesClass.getProperties("D:/cmlcurrency.properties"));
		Map map = new HashMap();
		map.put("ASF", "加拿大元");
		map.put("TWD", "台湾币");
		map.put("KES", "澳币");
		Properties p = new Properties();
//		p.putAll(map);
		p.setProperty("ASF", "加拿大元");
		p.setProperty("TWD", "台湾币");
		System.out.println(p);
	}
	
	public static Properties getProperties(String resource) {
		Properties properties = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream(resource);
			properties.load(in);
			return properties;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static InputStream getStream(String relativePath) {
		try {
			return getStream(relativePath);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static InputStream getStream(URL url) {
		try {
			if (url != null)
				return url.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

