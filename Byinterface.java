package thread;

class Numiterator implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
		System.out.println(i);
		}	
	}
	
}
public class Byinterface {
	public static void main(String args[])
	{
		Numiterator num=new Numiterator();
		Thread t=new Thread(num);
		t.start();

	}

}
