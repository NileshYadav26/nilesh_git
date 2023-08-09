public class Circel{

    private int result;
    public int diameter(int r){
    	result= 2*r;
    	return result;
    }
    public int area(int r){
        result = 22/7*(r*r);
        return result;
    }
    public static void main(String[] args) {
    Circel cobj=new Circel();
    System.out.println("diameter = "+cobj.diameter(10));
    System.out.println("area = "+cobj.area(10));	
    }
	
}