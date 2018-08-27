import java.util.Scanner;
class Comp_Complex
{
	Scanner ip = new Scanner(System.in);
	int i , r;
	void getData()
	{
		System.out.println("Enter Numbers");
		r = ip.nextInt();
		i = ip.nextInt();
	}
	
	void display()
	{
		System.out.println("Complex Number is " + r + " + " + i + "i");
	}
}
public class Complex
{
	public static void main(String[] x)
	{
		Comp_Complex cp = new Comp_Complex();
		cp.getData();
		cp.display();
	}
}