package choco;
import java.util.*;
import sweet.sweets;
public class chocolate extends sweets{
	Scanner sc=new Scanner(System.in);
	public void choco1()
	{
		System.out.println("enter no of chocolates of type 1 : ");
		int c1=sc.nextInt();
		System.out.println("choco 1 : "+c1);
		count=count+c1;
	}
	public void choco2()
	{
		System.out.println("enter no of chocolates of type 2 : ");
		int c2=sc.nextInt();
		System.out.println("choco 1 : "+c2);
		count=count+c2;
	}
}
