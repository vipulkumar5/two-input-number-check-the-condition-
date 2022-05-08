
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//System.out.println(a,b);
		if(a==b){
		    System.out.println("your number is equal ");
		}
		else if(a>b){
		    System.out.println("your a number is grather" );
		}
		else {
		    System.out.println("your number is less than");
		}
	}
}
