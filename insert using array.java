import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int pos=sc.nextInt();
        int value=sc.nextInt();
        if (pos < 1 || pos > limit + 1) {
            System.out.println("Invalid position!");
            return; 
}
    int[] arr = new int[limit+1];
        for (int i = 0; i < limit; i++) 
            arr[i] = sc.nextInt();
        
        for(int i=arr.length-1;i>=pos;i--)
            arr[i]=arr[i-1];
        
        arr[pos-1]=value;
        System.out.println(Arrays.toString(arr));
    }
}
