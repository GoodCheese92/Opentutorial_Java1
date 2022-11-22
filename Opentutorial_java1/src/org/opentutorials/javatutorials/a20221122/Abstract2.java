package org.opentutorials.javatutorials.a20221122;

abstract class Calculator {
	protected int left, right;
	
	public int setOperand (int left, int right) {
		this.left = left;
		this.right = right;
		return 0;
	}
	
	public abstract int sum();
	public abstract int avg();
	
	public void run() {
		sum();
		avg();
	}	
}

class DecoPlus extends Calculator {

	@Override
	public int sum() {
		System.out.println("+ sum : "+(left+right));
		return 0;
	}

	@Override
	public int avg() {
		System.out.println("+ avg : "+(left+right)/2); 
		return 0;
	}	
}

class DecoMinus extends Calculator {

	@Override
	public int sum() {
		System.out.println("- sum : "+(left+right));
		return 0;
	}

	@Override
	public int avg() {
		System.out.println("- avg : "+(left+right)/2); 
		return 0;
	}	
}
public class Abstract2 {
	public static void main(String[] args) {
		DecoPlus dp = new DecoPlus();
		DecoMinus dm = new DecoMinus();
		
		dp.setOperand(10, 20);
		dp.run();
		dm.setOperand(10, 20);
		dm.run();		
	}
}
