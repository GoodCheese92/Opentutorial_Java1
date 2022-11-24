package org.opentutorials.javatutorials.a20221124;

class A {
	public int id;
	A(int id){
		this.id = id;
	}
}
class MyReference {
	int a;
	int b;
	
	public void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("RunValue : "+a);
	}
	
	public void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println("runReference : "+a.id);
	}
}

public class Reference1 {
	public static void main(String[] args) {
		MyReference re = new MyReference();
		re.runValue();
		re.runReference();

	}
}
