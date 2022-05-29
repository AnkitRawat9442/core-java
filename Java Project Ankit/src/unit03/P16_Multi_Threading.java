package unit03;

import java.util.Scanner;

public class P16_Multi_Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new t1() , "t1");
	     Thread thread2 = new Thread(new t2() , "t2");
	     Thread thread3 = new Thread(new t3() , "t3");
	     thread1.start();
	     thread2.start();
	     thread3.start();
	     
	}

}

class t1 extends Thread  
{
	public void run ()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
class t2 extends Thread
{
	public void run()
	{
		for(int i = 0 ; i<10 ; i++)
		{
			System.out.print("hi ");
		}
		System.out.println();
	}
}
class t3 extends Thread
{
	public void run()
	{
		for(int i = 0 ; i<10 ; i++)
		{
			System.out.print("hi ");
		}
		System.out.println();
	}
}
class c2
{
	void show()
	{
		for(int i = 0 ; i<10 ; i++)
		{
			System.out.print("hi ");
		}

	}
}


class c1
{
	void show ()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}