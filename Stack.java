package implementofDataStructures;

import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top=-1;
	private Scanner scan=new Scanner(System.in);
	public Stack(int n)
	{
		s=new int[n];
		size=s.length;
	}
	public void push()
	{
		int elem;
		if(top==size-1)
		{
			System.out.println("push not possible");
		}
		else
		{
			System.out.println("enter an element");
			elem=scan.nextInt();
			++top;
			s[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("pop is not possible");
		}
		else
		{
			System.out.println("element deleted is "+s[top]);
			--top;
		}
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("display is not possible");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]+" ");
			}
		}
	}
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter stack size");
		int n = scan.nextInt();
		Stack stack =new Stack(n);
		while(true)
		{
			System.out.println("press1------>PUSH");
			System.out.println("press1------>POP");
			System.out.println("press1------>DISPLAY");
			System.out.println("any other no.for exiting");
			System.out.println("enter your choice");
			int choice=scan.nextInt();
			switch (choice)
			{
				case 1:stack.push();
				break;
				case 2:stack.pop();
				break;
				case 3:stack.display();
				break;
				default:System.exit(0);
			}
		}	
	}
}
