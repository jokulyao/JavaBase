package com.nstc.pazzle;

/**
 * ���ֲ�ͬ��equalsд�����ֱ����instanceof �� getClass��
 * 		o1��o2�ǲ�ͬ�Ķ��󣬵���ʹ��Parent���equals�����Ƚ϶���ȴ����ȵ�
 * 		������Ϊo2��Parent����������ʹ��otherObject instanceof Parent�ж�Ϊtrue������ֻ�Ƚ���o2�ĸ�������parentVal��parentStr
 * 		��o2����������childVal��childStrδ���Ƚϣ����Խ������
 * 		��������������������Խ�����дequals����ʱʹ��getClass()
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

		// ��һ��д��equals
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

		// �ڶ���д��equals�����ʵ�����Ƽ����ã�
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
