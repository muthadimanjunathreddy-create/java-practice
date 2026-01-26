package com.tnsif.java.inheritance;

public class MultiLevelInheritence {
	public void display() {
		System.out.println("Parent Class Display Method..");
	}
}
class Middle extends MultiLevelInheritence{
	public void show() {
		System.out.println("Middle Class Display Method..");
	}
}
class Child extends Middle{
	public void print() {
		System.out.println("Child Class Display Metho..");
	}
}