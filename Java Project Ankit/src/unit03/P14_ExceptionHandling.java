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
   // obj.basicException();
//    obj.handleException();
//    obj.multipleCatch();
//    obj.inputMismatchException();
    obj.usingMyExeption(-6);
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
		
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");
	}
	
	void useOfThrow(int age) 
	{
		//throw keyword is used in java to explicitly throw an exception from a method or any block of code
		//we can either throw checked or unchecked exception
		//the throw keyword is mainly used to throw custom exception
		try
		{

			if(age<18)
			{
				throw new ArithmeticException("Use of Throw");

				//this error must be handled by caller method
				//pointed by throws
			}
			else
			{
				System.out.println("You are allowed");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
			
		
		
		System.out.println("Done!");
	}
	
	void useOfThrows(int age) throws Exception
	{
		//throws is a keyword in java which is used in the signature 
		//of method to indicated that this method might throw one of the listed type exceptions
						
						/*
						 * we can use throws keyword to delegate the responsibility of 
						 * exception handling to the caller then caller method is responsible to handle that exception
						 * 
						 * syntax:
						 * type method_name(parameters) throws exception_list
						 */
		
			if(age<18)
			{
				throw new Exception("Use of Throws");

				//this error must be handled by caller method
				//pointed by throws
			}
			else
			{
				System.out.println("You are allowed");
			}
			
		
		
		System.out.println("Done!");
	}
	
	void useOfFinally() 
	{
		
		
		
		/*
		 * finally	The "finally" block is used to execute the necessary code of the program. 
		 *It is executed whether an exception is handled or not.
		 */
		
		try
		{
			
			useOfThrows(12);
			
			//we can not use it without try block as it throws checked exception
			//so compiler enforce use to handle it
			//if it would have thrown ArithmeticException then it can be called without try
			//as it is a unchecked exception
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Done!!!: The try catch is finished");
			//executed whether exception occurs or not
		}
		

	}
	
	void checkedAndUncheckedException()
	{
		/*
		 *There are mainly two types of exceptions: checked and unchecked. 
		 *An error is considered as the unchecked exception. 
		 *However, according to Oracle, there are three types of exceptions namely:
		
		 *1.Checked Exception:
		 *-The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
		 *-For example, IOException, SQLException, etc.
		 *-Checked exceptions are checked at compile-time.
		 *
		 *2.Unchecked Exception:
		 *-The classes that inherit the RuntimeException are known as unchecked exceptions. 
		 *-For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
		 *-Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
		 *
		 *3.Error:
		 *-Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
		 *-Errors cannot be handled
		 *-for example when stackOverFlow occurs we can not handle it as memory can not be increased
		 *
		 */
		
		try
		{
			
			useOfThrow(12);
			
			//checked Exception
			
			//we can not use it without try block as it throws checked exception
			//so compiler enforce use to handle it
			//if it would have thrown ArithmeticException then it can be called without try
			//as it is a unchecked exception
		}
		catch(Exception e)
		{
			System.out.println("checked Exception");
		}
		
		try
		{
			int b=0;
			int a=5/b;                          //code breaks at this line and exception is thrown
			System.out.println("5/0="+a);
			//unchecked Exception
		}
		catch(ArithmeticException e)
		{
			//Thrown when an exceptional arithmetic condition has occurred.
			//For example, an integer "divide by zero" throws an instance of this class
			
			//catch the occurred exception
			
		
			System.out.println("unchecked Exception");
			
			
		}
		System.out.println("Done!");
	}
	void usingMyExeption(int a)
	{
		try
		{
			if(a<0)
			{
				throw new Myexception();
			}
			else
			{
				System.out.println(a+"is positive");
			}
		}
		catch(Myexception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}

//making own exception

class Myexception extends Exception
{
	

	//to create our own exception our class should extend Exception Class
	public String getMessage()
	{
		
		//we can override getMessage method of Exception Class
		return "MyException Occured";
	}
}
