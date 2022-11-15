package org.opentutorials.javatutorials.a20221115;

class Calculator2 {
	int left, right;
	
	public void setOprands (int left, int right) {
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

class OverridingCalculator extends Calculator2 {
	public void sum() {
		System.out.println("실행결과는 "+(left+right)+"입니다.");
	}
	
	/*public int avg() {
		return ((left+right)/2;)
	}*/
	// 메서드의 서명(Signature)
	// 부모 클래스 메서드 자료형과 상속 클래스의 메서드 자료형이 다르면
	// Overriding 할 수 없다.
	// (매개 변수도 동일해야 한다.) 
}

public class Overriding1 {
	public static void main(String[] args) {
		OverridingCalculator sc = new OverridingCalculator();
		sc.setOprands(3, 4);
		sc.sum();
	}
}
