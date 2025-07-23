package com.ajit.demo;

public class StaticDemo {
	
	public static void main(String args[]) {
		ConstantClass cc = new ConstantClass();
		cc.demoInt();
		
	}

}


class ConstantClass {
	
	int x = 1;
	
	
	public int demoInt() {
		int z = x;
		x = 5;
		z = x+1;
		System.out.println("X: " + x);
		System.out.println("Z: " + z);
		
		return z;
	}
}