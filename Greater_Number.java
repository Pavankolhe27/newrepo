package assignment;

import java.util.Scanner;

public class Greater_Number {
	int a;
	int b;
	Scanner s = new Scanner(System.in);
	
	void result()
	{
		System.out.println("Enter first Number = ");
		a=s.nextInt();
		System.out.println("Enter second Number = ");
		b=s.nextInt();
		if(a>b) {
			System.out.println("a is greater than b");
		}
			else {
				System.out.println("a is less than b ");
			}
	}
	
	public static void main(String[] args) {
		Greater_Number g = new Greater_Number();
		g.result();
	}
	}
		
			