package unit03;
import java.util.Scanner;
// exception is not error , because exception can be  handled by catch block

//                   object
//                     |
//                  throwable
//                     |
//                    / \
//                   /   \
//          exception      Error

//    -
public class P14_ExceptionHandling {

	public static void main(String[] args) {
	
    exception obj  = new exception();
    obj.basicException();
    obj.handleException();
    obj.multipleCatch();
    obj.inputMismatchException();
	}

}

class exception
{
	// Compiler can not catch this exception at compile time
	void basicException()
	{
		int b  =0 ;
		int a = 100/b;
		System.out.println(a);
	}
	void handleException()
	{
		try {
			// sensitive info
			int b  = 0 ;
			int a = 100/b;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
	void multipleCatch()
	{
		try {
			// sensitive info
			int b  = 0 ;
			int a = 100/b;
			System.out.println(a);
		}
//			catch(Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("Exception ");
//		}
// if Exception class is above ArithmeticException class then 
// Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
// Exception is the super class  
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception ");
		}
		
	}
	void inputMismatchException()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int a = sc.nextInt();
			System.out.println(a);
			sc.close();
	}catch(Exception e )
		{
		System.out.println(e.getMessage());
		}
		
	}
	void stackOverFlowError(int i)
	{
		try {
			while(i>0)
			{
				i++;
				stackOverFlowError(i);
			}
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	void indexOutOfBoundException()
	{
		try {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void nullPointerException()
	{
        try {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void useOfThrow()
	{
        try {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void useOfThrows_And_Finally()
	{
        try {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}