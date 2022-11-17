package homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_45 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Car car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
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
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
	}
	
	public void show()
	{
		System.out.println("car1的車號是"+this.num);
		System.out.println("car1的汽油量是"+this.gas);
	}
}

