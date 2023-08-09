import java.util.Scanner;
public class IsStrong{

	public int factorial(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		return sum;
	}
	public void strong(int n)
	{
		int sum=0,t=n;
		while(n!=0){
			int r;
			r=n%10;
			IsStrong obj=new IsStrong();
			sum=sum+obj.factorial(r);
			n=n/10;
		}
		if(sum==t)
			System.out.println("strong no"+sum+t);
		else 
			System.out.println("not strong"+sum+t);
	}
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner obj3=new Scanner(System.in);
		int n=obj3.nextInt();
		for(int i=1;i<n;i++){
				IsStrong  obj=new IsStrong();
				obj.strong(i);}
	}
}