package org.opentutorials.javatutorials.a20221122;

class Cal {
	private int num1, num2;
	
	public void setOp(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	private int sum() {
		return num1+num2;
	}
	
	public void sumDecoplus() {
		System.out.println("++++"+sum()+"+++++");
	}
	
	public void sumDecominus() {
		System.out.println("----"+sum()+"----");
	}
}

public class Acessmodifier2 {
	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.setOp(2, 3);
		cal.sumDecoplus();
		cal.sumDecominus();
	}
}
