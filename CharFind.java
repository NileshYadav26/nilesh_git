public class CharFind{
	public static void main(String[] args) {
		String s="neilesehe ";
		char ch='e';
		int f=0,c=0;
		for(int i=0;i<s.length();i++)
		{  c=0;
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j))
					c++;
			}
			System.out.println(s.charAt(i)+" "+c);
		}
		
	}

	
}