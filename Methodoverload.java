package com.assisted.project;

class overload {
		
		public void area(int b,int h)
		    {
		         System.out.println("Area of Triangle : "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of Circle : "+(3.14*r*r));
		    }
}
		    public class Methodoverload {
		    public static void main(String args[])
		   {

		overload ob=new overload();
		       ob.area(10,12);
		       ob.area(5);  
		   }
		}






