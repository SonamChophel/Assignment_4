import java.util.Scanner;
public class Second_Largest
{
	public static void main(String[] x)
	{
		int arr[] = new int[10];
		int i , j;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0 ; i<10 ; i++)
		{
			arr[i] = ip.nextInt();
		}
		int l , sl;
		l = arr[0];
		sl = arr[0];
		
		for( i=0 ; i<10 ; i++)
		{
			if( l < arr[i] )
			{
				sl = l; 
				l = arr[i];
			}
			else if( arr[i] > sl && arr[i] < l)
			{
				sl = arr[i];
			}
		}
		
		System.out.println("The second largest element in an array is " + sl );
	}
}