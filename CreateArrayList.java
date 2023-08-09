import java.io.*;
import java.util.*;
class CreateArrayList{
	public static void main(String[] args) {
	  	 MyArrayList ob=new  MyArrayList(5);
	  	 ob.add(20);
	  	 ob.add(30);
	  	 ob.add(100);
	  	 //ob.add(600);

	  	 MyArrayList ob1=new  MyArrayList(10);
          // ob.clear();
	  	 ob1.add(20);
	  	 ob1.add(30);
	  	 ob1.add(100);
	  	 ob1.add(600);
	  	 System.out.println(ob.retainAll(ob1));
	  	 System.out.println(ob);
	  	 System.out.println(ob1);
	  	 


	  	 //ob.addAtAnyPosition(500,2);
	  	
	  	 //System.out.println( ob.subList(1));
	  	 //System.out.println( ob.subList(1,6));
	  	 //System.out.println(ob.getData(2));
          // System.out.println(obob1.retainAll(ob));

         
	  	}
}
class MyArrayList{
	private int capacity;
	private int size;
	private Object []arr;
	public void setData(Object val,int n)
	{
		//for(int i=size;i>=n-1;i--)
		arr[n-1]=val;
	}
	public Object getData(int n){
		return arr[n-1];
	}
	public int getSize()
	{
		return size+1;
	}
	public MyArrayList(){
		this(5);
	}
	public MyArrayList(int val){
		capacity=val;
		size=-1;
		arr=new Object[capacity];
	}
	//public MyArrayList(Object val)
	//{  this();        
      //add(val);
	//}
	public MyArrayList(MyArrayList val)
	{  this();        
      addAll(val);
	}
	public Object[] myArrayListToArray()
	{
		Object []a=new Object[size+1];
		for(int i=0;i<=size;i++)
		{
			a[i]=arr[i];
		}
		return a;

	}
	public MyArrayList subList(int index)
	{
		MyArrayList ml=new MyArrayList();
		for(int i=index;i<=size;i++)
		{
			ml.add(arr[i]);
		}
		return ml;
	}
    public MyArrayList subList(int n,int k)
    {
    	if(k>size)
    		k=size;
        MyArrayList ml=new MyArrayList();
		for(int i=n;i<=k;i++)
		{
			ml.add(arr[i]);
		}
		return ml;
    }
	

	public void deletAtAnyPos(int n)
	{
		for(int i=n-1;i<size;i++)
		{
			arr[i]=arr[i+1];
        }
        size--;
	}
	
	public String myArrayListToString()
	{
		String s="";
		for(int i=0;i<=size;i++)
		{
			s=s+arr[i];
		}
		return s;
	}

	

	public void sizeIncreas()
	{
		capacity+=5;
		Object []ar=new Object[capacity];
		for(int i=0;i<=size;i++)
		{
			ar[i]=arr[i];
		}
		arr=ar;

	}
	public boolean isEmptyMyArrayList()
	{
		if(size==-1)
			return true;
		return false;
	}
	public MyArrayList cloneMyArrayList(MyArrayList val)
	{
		MyArrayList ma=new MyArrayList();
		for(int i=0;i<=size;i++)
		{
			ma.add(arr[i]);
		}
		return ma;
	}
	public ArrayList retainAll(MyArrayList ml)
	{                           
      int f=0;
		if(vl==null)
		{
			return false;
		}
		else 
		{
			for(int i=0;i<=size;i++)
			{
				if(!(conatian(vl.get(i))))
				{  f=1;
					deletAtAnyPos(i);
				}
			}
		}
		if(f==1)
			return true;
		return false;
	}
	public boolean conatian(Object val){
		System.out.println(indexOf(val));
		return indexOf(val)!=-1;
	}
	public int indexOf(Object val)
	{
		for(int i=0;i<=size;i++)
			if(val.equals(arr[i]))
				return i;
			return -1;
	}
	public Object get(int index)
	{try{
        return arr[index];
	   }catch(Exception e)
	   {
	   	  return null;
	   }
	}
	public void clear()
	{
		/*for(int i=0;i<=size;i++)
		{
			arr[i]=0;
		}*/
		size=-1;
	}
	public void addAtAnyPosition(Object ob,int index) 
	{
		
		
		sizeIncreas();
		size++;
		for(int i=size;i>=index-1;i--)
		{
			arr[i]=arr[i-1];
		}
		setData(ob,index);

	}
	
	public void addAll(MyArrayList val)
	{
          for(int i=0;i<val.size;i++)
          	val.add(val.get(i));

	}
	public boolean conatianAll(MyArrayList vl)                
	{  int f=0;
		if(vl==null)
		{
			return false;
		}
		else 
		{
			for(int i=0;i<=size;i++)
			{
				if(!(conatian(vl.get(i))))
				{  f=1;
					deletAtAnyPos(i);
				}
			}
		}
		if(f==1)
			return true;
		return false;
	}
	public void add(int val)
	{
		if(size==capacity-1)
		{
			sizeIncreas();
		}
		arr[++size]=val;
	}
	public void add(Object val)
	{
		if(size==capacity-1)
		{
			sizeIncreas();
		}
		arr[++size]=val;
	}
	public String toString()
	{
		if(size!=-1){
				String s="";
				for(int i=0;i<=size;i++)
				{
					s=s+","+arr[i];
				}
				return "["+s.substring(1)+"]";}
		else 
			return "[]";
	}
}