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
		System.out.println("�Ͳ��F���l");
	} 
	
	public void setCar2(int n ,double g)
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


class RacingCar2 extends Car2
{
	private int course;
	
	public RacingCar2()
	{ 
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void newShow()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ����s���O"+course);
	}
}