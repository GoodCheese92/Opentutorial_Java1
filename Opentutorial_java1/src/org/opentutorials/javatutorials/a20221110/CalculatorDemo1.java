package org.opentutorials.javatutorials.a20221110;

class Calculator1 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator1 c2 = new Calculator1();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
		
	}
	
	

}
