package homework_3;

public class p_22 {

	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
		
	}
}

class Car
{
	public int num;
	public double gas;
	
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",將汽油量設為"+gas);
		}
		else
		{
			System.out.println("不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	
	public void show()
	{
		System.out.println("car1的車號是"+this.num);
		System.out.println("car1的汽油量是"+this.gas);
	}
}

