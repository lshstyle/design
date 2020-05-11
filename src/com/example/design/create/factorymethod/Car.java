package com.example.design.create.factorymethod;

public class Car {
	
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}

class Audi extends Car {
	
}

class Byd extends Car {

}
