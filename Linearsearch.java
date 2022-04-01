package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		int a[]= {3,2,4,6,1,9,11};//unsorted 
		Arrays.sort(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element to search");
		int ele=sc.nextInt();
		int flag=0;
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=1;
				
				break;
			}
			else {
				flag=0;
				
			}
		}
		
		
		if(flag==1) {
			System.out.println("element is found at index "+ i);
		}
		else {
			System.out.println("element is not found");
		}
	}

}






