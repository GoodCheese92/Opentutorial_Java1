package org.opentutorials.javatutorials.a20221123;

class Calculator {
	int num1, num2;
	
	public void setOp (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void div() {
		try {	// 예외의 발생이 예상되는 로직
		System.out.print("계산결과는 ");
		System.out.print(num1/num2);
		System.out.print("입니다.");
		} catch (Exception e) {	// 예외가 발생했을 때 실행되는 조직
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
			
			System.out.println("\ne.toString()"+e.toString());
			System.out.println("\ne.printStackTrace");
			e.printStackTrace();
		}
	}
}

public class Exception1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.setOp(10, 0);	
		cal.div();	// 0으로 나누기를 했으므로 에러 발생
	}
}
