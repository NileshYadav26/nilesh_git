import java.util.Scanner;
public class GroupRev{
   public static void main(String[] args) {
	 	String s="123456789101112131415";
	 	int start,last;
	 	char temp;
      char ch[]=s.toCharArray();
      System.out.println("enter number:");
	 	Scanner obj=new Scanner(System.in);
	 	int n=obj.nextInt();
	 	start=0;
	 	last=n-1; 	
	  while(last<ch.length-1){
        while(start<last)
   	{
        temp=ch[start];
        ch[start]=ch[last];
        ch[last]=temp;
        start++;
        last--;
   	}
   	if(n%2==0){
   	       start=start+n/2;
   	       last=start+n-1;
   	}
   	else {
   		 start=start+n/2+1;
   	       last=start+n-1;
   	}
   		 	}
	 	s=new String(ch);
	 	System.out.println(ch);
	 	System.out.println(s); 	 	
	}
}