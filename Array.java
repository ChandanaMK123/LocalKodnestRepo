package implementofDataStructures;

import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner scan=new Scanner(System.in);
	public Array(int n)
	{
		arr=new int[n];
	}
	public void insert()
	{
		System.out.println("enter the position from 0 to"+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("enter the elements");
		int elem=scan.nextInt();
		arr[pos]=elem;
	}
	public void delete()
	{
		System.out.println("enter the position to delete the element");
		int pos=scan.nextInt();
		System.out.println("element deleted is"+arr[pos]);
		arr[pos]=0;
	}
	public void display()
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter array length");
int n = scan.nextInt();
Array a=new Array(n);
while(true)
{
	System.out.println("press1------>inserting");
	System.out.println("press1------>deleting");
	System.out.println("press1------>displaying");
	System.out.println("any other no.for exiting");
	System.out.println("enter your choice");
	int choice=scan.nextInt();
	switch (choice)
	{
		case 1:a.insert();
		break;
		case 2:a.delete();
		break;
		case 3:a.display();
		break;
		default:System.exit(0);
	}
	
}

	}

}
