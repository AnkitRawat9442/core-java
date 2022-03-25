package unit01;

public class p2_task1_keyword {

	public static void main(String[] args) {
		//variable name
		//Syntax error on token "double", invalid VariableDeclaratorId
		//identifier can never be any keyword
		int double=20;
		
		//function name
		//Syntax error on token "new", invalid AnnotationName
		//identifier can never be any keyword
		int new() {
			
			//sysout[ctrl+space] is the shorcut key for this command
			System.out.println();
			return 0;
		}
       //keyword can never be used as object name
	//ABC cannot be resolved to a variable
     //Syntax error on token "int", delete this token 
	 ABC int=new ABC;
	 
	 //class object can be created inside main even when it's non static
	 ABC n=new ABC();
	 n.display();
	}

}

