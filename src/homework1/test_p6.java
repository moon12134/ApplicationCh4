package homework1;

public class test_p6 {

	public static void main(String[] args) {
		RacingCar1 rccar11 = new RacingCar1(1234, 20.5,5);
	}

}
class Car1
{
	private int num;
	private double gas;
	
	public Car1()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car1(int n ,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F���l��"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void setCar1(int n ,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+ gas);		
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar1 extends Car1
{
	private int course;
	
	public RacingCar1(int n, double g, int c)
	{
		super(n, g);
		course = c;
		System.out.println("�Ͳ��F�ɨ��s����"+course +"���ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}