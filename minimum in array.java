import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int num[]=new int[size];
	for(int ind=0;ind<size;ind++)
	num[ind]=sc.nextInt();
	int min=num[0];
	for(int ind=0;ind<size;ind++)
    {
    if(num[ind]<min)
    min=num[ind];
    }
    	System.out.print(min);
}	
}
