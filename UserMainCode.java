
public class UserMainCode {
	public static boolean CheckTriplets(int arr[])
	{
		int flag=0;
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]==arr[i+1])
			{
				if(arr[i+1]==arr[i+2])
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
		
		return true;
		
	}
		else
		{
		return false;
	}
		
		}
		
}
