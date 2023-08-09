public class BinarySearch{
	public static void main(String[] args) {
		int arr[]={2,3,4,5,6,7,8};
		int t=4;
		int mid,f=0;
		int start=0,last=arr.length-1;
		while(start<=last)
		{
			mid=(start+last)/2;
			if(arr[mid]==t)
			
              f=1;

			if(t<arr[mid])
				last=mid-1;
			else start=mid+1;;
			
		}
		if(f==1)
			System.out.println("found");
		else 
			System.out.println("not found");
	}
}