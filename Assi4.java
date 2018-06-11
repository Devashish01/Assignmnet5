import java.util.Scanner;
class Wave
{
	 Scanner input=new Scanner(System.in);
	void fun()
	{
		
		int arr[]=new int[10];

        int i,temp=0;
        for(i=0;i<10;i++)
             arr[i]=input.nextInt();




        for(  i=0;i<arr.length;i++)
		{
        	
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

                 for(i=0;i<10;i=i+2)
                 {
                     temp=arr[i+1];
                     arr[i+1]=arr[i];
                     arr[i]=temp;
                 }

                 for(i=0;i<10;i++)
                 	{
                	 System.out.print(arr[i]+" ");
                 	}
	}
}


public class Assi4 {

    public static void main(String[] args){
        System.out.println("Enter any 10 numbers ");
        Wave obj=new Wave();
        obj.fun();
     
    }

}