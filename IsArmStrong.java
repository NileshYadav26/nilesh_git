public class IsArmStrong{
	public void armstrong(int n){
		int c;
		int t=n,sum=0;
		DigitCount obj1=new DigitCount();
		c=obj1.count(n);
		while(n!=0){
			int r;
			r=n%10;
			Power obj2=new Power();
			sum=sum+obj2.power(r,c);
			n=n/10;

		}
		if(t==sum)
			System.out.println("Armstrong"+sum+t);
		else 
			System.out.println("not ArmStrong"+sum+t);
	}

	public static void main(String[] args) {
		for(int i=1;i<155;i++){
				IsArmStrong obj3=new IsArmStrong();
				obj3.armstrong(i);}
	}
}