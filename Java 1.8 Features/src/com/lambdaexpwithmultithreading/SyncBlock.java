package com.lambdaexpwithmultithreading;

public class SyncBlock {
	public void printTable(int n)
	{
//		synchronized(this)
//		{
		for(int i=1;i<=10;i++)
		{
		  System.out.println(i*n);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Next");
		System.out.println();
	}
//	}

}
