package com.jun.blocks.sample;

public class Sample {
	int sequence;
	String name;
	int age;
	
	public Sample() {
		
	}
	
	public Sample(int sequence, String name, int age) {
		this.sequence = sequence;
		this.name = name;
		this.age = age;
	}
	
	public int getSequence() {
		return this.sequence;
	}
	
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
