package thread;
class Prio extends Thread{
	public void run() {
		oddser();
	}
	
	
  void oddser() {
		for(int i=1;i<9;i=i+2) {
			System.out.println(i);
		}
	}
	
	
}
class NumIterator1 extends Thread{
	public void run() {
		eveser();
	}
	

	
	public void eveser() {
		for(int i=2;i<9;i=i+2) {
			System.out.println(i);
		}
	}
}
public class priority{
	public static void main(String[] args) {
		
		           
		Prio num=new Prio();
		NumIterator1 num1=new NumIterator1();
		num.setPriority(6);
		num1.setPriority(1);
		num.start();
		num1.start();
	}

}



