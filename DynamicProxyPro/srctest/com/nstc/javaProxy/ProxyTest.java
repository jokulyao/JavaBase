package com.nstc.javaProxy;

import org.junit.Test;

import com.nstc.javaProxy.MyInvocationHandler;
import com.nstc.javaProxy.ProxyGeneratorUtils;
import com.nstc.javaProxy.UserService;
import com.nstc.javaProxy.UserServiceImpl;

/** 
 * ��̬��������� 
 * @since 2012-8-9 
 * 
 */  
public class ProxyTest {

	@Test
	public void testProxy() throws Throwable {
		// ʵ����Ŀ�����
		UserService userService = new UserServiceImpl();

		// ʵ����InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

		// ����Ŀ��������ɴ������
		UserService proxy = (UserService) invocationHandler.getProxy();

		// ���ô������ķ���
		proxy.add();
	}
	
	@Test  
    public void testGenerateProxyClass() {  
        ProxyGeneratorUtils.writeProxyClassToHardDisk("D:/$Proxy11.class");  
    }  
}