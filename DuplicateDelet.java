import java.lang.String;
public class DuplicateDelet{
	public static void main(String[] args) {
		String s="hah batt kaetw mann";
        String p="";	
        String v="";
        for(int i=0;i<s.length();i++)
        {   if(i==s.length()-1)
             {
             	System.out.println(s);
    	        s=s;
             }
          else {
          	System.out.println(s);

        		for(int j=i+1;j<s.length();j++)
        	        	{
        	        		if(s.charAt(i)==s.charAt(j))
        	        		{
        	        			if(j==s.length()-1)
        	        			{
        	        				p=s.substring(0,j);
        	        				s=p;
        	        			}
        	        			else if (j==0)
        	        			{
        	        				v=s.substring(j+1,s.length()-1);
        	        				s=v;
        	        			} 
        	        				
        	        			else
        	        			{
        							p=s.substring(0,j);
        							v=s.substring(j+1,s.length());
        							//System.out.println(v);
        							s=p+v;
        						}
        	        		}
        	
        	        	}
                      }
        }
        
         System.out.println(s);
	}
}