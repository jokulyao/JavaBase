package com.nstc.container;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveList {
    public static void main(String[] args) {
    	
    	Double price = 501.0;
    	BigDecimal num = new BigDecimal(price).divide(new BigDecimal(10000.0), 1,
                RoundingMode.HALF_UP);
    	System.out.println(num.doubleValue());
    	
        boolean unit = false;
        if(num.compareTo(new BigDecimal(1.0)) >= 0){
            unit = true;
        }
        System.out.println(unit);
    	
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        
        //解决方案:
        //1.i--操作
        for(int i = 0;i < list.size();i++){
            String b = list.get(i);
            if(b.equals("a")){
                list.remove(i);
//                i--;
            }
        }
        System.out.println(list);
        
        //2.反向遍历
        /*for(int i = list.size() - 1;i >= 0;i--){
            String b = list.get(i);
            if(b.equals("502323232")){
                list.remove(i);
            }
        }*/
        
        //解决方案:调用Iterator的remove()方法安全删除元素,避免异常
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String b = iter.next();
            if(b.equals("a")){
                iter.remove();
            }
        }
        for(String b : list){
            System.out.println(b);
        }
    }
}
