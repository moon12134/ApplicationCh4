package homework1;

public class test_p41 
{
	public static void main(String[] args)
	{
		Car111 car1 = new Car111(1234, 20.5);
		car1.vshow();
		car1.mshow();
	}
	
}
interface iVehicle1
{
	void vshow();
}
interface iMaterial
{
	void mshow();
}

class Car111 implements iVehicle1,iMaterial
{
	private int num;
	private double gas;
	
	public Car111(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void vshow()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public void mshow()
	{
		System.out.println("���l������O�K"); 
	}
	
}