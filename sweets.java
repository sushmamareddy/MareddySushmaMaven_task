package sweet;
import java.util.*;
public class sweets {
	Scanner sc=new Scanner(System.in);
	public static int count=0;
	public void sweet1()
	{
		System.out.println("enter no of sweets of type 1 : ");
		int s1=sc.nextInt();
		System.out.println("sweets 1 : "+s1);
		count=count+s1;
	}
	public void sweet2()
	{
		System.out.println("enter no of sweets of type 2 : ");
		int s2=sc.nextInt();
		System.out.println("sweets 2 : "+s2);
		count=count+s2;
	}

}