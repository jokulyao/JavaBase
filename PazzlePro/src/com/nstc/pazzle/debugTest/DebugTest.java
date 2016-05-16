package com.nstc.pazzle.debugTest;

public class DebugTest {

	private static int var = 0;
	
	public static void main(String[] args){
		/**
		for(int i=0; i<10000; i++){
			if(i == 999){
//				throw new NullPointerException("i == 999");
				var = 1;
			}
			System.out.println("this is " + i);
		}
		*/
		SourceA source1 = new SourceA();
		source1.print();
	}

}
