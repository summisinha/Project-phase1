package thread;
class A{
	synchronized void sum(int n) {
		Thread t=Thread.currentThread();
		for(int i=1;i<6;i++) {
			System.out.println(t.getName()+"  "+(n+i));
		}
	}
}
class Synchronise extends Thread{
 
	A a=new A();
	public void run() {
	 a.sum(10);
 }
}

public class synchro {
	public static void main(String[] args) {
		
		           
		Synchronise num=new Synchronise ();
		Thread t1=new Thread(num);
		Thread t2=new Thread(num);
		t1.setName("thread a");
		t2.setName("thread b");
		t1.start();
		t2.start();
	}

}



