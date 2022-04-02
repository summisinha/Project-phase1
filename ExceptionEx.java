package stringEx;
public class ExceptionEx {
public static void main(String[] args) {

	System.out.println("hi");
	try {
		int b[]= {2,3,4,5,6};
		b[7]=50;
	int a=50/0;
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	System.out.println("hello");
	
}}

