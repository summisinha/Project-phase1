package thread;
class Iterator implements Runnable{
	public void run() {
		oddser();
		eveser();
	}
	
	
	public void oddser() {
		for(int i=1;i<9;i=i+2) {
			System.out.println(i);
		}
	}
	
	public void eveser() {
		for(int i=2;i<9;i=i+2) {
			System.out.println(i);
		}
	}
}

public class singlethread{
	public static void main(String[] args) {
		
		           
	Iterator num=new Iterator();
		Thread t=new Thread(num);
		System.out.println(t.getName());
		t.start();
	//	System.out.println(t.getName()+" "+t.getId()+"  "+t.getState()+" "+t.getThreadGroup());
		Thread t1=new Thread(num);
		System.out.println(t.getName());
		t1.start();
	}

}



