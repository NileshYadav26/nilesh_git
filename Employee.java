import java.util.*;
class Empobiodata{
	public String name,mobil,address,post;
	public int salary,idNo;
	Empobiodata(String n,String m,String a,String p,int s,int i){
		name=n;
		mobil=m;
		address=a;
		post=p;
		salary=s;
		idNo=i;
    }
    public int  getIdNo(){
    	return idNo;
    }
    public void setIdno(int n)
    {
    	idNo=n;
    }
    public void setName(String n){
    	name=n;
    }

    public void setPost(String p){
    	post=p;
    }

    public void setMobil(String n){
    	mobil=n;
    }

    public void setAdd(String n){
    	address=n;
    }
    public void setSalary(int n){
    	salary=n;
    }
	public String toString()
	{
		return "Id no"+idNo+"Name "+name+"Mobil "+mobil+"Address "+address+"salary "+salary+"post "+post;
	}
}
class NewEmployee{
	int seat,totalEmp;
	Empobiodata []emp;
	NewEmployee(){
		seat=2;
	totalEmp=-1;
		emp=new Empobiodata[seat];
	} 
	Scanner sc=new Scanner(System.in);
	public void newEmployee(){
		int sa,id;
		String na,mo,add,po;
		
		
		System.out.println("Enetr idno");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enetr Name");
        na=sc.nextLine();
        System.out.println("Enetr Mobil Number");
        mo=sc.nextLine();
        System.out.println("Address ");
        add=sc.nextLine();
        System.out.println("Enetr post");
        po=sc.nextLine();
        System.out.println("Enetr Salary ");
		sa=sc.nextInt();
        totalEmp++;
        Empobiodata ob=new Empobiodata(na,mo,add,po,sa,id);
        emp[totalEmp]=ob; 
   }
   public int chekId(int n){
   	for(int i=0;i<=totalEmp;i++)
   {
   	if(emp[i].getIdNo()==n){
   		return i;
   	}
   	
   }
   return -1;
   }
   public void delet(){
   	System.out.println("Enetr those empoyee id");
      int r=sc.nextInt();
      int n=chekId(r);
      if(n!=-1){
         for(int i=n;i<=totalEmp;i++){
         	emp[i]=emp[i+1];
         }
         totalEmp--;
      }
      else{
      	System.out.println("not exixt");
      }
   }
   public void update(){
   	System.out.println("which employee id you want to update  Eneter id No");
   	int r=sc.nextInt();
   	int f=0;
   	int p=chekId(r);

   	if(p!=-1){
         while(true){
         	System.out.println("1 Name");
         	System.out.println("2 number");
         	System.out.println("3 Address");
         	System.out.println("4 post\n"+"5 salary\n"+"6 id\n"+"7 break");
         	System.out.println("enetr your choise");
         	int j=sc.nextInt();
         	switch(j){
         	case 1:
         		System.out.println("enetr new name");
         		String s=sc.next();
         		emp[p].setName(s);
         		break;
         	case 2:
         		System.out.println("Enetr number");
         		s=sc.nextLine() ;
         		emp[p].setMobil(s);
         		break;
         	case 3:
         		System.out.println("enetr adDress");
         		 s=sc.nextLine();
         		 emp[p].setAdd(s);
         		 break;
         	case 4:
         		System.out.println("enetr post");
         		s=sc.nextLine();
         		emp[p].setPost(s);
         		break;
         	case 5:
         		System.out.println("enetr a seley");
         		int n=sc.nextInt();
         		emp[p].setSalary(n);
         		break;
         	case 6:
         		System.out.println("enetr id");
         		n=sc.nextInt();
         		emp[p].setIdno(n);
         		break;
         	case 7:
         		 f=1;
         		 break;

         	}
         	if(f==1)
         		break;

         }
   	}
   	else{
   		System.out.println("not exixst");
   	}
   	
   }
  public void show(){
  	for(int i=0;i<=totalEmp;i++)
  	{
  		System.out.println(emp[i]);
  	}
  }

}

public class Employee{
	public static void main(String[] args) {
	  NewEmployee ob=new NewEmployee();
	  Scanner k=new Scanner(System.in);
	  while(true){
	  	System.out.println("1=creat\n"+"2=delet\n"+"3=update\n"+"4=show\n"+"5=exit");
        int n=k.nextInt();
        switch(n){
        case 1:
           ob.newEmployee();
	       break;
	    case 2:
	       ob.delet();
	       break;
	    case 3: 
	       ob.update();
	       break;
	    case 4:
	       ob.show();
	       break;
	    case 5:
	    	System.exit(0);
	}
	}
	}
}