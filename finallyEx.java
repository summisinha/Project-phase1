package stringEx;
public class finallyEx {
public static void main(String[] args) {

	System.out.println("hi");
	try {
	int a=50/0;
	}
//	catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}
	finally {
		System.out.println("finally block executed");
	}
	System.out.println("hello");
	
}
}



