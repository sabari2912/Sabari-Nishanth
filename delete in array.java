import java.util.*;
class Deletion{
public static void main(String args[]){
Scanner kbd=new Scanner(System.in);
int size=kbd.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
arr[i]=kbd.nextInt();
int pos=kbd.nextInt();
for(int i=pos;i<size;i++)	
	arr[i-1]=arr[i];
for(int i=0;i<size-1;i++)
System.out.print(arr[i]+" ");
}
}

