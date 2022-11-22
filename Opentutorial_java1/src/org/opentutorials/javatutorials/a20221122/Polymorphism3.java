package org.opentutorials.javatutorials.a20221122;

interface I2 {
	public String x(); 
}

interface I3 {
	public String y();
}

class I implements I2, I3 {

	@Override
	public String y() {
		// TODO Auto-generated method stub
		return "y";
	}

	@Override
	public String x() {
		// TODO Auto-generated method stub
		return "x";
	}
	
}

public class Polymorphism3 {
	public static void main(String[] args) {
		I i = new I();
		I2 i2 = new I();
		I3 i3 = new I();
		
		i.x();
		i.y();
		
		i2.x();
		//i2.y();
		
		//i3.x();
		i3.y();
	}
}
