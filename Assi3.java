import java.util.Scanner;

class Second
{
	Scanner input =new Scanner(System.in);
	void fun()
	{ int arr[]=new int[10];
	
		for(int i=0;i<10;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int  i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] > arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
			System.out.print(arr[1]);
		
		
		
	}
	
	
}
public class Assi3 {

	public static void main(String[] args) {
		
		Second obj=new Second();
		obj.fun();
		
		
	}

}
