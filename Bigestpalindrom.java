import java.util.*;
public class Bigestpalindrom{
	public static boolean cheqpalindrom(String s){
		int f=0,l=s.length()-1,p=0;
		while(f<l){
			if(s.charAt(f)!=s.charAt(l)){
				p=1;
			}
			f++;
			l--;
		
		}
		if(p==0)
		return true;
	    else 
	    	return false;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		String a="";
		String b="";
		for(int i=0;i<s.length();i++){
			for(int j=s.length()-1;j>i;j--){
				if(s.charAt(i)==s.charAt(j))
				{
                   if(true==cheqpalindrom(s.substring(i,j+1)))
                   {
                     b=s.substring(i,j+1);
                     if(a.length()<b.length())
                   	a=s.substring(i,j+1);
                   }
				}
			}
		}
		System.out.println(a);

	}
}