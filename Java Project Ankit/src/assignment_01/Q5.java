//5Q. WAP in Java which would contain 8 objects of a Class Employee.
//Employee contains name, age, department, salary. Your program would
//be able to calculate the total salary to be paid in each department. Use
//constructors to create these 8 objects and Scanner to take inputs.
//Restrictions:
//1- Minimum 8 objects [can be created manually with parameterized
//constructors with Scanner input]
//2- Departments are, A, B, C, D: minimum 4 departments [String Type]
//3- If the Salary exceeds more than 30,000, then the default salary
//would be 25000 of any of the employee
//4- Use array of objects, instead of using multiple 8 objects separately
//Use:
//Employee arr[] = new Employee[8];
//And
//arr[i].department.equals("A");
package assignment_01;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float s_A  = 0 , s_B = 0 , s_C =0  , s_D = 0;
		Employee Emp[] = new Employee[8];
		
		for(int i = 0 ; i<8 ; i++)
		{
		System.out.println("Enter detail of Employee "+(i+1));
		 Emp[i] = new Employee(sc.next(), sc.nextInt() ,sc.next() ,sc.nextFloat());
		 if(Emp[i].department.equals("A"))
		   s_A  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 else if(Emp[i].department.equals("B"))
		   s_B  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 else if(Emp[i].department.equals("C"))
		   s_C  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 else if(Emp[i].department.equals("D"))
		   s_D  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
	}
		 System.out.println("Total Salary In Department A : "  + s_A);
		 System.out.println("Total Salary In Department B : "  + s_B);
		 System.out.println("Total Salary In Department C : "  + s_C);
		 System.out.println("Total Salary In Department D : "  + s_D);
	}
}
class Employee
{   String  name ;
	int age ;
	String department ;
	float salary;
	Employee (String n , int a , String d , float s)
	{   name = n;
		age = a;
		department = d;
		salary = s;
	}}
