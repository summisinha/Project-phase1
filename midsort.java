package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class midsort {
	public static void main(String[] args) {
		int a[]= {3,2,4,6,1,9,11,12,15,18,19,29};//unsorted 
		Arrays.sort(a);
		System.out.println("soreted array is ");
		for(int j:a) {
			System.out.print(j+",");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element to search");
		int ele=sc.nextInt();
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==ele) {
				System.out.println("element is found at the index of "+mid);
				break;
			}
			else if(a[mid]<ele) {
				low=mid+1;
				high=a.length-1;
			}
			else {
				low=0;
				high=mid-1;
			}
		}
	}

}



