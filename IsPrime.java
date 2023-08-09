import java.util.Scanner;
public class IsPrime{

 public boolean isPrime(int n){
 	for(int i=2;i<=n/2;i++)
 	{
 		if(n%i==0)
 		{
 			 			return false;
 		}
 	}
 	 return true;
   }
public static void main(String[] args) {
	Scanner nil=new Scanner(System.in);
	int n=nil.nextInt();
	for(int i=3;i<=n;i++)
	{
			IsPrime obj=new IsPrime();
			if(obj.isPrime(i))
			System.out.println("prime = "+i);
		    else 
		    System.out.println("not prime = "+i);}
}
	
}