package assignment_01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = (a> b) ? sum(a , b ) : sub(a , b);
		System.out.println("Result : "+ res);
		}
	static int  sum(int a , int b)
	{
		return a+b;
	}
	static int sub(int a , int b )
	{
		return (a>b)? a-b : 0;
	}
	}
