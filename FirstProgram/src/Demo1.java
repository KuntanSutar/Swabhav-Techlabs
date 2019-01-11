public abstract class Demo1 extends Demo
{
	public void m2()
	{
		System.out.println("Demo1 m2() method");
	}
	public abstract void m3();
	
	static public void main(String... Kuntan)
	{
		Demo d = new Demo();
		d.m1();
	}
}
