import java.util.Scanner;

public class weirdAlgo{
	public static void main(String[] args){
	    Scanner myObj = new Scanner(System.in);
		long n = myObj.nextInt();
		while(n>0){
		    System.out.printf("%d ", n);
		    if(n==1){
				n=0;
			}
			else{
			    if(n%2==0){
				    n /= 2;
				}
				else{
				    n *= 3;
					n++;
				}
			}
		}
	}
}
