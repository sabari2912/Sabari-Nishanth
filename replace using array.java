import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int num[]=new int[size];
	int sum=0;
	
	for(int ind=0;ind<size;ind++)
	{
	num[ind]=sc.nextInt();
	sum=sum+num[ind];
	
    }
    for(int ind=0;ind<size;ind++)
	{
	num[ind]=sum-num[ind];
	System.out.print(num[ind]+" ");
	}
}	
}
