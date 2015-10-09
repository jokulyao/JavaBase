package com.nstc.pazzle;

/**
 * 两种不同的equals写法（分别基于instanceof 和 getClass）
 * 		o1和o2是不同的对象，但是使用Parent类的equals方法比较二者却是相等的
 * 		这是因为o2是Parent类的子类对象，使用otherObject instanceof Parent判断为true，并且只比较了o2的父类属性parentVal和parentStr
 * 		而o2的自有属性childVal和childStr未作比较，所以结果出错
 * 		正是由于这种情况，所以建议重写equals方法时使用getClass()
 * @author yaoxs
 *
 */

public class EqualsTest {
	class Parent {
		int parentVal;
		String parentStr;

		public Parent(int parentVal, String parentStr) {
			this.parentVal = parentVal;
			this.parentStr = parentStr;
		}

		// 第一种写法equals
		public boolean equals(Object otherObject) {
			// a quick test to see if the objects are identical
			if (this == otherObject)
				return true;
			// must return false if the explicit parameter is null
			if (otherObject == null)
				return false;
			if (otherObject instanceof Parent) {
				Parent other = (Parent) otherObject;
				return this.parentVal == other.parentVal
						&& this.parentStr.equals(other.parentStr);
			}
			return false;
		}
	}

	class Child extends Parent {
		int childVal;
		String childStr;

		public Child(int childVal, String childStr) {
			super(0, "parent");
			this.childVal = childVal;
			this.childStr = childStr;
		}

		// 第二种写法equals（最佳实践、推荐采用）
		public boolean equals(Object otherObject) {
			// a quick test to see if the objects are identical
			if (this == otherObject)
				return true;
			// must return false if the explicit parameter is null
			if (otherObject == null)
				return false;
			// if the classes don't match, they can't be equal
			if (this.getClass() != otherObject.getClass())
				return false;
			// now we know otherObject is a non-null Employee
			Child other = (Child) otherObject;
			// test whether the fields have identical values
			return super.equals(other) && this.childVal == other.childVal
					&& this.childStr.equals(other.childStr);
		}
	}

	public static void main(String[] args) {
		Object o1 = new EqualsTest().new Parent(0, "parent");
		Object o2 = new EqualsTest().new Child(1, "child");
		System.out.println(o1.equals(o2)); 		// true
		System.out.println(o2.equals(o1)); 		// false
	}
}
