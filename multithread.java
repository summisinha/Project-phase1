package thread;
class Multithr implements Runnable{
	public void run() {
		try {
			oddser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eveser();
	}
	
	
	public void oddser() throws InterruptedException {
		
		for(int i=1;i<9;i=i+2) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	
	public void eveser() {
		for(int i=2;i<9;i=i+2) {
			System.out.println(i);
		}
	}
}

public class multithread{
	public static void main(String[] args) {
		
		           
		Multithr num=new Multithr();
		Thread t=new Thread(num);
		t.setName("thread a");
		System.out.println(t.getName());
		t.start();
	//	System.out.println(t.getName()+" "+t.getId()+"  "+t.getState()+" "+t.getThreadGroup());
		Thread t1=new Thread(num);
		t.setName("thread b");
		System.out.println(t.getName());
		t1.start();
	}

}




