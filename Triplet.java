
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Triplet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[]= new int[size];
		
		if(size<=2)
		{
			System.out.println("Enter a bigger size");
		}
		else {
			System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{ String s1=br.readLine();
        int x=Integer.parseInt(s1);
		arr[i]=x;
		}
		if(UserMainCode.CheckTriplets(arr))
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}}

}
