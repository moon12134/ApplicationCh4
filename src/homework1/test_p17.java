package homework1;

public class test_p17 {

	public static void main(String[] args) {
		Car5 cars[] = new Car5[2];
		cars[0] = new Car5();
		
		cars[0].setCar5(1234,20.5);
		
		cars[1] = new RacingCar5();

		cars[1].setCar5(4567,30.5);
		
		for(int i = 0;i<cars.length;i++)
		{
			cars[i].show();
		}
		
	}

}
class Car5
{
	protected int num;
	protected double gas;
	
	public Car5()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	} 
	
	public void setCar5(int n ,double g)
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


class RacingCar5 extends Car5
{
	private int course;
	
	public RacingCar5()
	{ 
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ����s���O"+course);
	}
}