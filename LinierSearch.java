public class LinierSearch{
	public static void main(String[] args) {
		int arr[]={10,20,30,20,40};
		int f=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==80)
			{
				System.out.println("found");
			    f=1;
			}
		}
if(f==0)

		System.out.println("not found");
	}
}