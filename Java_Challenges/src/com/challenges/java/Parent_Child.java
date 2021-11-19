package com.challenges.java;

class Parent {
	int count=1;
	public Parent() {
		System.out.println("PARENT CONSTRUCTOR CREATED NOW TIEM FOR CHILD CONSTRUCTOR..." );
		count++;
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("CHILD CONSTRUCTOR CALLED AFTER PARENT CONSTRUCTOR...");
	}

	public static void main(String[] args) {
//		 
		Child c = new Child();

	}

}
