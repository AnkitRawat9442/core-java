package unit01;

public class P5_Task_01_ClassAndObjectsInJava {
	public static void main(String[] args) {
		ABCD obj = new ABCD();
		ABCD.display();
		
		ABCD.display();
		
		ABCD obj1 = new ABCD();
		obj1.display2();
	}
}

class ABCD{
	int a =10;
	static int b = 10;
	
	static void display() {
		
		int b = 10;
		b++;
		
		System.out.println(b);
	}
	void display2()
	{
//		System.out.println(a);
//		a was a local variable so we can't access it outside the method
		System.out.println(b);
		
	}
}