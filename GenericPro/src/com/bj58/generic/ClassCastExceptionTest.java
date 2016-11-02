package com.bj58.generic;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
        	// throws java.lang.ClassCastException
            String name = (String) list.get(i);
            System.out.println("name:" + name);
        }
    }
    
}
