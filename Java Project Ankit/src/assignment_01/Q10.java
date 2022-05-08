//Q10. WAP in Java Program To Survey Four Different Car Models For Four
//Different Cities:

package assignment_01;
import java.util.Scanner;
public class Q10 {
   public static void main(String[] args) {
	 int car [] = new int[4];
	 for(int i = 0 ;i< 4 ;i++)
	  car[i] = 0;
	 City c[] = new City[4];
	 for(int i = 0 ;i< 4 ;i++)
	 {
		 System.out.println("Enter data for city "+ (i+1));
		 c[i] = new City();
		 car[0] += c[i].model[0];
		 car[1] += c[i].model[1];
		 car[2] += c[i].model[2];
		 car[3] += c[i].model[3];	 
	 }
	 System.out.println("Total number of car in all city ");
	 System.out.println("Maruti-K10 : "+car[0] );
	 System.out.println("Zen-Astelo : "+car[1] );
	 System.out.println("Wagnor : "+car[2] );
	 System.out.println("Maruti-SX4 : "+car[3] );
	 }
}

class City
{
	int model[] = new int[4];
	City()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Marauti-K10 : ");
		model[0] = sc.nextInt();
		System.out.print("Zen-Astelo : ");
		model[1] = sc.nextInt();
		System.out.print("Wagnor : ");
		model[2] = sc.nextInt();
		System.out.print("Marauti-SX4 : ");
		model[3] = sc.nextInt();
		
	}
}












