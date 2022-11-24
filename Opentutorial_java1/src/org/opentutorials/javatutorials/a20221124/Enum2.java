package org.opentutorials.javatutorials.a20221124;

enum Fruit1 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit1(String color) {
		System.out.println("Call Construtor : "+this+" - "+color);
		this.color = color;
		
	}
}

enum Company1 {
	GOOGLE, APPLE, ORACLE;
}

public class Enum2 {
	public static void main(String[] args) {
		
		Fruit1 type = Fruit1.APPLE;
		
		switch(type) {
		case APPLE:
			System.out.println(57+"kcal, color : "+Fruit1.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(38+"kcal");
			break;
		case BANANA:
			System.out.println(99+"kcal");
			break;
		}
		
		for(Fruit1 f : Fruit1.values()) {
			System.out.println(f);
		}
	}
	
}
