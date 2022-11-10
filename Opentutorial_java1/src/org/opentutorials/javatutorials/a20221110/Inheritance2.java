package org.opentutorials.javatutorials.a20221110;

class MultiplicationableCalculator extends Calculator2 {
	public void multiple() {
		System.out.println(this.left * this.right);
	}
	
}

class DivisionableCalculator extends MultiplicationableCalculator {
	public void divide() {
		System.out.println((double)this.left/this.right);
	}
	
}
public class Inheritance2 {
	public static void main(String[] args) {
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.multiple();
		
		DivisionableCalculator c2 = new DivisionableCalculator();
		c2.setOprands(10,20);
		c2.divide();
	}
}
