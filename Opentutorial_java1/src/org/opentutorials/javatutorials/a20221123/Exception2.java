package org.opentutorials.javatutorials.a20221123;

class A {
	private int arr[] = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		}	// else if 처럼 분리해서 사용 가능 ()안의 내용의 예외가 발생하면 그 다음 {} 실행
	}

}
public class Exception2 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0);
		
	}
}
