
public class MainClass
{
	public static void main(String[] args)
	{

		
		Thread t1 = new Thread(new BitCoinMiner(1));
		Thread t2 = new Thread(new BitCoinMiner(2));
		Thread t3 = new Thread(new BitCoinMiner(3));
		Thread t4 = new Thread(new BitCoinMiner(4));
		Thread t5 = new Thread(new BitCoinMiner(5));
		Thread t6 = new Thread(new BitCoinMiner(6));
		Thread t7 = new Thread(new BitCoinMiner(7));
		Thread t8 = new Thread(new BitCoinMiner(8));

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();

		
		
		
	}
}
