package homework1;

public class test_p9 {

	public static void main(String[] args) {
		RacingCar2 rccar11 = new RacingCar2();
		
		rccar11.newShow();
	}

}
class Car2
{
	protected int num;
	protected double gas;
	
	public Car2()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	} 
	
	public void setCar2(int n ,double g)
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


class RacingCar2 extends Car2
{
	private int course;
	
	public RacingCar2()
	{ 
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void newShow()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車的編號是"+course);
	}
}