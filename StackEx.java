package sort;
import java.util.Scanner;

public class StackEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the stack :");
		int size=sc.nextInt();
		int stack[]=new int[size];
		int top=-1;
		System.out.println("stack operations");
		while(true) {
			System.out.println("enter your choice 1.push 2. pop 3. display 4. exit");
			int choice=sc.nextInt();
			switch(choice) {
			//overflow
			case 1:if(top==size-1) {
				System.out.println("stack is full no more insertion");
			}
			else {
				System.out.println("enter the el to insert");
				int key=sc.nextInt();
				top++;
				stack[top]=key;
			}
				break;
				//underflow
			case 2:if(top==-1) {
				System.out.println("stack is empty no del opr ");
			}
			else {
				top=top-1;
			}
				break;
			case 3:if(top==-1) {
				System.out.println("stack is empty no del opr ");
			}
			else {
				for(int i=top;i>=0;i--) {
					System.out.println(stack[i]);
				}
			}
				break;
			case 4:System.exit(0);
				break;
			default:System.out.println("check ur choice");
				break;


			}

		}
	}

}


