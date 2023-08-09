public class Fibonacci{
   public int fibonacci(int n){
   	int next=0,no1=0,no2=1,i=1;
   	while(i++<n)
   	{//System.out.println(" "+next);
      next=no1+no2;
      
      no1=no2;
      no2=next;
   	}
      return next;
   }
   public static void main(String[] args) {
   	Fibonacci obj=new Fibonacci();
   	
      System.out.println(obj.fibonacci(Integer.parseInt(args[0])));
   }
}