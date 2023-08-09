import java.util.*;
import java.io.*;
class COMP{
	public static void main(String[] args)throws Exception {
		Depatrment d=new Depatrment();
	    //EMP e=new EMP("jay","90825389",102);
	    //d.addData(e);
	     //e=new EMP("om","90825389",103);
	    //d.addData(e);
	    d.updateData();
	   
	}
}
class Depatrment{
	public void addData(EMP s)throws Exception
	{
		ArrayList al=readData();
        if(al==null)
        {
        	al=new ArrayList();
        }
        al.add(s);
        FileOutputStream fos=new FileOutputStream("Employee.obj");		
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close(); 
	}
	public void addData(ArrayList al)throws Exception
	{
		 FileOutputStream fos=new FileOutputStream("Employee.obj");		
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close(); 
	}
	public void updateData()throws Exception
	 {  
	 	Scanner sc=new Scanner(System.in);
		System.out.println("enetr ID no");
		int r=sc.nextInt();
		EMP e=serch(r);
		if(e==null)
		{
			System.out.println("data not found");
		}
		else {
			boolean ex=true;
			while(ex){
			System.out.println("press 1[Id]\npress 2[name]\npress 3[mobil]\npress 4[exit]\n  Enter your choice");
		   int n=sc.nextInt();
		   switch(n)
		   {
		   case 1:
		   	   System.out.println("enetr new Id");
		   	   int d=sc.nextInt();
		   	   e.setId(d);
		   	   break;
		   case 2:
		   	   System.out.println("enetr new name");
		   	   String l=sc.next();
		   	   e.setName(l);
		   	   break;
		   case 3:
		   	    System.out.println("enter new mobil");
		   	    String m=sc.next();
		   	    e.setMobil(m);
		   	    break;
		   case 4:
		   	    ex=false;
             }

		}
		ArrayList al=readData();
		int index=al.indexOf(e);
         al.set(index,e);
         addData(al);
        }
     }
	public EMP serch(int IDno)throws Exception{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			EMP e=(EMP)al.get(i);
			if(e.getId()==IDno)
				return e;
		}
		return null;

	}
	public ArrayList readData()throws Exception
	{
		try{
		FileInputStream fis=new FileInputStream("Employee.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList al= (ArrayList)ois.readObject();
		return al;
	}catch(Exception e){
		return null;
	}

	}

}
class EMP implements Serializable{
	public String name,mobil;
	public int id;
	EMP(String name,String mobil,int id)
	{
		this.name=name;
		this.id=id;
		this.mobil=mobil;
	}
	public String toString()
	{
		return "NAME =>"+name+" ID =>"+id+" MOBIL =>"+mobil;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMobil(String mobil)
	{
		this.mobil=mobil;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public String getMobil()
	{
		return mobil;
	}
	public int getId()
	{
		return id;
	}
}