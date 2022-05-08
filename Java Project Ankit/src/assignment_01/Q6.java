//Q6. As given there are two sample methods: First one returns the sum of
//two numbers a and b and second one returns the subtraction of a and b. if
//a-b is negative then return value would be 0. Use ternary operator to call
//these two methods. If a>b then ternary should call sum(a,b) but if a<b
//then ternary operator should call sub(a,b). Eventually print the result of
//the ternary operation on variable a and b.
//Note: Ternary operator can call a method even for true and false values

package assignment_01;
import java.util.Scanner;
public class Q6 {

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
