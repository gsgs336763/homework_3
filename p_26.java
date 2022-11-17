package homework_3;

public class p_26 {

	public static void main(String[] args)
	{
		
		Car car1;
		car1 = new Car();
		
		car1.show();

	}
}

class Car
{
	public int num;
	public double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void show()
	{
		System.out.println("car1的車號是"+this.num);
		System.out.println("car1的汽油量是"+this.gas);
	}
}