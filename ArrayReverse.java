public class ArrayReverse{
	public static void main(String[] args) {
		int [] marks={2,4,3,5,6,7};
		Integer first=0,last=marks.length-1,temp;
		for(int i=0;i<=last;i++){
			System.out.print(marks[i]);
		}
		System.out.println(" ");
		while(first<last){
			temp=marks[first];
			marks[first]=marks[last];
			marks[last]=temp;
			first++;
			last--;
		}
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]);
		}
	}
}