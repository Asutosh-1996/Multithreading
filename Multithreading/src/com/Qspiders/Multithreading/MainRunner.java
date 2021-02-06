package com.Qspiders.Multithreading;

public class MainRunner extends Thread {
public static void main(String[] args) throws InterruptedException
{
Table tb1=new Table();
Thread t1=new Thread()
{
public void run()	
{
	tb1.print();
}

};
Thread t2=new Thread()
{
	public void run()
	{
		tb1.print();
	}
};
tb1.n=10;
t1.start();
Thread.sleep(3000);
tb1.n=12;
t2.start();
}
}