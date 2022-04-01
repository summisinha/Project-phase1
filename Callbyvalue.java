package com.assisted.project;

 class Call{

		int result;

		int operation(int x,int y) {
			result =x+y;
			return(result);
		}
 }
		public class Callbyvalue {
		public static void main(String args[]) {
			Call d = new Call();
			System.out.println("Before operation value of data is "+d.result);
			d.operation(10,20);
			System.out.println("After operation value of data is "+d.result);
			}
		}



