package implementofDataStructures;

import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner scan=new Scanner(System.in);
	public CircularQueue(int n)
	{
		cq=new int[n];
		size=cq.length;
	}
	public void insert()
	{
		if(count==size)
		{
			System.out.println("insertion is not possible");
		}
		else
		{
			System.out.println("enter an element");
			int elem=scan.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			count++;
		}
	}
	public void delete()
	{
		if(count==0)
		{
			System.out.println("deletion is not possible");
		}
		else
		{
			System.out.println("element deleted is"+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display()
	{
		int f1=f;
		if(count ==0)
		{
			System.out.println("display is not possible");
		}
		else
		{
			for(int i=1;i<=count;i++)
			{
				System.out.println(cq[f1]+" ");
				f1=(f1+1)%size;
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the size of Circular Queue");
int n=scan.nextInt();
CircularQueue circularqueue=new CircularQueue(n);
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
		case 1:circularqueue.insert();
		break;
		case 2:circularqueue.delete();
		break;
		case 3:circularqueue.display();
		break;
		default:System.exit(0);
	}
 }
}
}
