/*
 * @author:Vinoth Rajendran
 * desc:Create a method which accepts an array of integer elements and return the second smallest element in the array
 */


package co.com.practice.util.SecondSmall;

public class Secondsmall {
	
	
	public int getSecondSmallest(int[] arr)
	{
		System.out.print(arr.length);
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return arr[0];
		}
		else
		{
		int str=arr.length;
		int temp=0;
		for(int i=0;i<str;i++ )
		{
			for(int j=i+1;j<str;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[1];
	}
	}
}
