package homework1;

public class test_p26 {
	public static void main(String[] args)
	{
		Car9 car1 = new Car9();
		Car9 car2 = new Car9();
		
		Car9 car3;
		car3 = car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
		
				
	}
}
class Car9
{
	protected int num;
	protected double gas;
	
	public Car9()
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
}