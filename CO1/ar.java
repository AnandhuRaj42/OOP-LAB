import java.util.Scanner;
public class ar{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	shape s=new shape();
	int opt;
	do{
		System.out.println("Enter your choice\n1.Circle\n2.Triangle\n3.Rectangle\n4.Square\n5.Exit");
		opt=sc.nextInt();
		switch(opt)
		{
		case 1:System.out.println("Enter the radius");
				float r=sc.nextFloat();
				s.area(r);
				break;
		case 2:System.out.println("Enter the breadth");
				int b=sc.nextInt();
				System.out.println("Enter the height");
				int h=sc.nextInt();
				s.area(b,h);
				break;
		case 3:System.out.println("Enter the lenght");
				int l=sc.nextInt();
				System.out.println("Enter the breadth");
				int b1=sc.nextInt();
				s.area(l,b1);
				break;
		case 4:System.out.println("Enter the side");
				int a=sc.nextInt();
				s.area(a);
				break;
		case 5:break;
		default:System.out.println("Invalid Input");
			    break;


		}
	}while(opt!=5);
	
}
}
class shape{
	void area(float a)
	{
	float ar=(float)3.14*a*a;
	System.out.println("Area of Circle:"+ar);
	}
	void area(int b,int h)
	{
	float ar=(float).5*b*h;
	System.out.println("Area of Triangle:"+ar);
	}
	void area(int l,int b)
	{
	int ar=l*b;
	System.out.println("Area of Rectangle:"+ar);
	}
	void area(int l)
	{
	int ar=l*l;
	System.out.println("Area of Square:"+ar);
	}
}