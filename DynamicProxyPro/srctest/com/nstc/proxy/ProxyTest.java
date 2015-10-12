package com.nstc.proxy;

import org.junit.Test;

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