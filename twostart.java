package thread;
class Numit implements Runnable{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
}

public class  twostart {
	public static void main(String[] args) {
		
		           
		Numit num=new Numit();
		Thread t=new Thread(num);
		t.start();
		Thread t1=new Thread(num);
		t1.start();
		System.out.println(t.getName()+" "+t.getId()+"  "+t.getState()+" "+t.getThreadGroup());
//to get the state or details of thread
	}

}



