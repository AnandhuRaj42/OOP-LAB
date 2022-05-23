package graphics;
import java.util.Scanner;
class square implements ap
{
	Scanner sc=new Scanner(System.in);
	int ra;
	void read()
	{
	System.out.println("Enter the side");
	ra=sc.nextInt();
	}
	public void area()
	{
		int ar=ra*ra;
		System.out.println("Area of square is "+ar);
	}
}