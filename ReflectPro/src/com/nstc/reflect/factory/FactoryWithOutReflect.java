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

// 构造工厂类（没有使用反射）
// 以后如果我们在添加其他的实例的时候只需要修改工厂类就行了
// 但是如果我们添加太多的子类的时候，改的就会很多
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