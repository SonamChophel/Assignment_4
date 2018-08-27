import java.util.Scanner;
class Rectangle
{
	private int area , breath ,  length ;
	Rectangle(int a , int b )
	{
		length = a;
		breath = b;
	}
	void cal_area()
	{
		area = length * breath;
	}
	
	void display()
	{
		System.out.println("Area of rectangle is " + area);
	}
	
}
public class Area
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		int n1 , n2;
		System.out.println("Enter length and breath");
		n1 = ip.nextInt();
		n2 = ip.nextInt();
		Rectangle r = new Rectangle(n1,n2);
		r.cal_area();
		r.display();
	}
}