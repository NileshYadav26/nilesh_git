public class InsertionSort{
	public static void main(String[] args) {
		int arr[]={2,5,4,6,7,8};
		int t=0,j=0;
		for(int i=1;i<arr.length;i++){
            t=arr[i];
            j=i-1;
            while(j>=0&&t<arr[j])
            {
            	arr[j+1]=arr[j];
            	j--;
            }
            	arr[j+1]=t;
            }
	
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
}

}