package homework_3;

import java.io.IOException;

public class p_47 {

	public static void main(String[] args)throws IOException
	{
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar(number,gasoline);
		car1.setName(str);
		
		car1.show();
	}
}

class Car
{
	public int num;
	public double gas;
	public String name;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為" + num + "汽油量設為" + gas + "");
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為" + name);
	}
	
	public void show()
	{
		System.out.println("car1的車號是"+this.num);
		System.out.println("car1的汽油量是"+this.gas);
	}
}
