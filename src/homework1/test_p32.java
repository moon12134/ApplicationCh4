package homework1;

public class test_p32 {

	public static void main(String[] args)
	{
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car11(1234, 20.5);
		vc[1] = new Plane11(232);
		
		for(int i = 0; i<vc.length;i++)
		{
			if(vc[i] instanceof Car11)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
}
class Car11 extends Vehicle
{
	private int num;
	private double gas;
	public Car11(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為:"+num+"，汽油量為:"+gas+"的車子");
		
	}
	public void show()
	{
		System.out.println("車號是:"+num);
		System.out.println("汽油量是:"+gas);
		System.out.println("速度是:"+speed);
	}
}
class Plane11 extends Vehicle
{
	private int flight;
	
	public Plane11(int f)
	{
		flight = f;
		System.out.println("生產了"+flight +"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
		
	}
}