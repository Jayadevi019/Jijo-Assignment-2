import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithmetic
{
	int num1,num2,num3;

	Arithmetic(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	abstract int calculate();

}



class Addition extends Arithmetic
{

	Addition(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		num3=num1+num2;
		return num3;
	}
	
}
class Subtraction extends Arithmetic
{

	Subtraction(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		
		num3=num1-num2;
		return num3;
	}
	
}class Multiplication extends Arithmetic
{

	Multiplication(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		num3=num1*num2;
		return num3;
	}

	
}
class Division extends Arithmetic
{
 
    Division(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		num3=num1/num2;
		return num3;
	}
	
}
public class Calculator_Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter the Numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Choice");
		int choice = Integer.parseInt(br.readLine());
		Arithmetic arr[]= {new Addition(num1,num2),new Subtraction(num1,num2),new Multiplication(num1, num2),new Division(num1,num2)};
		
	
		
			System.out.println(arr[choice-1].calculate());
		

	}

}
