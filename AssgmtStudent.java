import java.util.*;
class Student{
	 String name,mobil,className;
	 int fees,rollNo;
	Student(String name,String mobil,String className,int rollNo){
		this.name=name;
		this.mobil=mobil;
		this.className=className;
		this.rollNo=rollNo;
     }
     public void setFees(int fees){
     	this.fees=fees;
     }
     public int getFees(){
     	return fees;
     }
     public void setName(String name){
        this.name=name;
     }
     public void setMobil(String mobil){
        this.mobil=mobil;
     }
     public void setclassName(String className){
        this.className=className;
     }
     public void setRollNo(int rollNo){
        this.rollNo=rollNo;
     }
     public String getName(){
        return name;
     }
     public String getMobil(){
        return mobil;
     }
     public String getclassName(){
        return className;
     }
     public int getrollNo(){
        return rollNo;
     }
     public String toString(){
     	return "Name = "+name+" Mobile = "+mobil+" class = "+className+" RollNo = "+rollNo+" fees "+fees;
     }
}
class School{
     int seat,totalStd;
     Student student[];
     School(){
     	seat=5;
     	totalStd=-1;
     	student=new Student[seat];
     }

     public void newStudent(){
         if(totalStd==seat-1)
         {   seat=seat+5;
              Student []s=new Student[seat]; 
              for(int i=0;i<=totalStd;i++){
                s[i]=student[i];
              }
              student=s;        	
         }
         String n,m,c;
         int r;
         System.out.println(" Roll No");
         r=sc.nextInt();
         sc.nextLin();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enetr the Name");
         n=sc.nextLine();
         System.out.println("Mobil Number");
         m=sc.nextLine();
         System.out.println("class ");
         c=sc.nextLine();
         
         totalStd++;
         Student obj=new Student(n,m,c,r);
         student[totalStd]=obj;

    }
    public void delet(Integer n){
        
        for(int i=0;i<=totalStd;i++){
            if(n.equals(student[i].getrollNo())){
                for(int j=i;j<totalStd;j++){
                    student[j]=student[j+1];
                }
                totalStd--;
            }
        }
    }
 public void update(){
                 
                     System.out.println("enetr rollno");
                     Scanner ob=new Scanner(System.in);
                     Integer n=ob.nextInt();
                     int f=0;
                     for(int i=0;i<=totalStd;i++){
                         if(n.equals(student[i].getrollNo())){
                             while(true){
                             System.out.println("press 1[name]\npress 2[mobil]\npress 3[class]\npress 4[rollno]\npress 5[break]");
                             
                             int w=ob.nextInt();
                             switch(w){
                             case 1:
                                 String p=ob.next();
                                 student[i].setName(p);
                                 break;
                             case 2:
                                   p=ob.next();
                                  student[i].setMobil(p);
                                  break;
                             case 3:
                                   p=ob.next();
                                  student[i].setclassName(p);
                             case 4:
                                   int o=ob.nextInt();
                                   student[i].setRollNo(o);
                             case 5:
                                 f=1;
                                 break;
         
         
                             }
                             if(f==1)
                                 break;
                         }
                         }
                     }
         
             }        
   
    
    public void show(){
    	for(int i=0;i<=totalStd;i++)
    	{
    		System.out.println(student[i]);
    	}
    }
}


public class AssgmtStudent{
	public static void main(String[] args) {
        School obj=new School();
		while(true){
        System.out.println("press 1 [Enetr student] ");
        System.out.println("press 2 [show]");
        System.out.println("press 3 [delet]");
        System.out.println("press 4 [update]");
        System.out.println("press 5 [exit]");
		
			Scanner ob=new Scanner(System.in);
            int n=ob.nextInt(); 
			switch(n){
            case 1:
                
                obj.newStudent();
                break;
            case 2:
                obj.show();
                break;
            case 3:
                int s=ob.nextInt();
                obj.delet(s);
                break;
            case 4:
                System.out.println("kise update karoge bhiya");
                obj.update();
                break;
            case 5:
               System.exit(0);

            }
		}

	}
}