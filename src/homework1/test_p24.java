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
		System.out.println("�Ͳ��F���l");
	}
	public void setcar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		
	}
	
	public String toString()
	{
		String str ="����:"+num+"�T����:"+gas;
		return str;
	}
}