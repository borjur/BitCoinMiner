
public class BitCoinMiner implements Runnable
{
	private int bitCoins = 0;
	private int minerID = 0;
	
	public BitCoinMiner(int IDin)
	{
		minerID = IDin;
	}
	
	@Override
	public void run()
	{
		int probability = 10000000;

		while(true)
		{
			if((int)(Math.random()*probability) == 1)
			{
				bitCoins = bitCoins + 1;
				System.out.println("MinerID: "+minerID+ " has " +bitCoins +" bitCoins" );
			}
		}
	}

}
