package com.assisted.project;

public class Inner {

	 private String msg="Welcome to Java"; 
	 
	 class Inner1{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		Inner obj=new Inner();
		Inner.Inner1 in=obj.new Inner1();  
		in.hello();  
	}
}


