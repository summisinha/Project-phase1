package sort;
import java.util.Scanner;

public class QueueEX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Q :");
		int size=sc.nextInt();
		int q[]=new int[size];
		int front=-1,rear=-1;
		System.out.println("Q operations");
		while(true) {
			System.out.println("enter ur choice 1.enqueue 2.dequeue 3. display 4. exit");
			int choice=sc.nextInt();
			switch(choice) {
			//overflow
			case 1:if(rear==size-1) {
				System.out.println("Q is full no more insertion");
			}
			else {
				System.out.println("enter the el to insert");
				int key=sc.nextInt();
				rear++;
				q[rear]=key;
				front=0;
			}
				break;
				//underflow
			case 2:if((front==-1 &&rear==-1)||(front>rear)) {
				System.out.println("Q is empty no del opr ");
			}
			else {
				front=front+1;
			}
				break;
			case 3:if((front==-1 &&rear==-1)||(front>rear)) {
				System.out.println("Q is empty no del opr ");
			}
			else {
				for(int i=front;i<=rear;i++) {
					System.out.println(q[i]);
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


