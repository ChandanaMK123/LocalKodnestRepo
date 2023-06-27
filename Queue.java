package implementofDataStructures;

import java.util.Scanner;

public class Queue {
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
private Scanner scan=new Scanner(System.in);
public Queue(int n)
{
	q=new int[n];
	size=q.length;
}
public void insert()
{
	int elem;
	if(r==size-1)
	{
		System.out.println("insertin not possible");
	}
	else
	{
		System.out.println("enter an element");
		elem=scan.nextInt();
		++r;
		q[r]=elem;
	}
}
public void delete()
{
	if(r==-1||f>r)
	{
		System.out.println("deletion is not possible");
	}
	else
	{
		System.out.println("deletion element is"+q[f]);
		++f;
	}
}
public void display()
{
	if(r==-1||f>r)
	{
		System.out.println("display is not possible");
	}
	else
	{
		for(int i=f;i<=r;i++)
		{
			System.out.println(q[i]+" ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter queue size");
		int n = scan.nextInt();
		Queue queue =new Queue(n);
		while(true)
		{
			System.out.println("press1------>INSERT");
			System.out.println("press1------>DELETE");
			System.out.println("press1------>DISPLAY");
			System.out.println("any other no.for exiting");
			System.out.println("enter your choice");
			int choice=scan.nextInt();
			switch (choice)
			{
				case 1:queue.insert();
				break;
				case 2:queue.delete();
				break;
				case 3:queue.display();
				break;
				default:System.exit(0);
			}
		}	
	}

}
