package homework1;

public class test_p25 {
	public static void main(String[] args)
	{
		Car8 car[] = new Car8[2];
		car[0] = new Car8();
		car[1] = new RacingCar11();
		
		for(int i = 0; i<car.length;i++)
		{
			Class cl = car[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}		
	}
}
class Car8
{
	protected int num;
	protected double gas;
	
	public Car8()
	{
		num = 0;
		gas = 0;
		System.out.println("�Ͳ��F���l");
	}
}
class RacingCar11 extends Car8
{
	public RacingCar11()
	{
		System.out.println("�Ͳ��F�ɨ�");
	}
}