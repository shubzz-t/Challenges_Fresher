package com.challenges.java;

class Parent_ {
	void display() {
		System.out.println("THIS IS PARENT CLASS METHOD...");
	}
}

class child extends Parent_ {
	void display() {
		System.out.println("THIS IS CHILD CLASS METHOD..");
	}
	
	void displayData()
	{
		super.display();
		this.display();
	}

	public static void main(String[] args) {
child child = new child();
child.displayData();
	}

}
