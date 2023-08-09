public class Bubblesort{
public void  
{
	for(int i=arr.length-2;i>0;i--){
		for(int j=0;j<=i;j++){
			if(arr[j]>arr[j+1]){
				int c=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=c;
			}
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
} 
public static void main(String[] args) {
	int arr[]={2,7,64,3,5};
	
}
}