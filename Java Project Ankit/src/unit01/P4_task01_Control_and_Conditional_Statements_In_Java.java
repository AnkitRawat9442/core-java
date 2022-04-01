package unit01;

public class P4_task01_Control_and_Conditional_Statements_In_Java {

	public static void main(String[] args) {
	
		
		Statements obj = new Statements();
		obj.IF_ELSE_CONDITION();
		obj.Ternary_Condition();
		obj.Switch_Condition();
		obj.LoopStatements();
		obj.JumpStatements();
		
		

	}

}

class Statements{
	
	void IF_ELSE_CONDITION() {
		// if is used to check condition 
		int a = 5 , b = 7;
		System.out.println("val of a : "+ a +"\nval of b : "+b);
		if(a>b) 
			System.out.println("a is greater than b ");
		else 
			System.out.println("b is greater than a");
	}
	void Ternary_Condition() {
		int b = 5 , c = 6;
		int a = (c>b) ? c : b ;  // if c>b  then a = c otherwise c = b
		System.out.println(a);
	}
	void Switch_Condition () {
		int a = 2 ;
		switch(a) 
		{
		case 1 :
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
			break;
		}
	}
	void LoopStatements()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;	
		}
		System.out.println("The sum of first n natural number is" + sum); //concatenation is done to print the value of sum along with the written statement
		
		String[] names= {"Java","C","Python","Javascript","R"};
		System.out.println("Printing the contents of array names:\n");
		
		//For-each loop
		for(String name:names)
		{
			System.out.println(name); //name is the variable used for accessing all the values of our string "names"
			
		}
		int i=0;
		System.out.println("Printing the list of first 10 even numbers");
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
			
		}
	    i=0; //assigning value again to i so that it can be used for do-while loop 
	    System.out.println("Printing the list of first 10 even numbers\n");
	    do {
	    	System.out.println(i);
	    	i=i+2;
	    }while(i<=10);
	}
	void JumpStatements()
	{
		//Break statement will terminate the loop as soon as the condition holds true
	for(int i=0;i<=10;i++)
		{
		System.out.println(i);
		if(i==6)
		{
			break;
		}
	System.out.println(i);
	}
	   //Continue statement will exclude/skip the conditional value and rest of the values are printed 
	for(int i=0;i<=10;i++)
	      {
	      System.out.println(i);
	      if(i==6)
	      {
	    	  continue;

	      }
	      System.out.println(i);
	      }
		}
	}
