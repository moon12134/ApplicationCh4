package homework1;

public class test_p11 {

	public static void main(String[] args) {
		RacingCar3 rccar11 = new RacingCar3();
		
		rccar11.setCar3(1234, 20.5);
		rccar11.setCourse(5);
		
		rccar11.show();
		
	}

}
class Car3
{
	protected int num;
	protected double gas;
	
	public Car3()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	} 
	
	public void setCar3(int n ,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+ gas);		
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}


class RacingCar3 extends Car3
{
	private int course;
	
	public RacingCar3()
	{ 
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車的編號是"+course);
	}
}