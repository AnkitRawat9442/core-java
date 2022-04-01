package unit01;

public class P4_task01_Control_and_Conditional_Statements_In_Java {

	public static void main(String[] args) {
	
		
		Conditional_Statements obj = new Conditional_Statements();
		obj.IF_ELSE_CONDITION();
		
		

	}

}

class Conditional_Statements{
	
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
		
		
	}
}