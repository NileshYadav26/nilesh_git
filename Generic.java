import java.util.Scanner;
public class Generic{
	  
	  public int generic(int n)
	  {
	  	int r,sum=0;
	  	while(n>10)
	  		  	{
	  		  		sum=0;
	  		  		while(n!=0)
	  		  		  	        {
	  		  		  	           
	  		  		  	           	 r=n%10;
	  		  		  	            sum=sum+r;
	  		  		  	            n=n/10;
	  		  		  	        }
	  		  		  	        n=sum;
	  		  		  	     }	  	        
     	  	   return n; 
	  	   }

	public static void main(String[] args) {
		Generic obj=new Generic();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(obj.generic(n));
	}
}