package homework1;

public class test_p24 {
	
	public static void main(String[] args)
	{
		Car6 car1 = new Car6();
		
		car1.setcar(1234, 20.5);
		System.out.println(car1);
		
	}
}

class Car6
{
	protected int num;
	protected double gas;
	
	public Car6()
	{
		num = 0;
		gas =0;
		System.out.println("生產了車子");
	}
	public void setcar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		
	}
	
	public String toString()
	{
		String str ="車號:"+num+"汽車輛:"+gas;
		return str;
	}
}