public class NNturalNumSum{
	private int sum;
	public int sumNatural(int n){
		sum=n*(n+1)/2;
		return sum;
	}
	public int sumNaturaleven(int n){
		sum=n*(n+1);
		return sum;
	}
	public int sumNaturalodd(int n){
		sum=n*n;
		return sum;
	}
	public static void main(String[] args) {
		NNturalNumSum nobj=new NNturalNumSum();
		System.out.println(nobj.sumNatural(10));
		System.out.println(nobj.sumNaturaleven(10));
		System.out.println(nobj.sumNaturalodd(10));
	}
}