import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for( int row=1;row<=n;row++){
        for( int col=1;col<=row;col++)
        System.out.print("*");
        System.out.println();
        }
    }
}
