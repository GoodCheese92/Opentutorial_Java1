package org.opentutorials.javatutorials.a20221115;

class Cal4 {
	int a= 0, b = 0, c = 0;
	
	// Overloading
	// 같은 이름을 가진 메서드를 만들 수 있다.
	// * 매개변수의 개수가 다르게 하는데 용이
	
	public void setOp(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setOp(int a, int b, int c) {
		this.setOp(a, b);		
		// this.a = a;
		// this.b = b;
		this.c = c;
	}
	
	public void sum() {
		System.out.println(a+b+c); 
	}
	
}
public class Overloading1 {
	public static void main(String[] args) {
		
		Cal4 sc1 = new Cal4();
		sc1.setOp(2, 3);
		sc1.sum();
		sc1.setOp(2, 3, 4);
		sc1.sum();
		
		
	}
}
