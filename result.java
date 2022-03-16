package assignment;

import java.util.Scanner;

public class result {
	
	int marks;
	Scanner s = new Scanner(System.in);
	
	void result() {
		
		System.out.print("Enter Marks=");
		marks = s.nextInt();
		String res = marks>=40 ? "Result is Pass" : " Result is Fail" ;
		System.out.print(res);
		
	}
	public static void main(String[] args) {
    	
    	result m = new result();
    	m.result();
    	
    }
}

	

	
