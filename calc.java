public class Calc{
	private int result;
	public int sum(int num1,int num2){
		result=num1+num2;
		return result;
    }
    public int sub(int num1,int num2){
    	result=num1-num2;
    	return result;
    }
    public int multy(int num1,int num2){
    	result= num1*num2;
    	return result;
    }
    public int div(int num1,int num2){
    	result = num1/num2;
    	return result;
    }
    public int mod(int num1,int num2){
    	result = num1%num2;
    	return result;
    }
    public static void main(String[] args) {
    	Calc cobj=new Calc();
    	System.out.println("sum= "+cobj.sum(10,10));
    	System.out.println("substra= "+cobj.sub(10,10));
    	System.out.println("multy= "+cobj.multy(10,10));
    	System.out.println("divide= "+cobj.div(10,10));
    	System.out.println("module= "+cobj.mod(10,10));
    }

	

}