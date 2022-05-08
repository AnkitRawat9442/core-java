//Q1- WAP which would contain 6 objects, of a class
//Student. Student [Name, Age, section, percentage]. They all belong to
//Section-A. Your program would be able to find the average percentage of
//students in this section. Use constructors to create these 6 objects and
//input from Scanner class.
package assignment_01;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {

		student s[] = new student[6];
	
        float avg_per = 0;
		for( int i =0 ;i< 6 ; i++)
		{
			s[i] = new student ();
			avg_per += s[i].percentage;
		}
		avg_per = avg_per /6;
		 
System.out.println("Average Percentage of the Student : "+ avg_per);
	}

}

class student
{
	String name ;
	int age ;
	char section ;
	float  percentage;
	
	student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();
		System.out.print("Enter Section : ");
	    section = sc.next().charAt(0);
		System.out.print("Enter Percentage : ");
		percentage = sc.nextFloat();
		
	}
	void printdata()
	{
		System.out.println(name + age);
	}
	
   
}