package com.nstc.exception;
public class TestException2 {  
    public static void main(String args[]) {  
        int i = 0;  
        String greetings[] = { " Hello world !", " Hello World !! ",  
                " HELLO WORLD !!!" };  
        while (i < 4) {  
            try {  
                // �ر�ע��ѭ�����Ʊ���i����ƣ������������ѭ��
            	//Correct
            	System.out.println(greetings[i++]);
            	//Wrong
//            	{
//            		System.out.println(greetings[i]);
//            		i++;
//            	}
            } catch (ArrayIndexOutOfBoundsException e) {  
                System.out.println("�����±�Խ���쳣");  
            } finally {  
                System.out.println("--------------------------");  
            }  
        }  
    }  
}  