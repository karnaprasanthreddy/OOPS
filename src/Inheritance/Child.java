package Inheritance;

public class Child extends Parent {
	//int a=1;
	/*void m1()
	{
		System.out.println("m1 method");
	}
	
	void m2()
	{
		System.out.println("m2 method");
	}
	
	void m3()
	{
		System.out.println("m3 method");
	}
	
	void m4()
	{
		System.out.println("m4 method");
	}

	void m5()

	{
		System.out.println("m5 method");
	}*/

	public static void main(String args[])
	{
		Parent child=new Child();
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		child.m5();
		System.out.println(child.a);
	}

}
