package org.opentutorials.javatutorials.a20221122;

abstract class B {
	private int num;
	
	public abstract void test ();
	
	public void test2 () {
		System.out.println(num);
	}
	
}

class C extends B {

	
	public void test() {
		System.out.println("test");
		
	}
	
}
public class Abstract1 {
	public static void main(String[] args) {
		C c = new C();
		c.test();
		c.test2();	
	}
}
