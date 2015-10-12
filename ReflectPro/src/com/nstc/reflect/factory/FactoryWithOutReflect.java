package com.nstc.reflect.factory;

import com.nstc.reflect.factory.modal.Apple;
import com.nstc.reflect.factory.modal.Fruit;
import com.nstc.reflect.factory.modal.Orange;

public class FactoryWithOutReflect {
	public static void main(String[] args) {
		Fruit f = Factory.getInstance("Orange");
		f.eat();
	}
}

// ���칤���ࣨû��ʹ�÷��䣩
// �Ժ�������������������ʵ����ʱ��ֻ��Ҫ�޸Ĺ����������
// ��������������̫��������ʱ�򣬸ĵľͻ�ܶ�
class Factory {
	public static Fruit getInstance(String fruitName) {
		Fruit f = null;
		if ("Apple".equals(fruitName)) {
			f = new Apple();
		}
		if ("Orange".equals(fruitName)) {
			f = new Orange();
		}
		return f;
	}
}