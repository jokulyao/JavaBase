/*	�������ƣ�java��ȡproperties�ļ��ܽ�
 * 	Դ�ļ����ƣ�PropertiesFileReadTest.java
 *	Ҫ  �㣺
 *		1. ʹ��getResourceAsStream������ȡproperties�ļ�
 *		2. ʹ��InPutStream����ȡproperties�ļ�
 *		3. ��ȡproperties�ļ���·��д������
 *	ʱ�䣺2014/4/2
 */
package propertiesFile.read.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

public class PropertiesFileReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			readPropFileByGetResourceAsStream();
			System.out.println("");
			readPropFileByInPutStream();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}

	/**
	 * ʹ��getResourceAsStream������ȡproperties�ļ�
	 */
	static void readPropFileByGetResourceAsStream() {
		/**
		 * ��ȡsrc����config.properties���ڵ������ļ� test1.propertiesλ��config.properties����
		 */
		InputStream in1 = PropertiesFileReadTest.class.getClassLoader()
				.getResourceAsStream("config/properties/test1.properties");
		/**
		 * ��ȡ��PropertiesFileReadTest��λ��ͬһ��������������ļ�
		 * test2.properties��PropertiesFileReadTest����ͬһ��������
		 */
		InputStream in2 = PropertiesFileReadTest.class
				.getResourceAsStream("test2.properties");
		/**
		 * ��ȡsrc��Ŀ¼���ļ��������ļ� jdbc.propertiesλ��srcĿ¼
		 */
		InputStream in3 = PropertiesFileReadTest.class.getClassLoader()
				.getResourceAsStream("jdbc.properties");
		/**
		 * ��ȡλ����һ��source�ļ�������������ļ� config��һ��source�ļ��У�config.propertiesλ��config
		 * source�ļ�����
		 */
		InputStream in4 = PropertiesFileReadTest.class.getClassLoader()
				.getResourceAsStream("config.properties");

		Properties p = new Properties();
		System.out.println("----ʹ��getResourceAsStream������ȡproperties�ļ�----");
		try {
			System.out
					.println("----------------------------------------------");
			p.load(in1);
			System.out.println("test1.properties:name=" + p.getProperty("name")
					+ ",age=" + p.getProperty("age"));
			System.out
					.println("----------------------------------------------");

			p.load(in2);
			System.out.println("test2.properties:name=" + p.getProperty("name")
					+ ",age=" + p.getProperty("age"));
			System.out
					.println("----------------------------------------------");

			p.load(in3);
			System.out.println("jdbc.properties:");
			System.out.println(String.format("jdbc.driver=%s",
					p.getProperty("jdbc.driver")));// �����%s��java Stringռλ��
			System.out.println(String.format("jdbc.url=%s",
					p.getProperty("jdbc.url")));
			System.out.println(String.format("jdbc.usename=%s",
					p.getProperty("jdbc.usename")));
			System.out.println(String.format("jdbc.password=%s",
					p.getProperty("jdbc.password")));
			System.out
					.println("----------------------------------------------");

			p.load(in4);
			System.out.println("config.properties:");
			System.out.println(MessageFormat.format("dbuser={0}",
					p.getProperty("dbuser")));// {0}��һ��java���ַ���ռλ��
			System.out.println(MessageFormat.format("dbpassword={0}",
					p.getProperty("dbpassword")));
			System.out.println(MessageFormat.format("database={0}",
					p.getProperty("database")));
			System.out
					.println("----------------------------------------------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in1 != null) {
				try {
					in1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in2 != null) {
				try {
					in2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in3 != null) {
				try {
					in3.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in4 != null) {
				try {
					in4.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ʹ��InPutStream����ȡproperties�ļ�
	 */
	static void readPropFileByInPutStream() {
		InputStream in1 = null;
		InputStream in2 = null;
		InputStream in3 = null;
		InputStream in4 = null;
		System.out.println("----ʹ��InputStream����ȡproperties�ļ�----");
		try {
			/**
			 * ��ȡsrc��Ŀ¼���ļ��������ļ� jdbc.propertiesλ��srcĿ¼
			 */
			in1 = new BufferedInputStream(new FileInputStream(
					"src/jdbc.properties"));
			/**
			 * ��ȡsrc����config.properties���ڵ������ļ�
			 * test1.propertiesλ��config.properties����
			 */
			in2 = new BufferedInputStream(new FileInputStream(
					"src/config/properties/test1.properties"));
			/**
			 * ��ȡ��PropertiesFileReadTest��λ��ͬһ��������������ļ�
			 * test2.properties��PropertiesFileReadTest����ͬһ��������
			 */
			in3 = new BufferedInputStream(new FileInputStream(
					"src/propertiesFile/read/test/test2.properties"));
			/**
			 * ��ȡλ����һ��source�ļ�������������ļ�
			 * config��һ��source�ļ��У�config.propertiesλ��config source�ļ�����
			 */
			in4 = new FileInputStream("config/config.properties");

			Properties p = new Properties();
			System.out
					.println("----------------------------------------------");

			p.load(in1);
			System.out.println("jdbc.properties:");
			System.out.println(String.format("jdbc.driver=%s",
					p.getProperty("jdbc.driver")));// �����%s��java Stringռλ��
			System.out.println(String.format("jdbc.url=%s",
					p.getProperty("jdbc.url")));
			System.out.println(String.format("jdbc.usename=%s",
					p.getProperty("jdbc.usename")));
			System.out.println(String.format("jdbc.password=%s",
					p.getProperty("jdbc.password")));
			System.out
					.println("----------------------------------------------");

			p.load(in2);
			System.out.println("test1.properties:name=" + p.getProperty("name")
					+ ",age=" + p.getProperty("age"));
			System.out
					.println("----------------------------------------------");
			p.load(in3);
			System.out.println("test2.properties:name=" + p.getProperty("name")
					+ ",age=" + p.getProperty("age"));
			System.out
					.println("----------------------------------------------");

			p.load(in4);
			System.out.println("config.properties:");
			System.out.println(MessageFormat.format("dbuser={0}",
					p.getProperty("dbuser")));// {0}��һ��java���ַ���ռλ��
			System.out.println(MessageFormat.format("dbpassword={0}",
					p.getProperty("dbpassword")));
			System.out.println(MessageFormat.format("database={0}",
					p.getProperty("database")));
			System.out
					.println("----------------------------------------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in1 != null) {
				try {
					in1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in2 != null) {
				try {
					in2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in3 != null) {
				try {
					in3.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (in4 != null) {
				try {
					in4.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
