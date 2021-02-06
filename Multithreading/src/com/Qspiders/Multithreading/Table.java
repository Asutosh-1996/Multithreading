//Synchronization concept
package com.Qspiders.Multithreading;

public class Table {
int n;
synchronized void print()
{
	for(int i=1;i<=n;i++)
	{
		System.out.println(n+"*"+i+"="+n*i);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}


}
