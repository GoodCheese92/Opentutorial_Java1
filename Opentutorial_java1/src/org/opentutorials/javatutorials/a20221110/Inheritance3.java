package org.opentutorials.javatutorials.a20221110;

class Calculator3 {
	int left, right;
	
	public Calculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
}
class Example2 extends Calculator3 {
	public Example2(int left, int right) {
	super(left, right);
}
	public void sum2() {
		System.out.println(this.left+this.left+this.right);
	}
}
	
public class Inheritance3 {
	public static void main(String[] args) {
		Example2 c = new Example2(10, 20);
		c.sum2();
		
	}
}
