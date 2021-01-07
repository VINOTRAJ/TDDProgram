package co.com.practice.util.reverseanumber;

public class reverseanumber {
	
	
	
	public int getSorted(int[] arr)
	{
		//int[] arr= {34,56,21,10,59};
		
		//int arr=arr1.length;
		
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return 1;
		}
		else
		{
	int rem=0,rev=0;
	int in=0;
	int stored[]=new int[1000];
	for(int i=0;i<arr.length;i++)
	{
		rev=0;
		while(arr[i]!=0)
		{
			rem=arr[i]%10;
			rev=(rev*10)+rem;
			arr[i]=arr[i]/10;
		}
		stored[in]=rev;
		in++;
	}
	int temp=0;
	for(int i=0;i<in;i++)
	{
		for(int j=i+1;j<in;j++)
		{
			if(stored[i]>stored[j])
			{
				temp=stored[i];
				stored[i]=stored[j];
				stored[j]=temp;
			}
		}
		
	}
	return 0;
//	for(int i=0;i<in;i++)
//	{
//		
//		System.out.println(stored[i]);
//	}
		}

}
}
