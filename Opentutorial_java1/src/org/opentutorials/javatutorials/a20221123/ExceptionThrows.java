package org.opentutorials.javatutorials.a20221123;

class AA {
	public void run(){
		
	}
}

class BB {
	AA aa = new AA();
	public void run() {
		aa.run();
	}
}

public class ExceptionThrows {
	public static void main(String[] args) {
		BB bb = new BB();
		
		bb.run();
	}
}
