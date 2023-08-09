public class Circelr{

    private int result;
    public int diameter(int r){
    	result= 2*r;
    	return result;
    }
    public int area(int r){
        result = 22/7*(r*r);
        return result;
    }
    public int circumfrence(int r){
        result = 2*22/7*r;
        return result;
    }
    public static void main(String[] args) {
    Circelr cobj=new Circelr();
    System.out.println("diameter = "+cobj.diameter(10));
    System.out.println("area = "+cobj.area(10));
    System.out.println("circumfrence = "+cobj.circumfrence(10));	
    }
	
}