package com.assisted.project;

 class CalculatorImp extends Cal {

	@Override
	void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}
	
}


public class AbsEx {
	public static void main(String[] args) {
		
		CalculatorImp imp=new CalculatorImp();
		imp.sum(20,30);
		imp.sub(20,30);
		imp.mul(20,30);
		imp.div(20,30);
		
		
	}


	
}
