package homework_3;

public class p_31 {

	public static void main(String[] args)
	{
		
		Car.showSum();
		
		Car car1;
		car1 = new Car();	
		car2.setCar(1234,20.5);
		
		Car.showsum();
		
		Car car2;
		car2 = new Car();
		car2.setCar(4567,30.5);

	}
}

class Car
{
	
	public static int sum=0;
	
	public int num;
	public double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為" + num + "汽油量設為" + gas);
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有" + sum + "台");
	}
	
	public void show()
	{
		System.out.println("car1的車號是"+this.num);
		System.out.println("car1的汽油量是"+this.gas);
	}
}
