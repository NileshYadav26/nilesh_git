public class AutoMorphic{
	
	     public void autamophic(int n){
	     	int no,f=0;
	Power obj=new Power();
	        no=obj.power(n,2);
	        System.out.println(no);
	        while(n!=0&&no!=0){
	        	int r,r1,c=0;
	        	r=n%10;
	        	r1=no%10;
	        	if(r!=r1)
	        	{ f=1;
	               System.out.println("not Autpmophic number");
	        	}
	        	n=n/10;
	        	no=no/10;
	        }
	        if(f==0)
	        System.out.println("AutoMophic Number");
	}
	public static void main(String[] args) {
		
		Integer n=12;
		AutoMorphic obj1=new AutoMorphic();
		obj1.autamophic(n);
		
    }
}