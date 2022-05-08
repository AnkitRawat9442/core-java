//Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
//ClassThree classes.
//ClassOne contains one, single parameterized constructor
//ClassTwo contains only a default constructor
//ClassThree contains one, single parameterized constructor and a default
//constructor.
//Create an object of top child class and make sure the constructor
//execution will take place according to respective multi-level inheritance
//hierarchy.
//ClassThree obj = new ClassThree(1);
//ClassThree obj = new ClassThree();

package assignment_01;
public class Q4 {
    public static void main(String[] args) {
		ClassThree s = new ClassThree();
	}
}
class ClassOne 
{
   ClassOne(int a )  // parameterized constructor 
   {
	   System.out.println("this is classOne parametrised Constructor ");
   }
}
class ClassTwo  extends ClassOne
{
	ClassTwo()   // default constructor
	{  
		super(6);
		System.out.println("this is clasTwo Constructor ");
	}
}
class ClassThree extends ClassTwo
{
   ClassThree()     // default constructor 
   {
	   System.out.println("this is classThree Constructor ");
   }
   ClassThree(int x)    // Parameterized constructor 
   {
	   System.out.println("this is classThree Parameterised Constructor ");
   }
}






