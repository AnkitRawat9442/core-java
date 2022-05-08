//WAP in java, which would demonstrate access protection over a
//class and a variable of that class.

package assignment_01;

public class Q9 {

	public static void main(String[] args) {
		
		A a = new A(); // object of class A 
		B b = new B();  // Object of class B
        C c = new C();  // Object of class C
        // private member -> cannot have access outof class 
       // a.fun4();  // The method fun4() from the type A is not visible
       // default is accessible inside package
        a.fun1();
        // public is accessible from anywhere
        a.fun2();
        // protected is accessible in all subclass
        a.fun3();
        b.fun3();
        c.fun3();  
	}
}
class A 
{
	void fun1()
	{
		System.out.println("This is default fun1");
	}
	public void fun2()
	{
		System.out.println("This is public Fun2");
	}
	protected void fun3()
	{
	 System.out.println("this is protected fun3");
	}
	private void fun4()
	{
		System.out.println("This is private fun4");
	}
}
class B extends A {}
class C extends B {}
class D
{
	void display()
	{
		A a = new A();
		a.fun2();   // public can be accessible anywhere
	}
}