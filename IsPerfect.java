import java.util.Scanner;
public class IsPerfect{
	
     public void perfectno(int n){
     	int sum=0;
     	for(int i=1;i<=n/2;i++){
     		if(n%i==0)
     		{
     			sum=sum+i;
     		}
     	}
     	if(sum==n)
     	System.out.println("no is perfect "+n);
        // else 
         //	System.out.println("is notperfect "+n);
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<a;i++)
		{
			IsPerfect obj=new IsPerfect();
				obj.perfectno(i);
			}
	}
}