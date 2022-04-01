package com.assisted.project;
public class ConsEx {
	  private String name;

	  // constructor
	  ConsEx() {
	    System.out.println("Constructor Called:");
	    name = "Summi";
	  }

	  public static void main(String[] args) {

	    //constructor is invoked while creating an object of the Main class
	    
		  ConsEx c = new ConsEx();
	    System.out.println("The name is " + c.name);
	  }
	}
