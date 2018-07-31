package janani;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n,a;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		while(n!=0){
			a=n%10;
			n=n/10;
			count ++;
		}
     System.out.println(count);
	}

}
