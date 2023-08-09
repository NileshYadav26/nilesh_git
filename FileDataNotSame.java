import java.io.*;
class FileDataNotSame {
public static void filedatanotsame1() throws Exception{
FileReader redear=new FileReader("XYZ.java");
BufferedReader bReader=new BufferedReader(redear);
// Read /**********************************************************/
String  s=bReader.readLine();
FileWriter writer = new FileWriter("Faltu.java");  
BufferedWriter buffer = new BufferedWriter(writer); 
int counter=0;
int f=0;
int g=0;
while(s!=null)
{  counter++;
  FileReader aRead=new FileReader("adc.java");
BufferedReader aReader=new BufferedReader(aRead);
String a=aReader.readLine();
   f=0;
      while(a!=null)
    {   
      if(s.equals(a))
      {  g=1;
         f=1;  
    }
      a=aReader.readLine();
    }if(f==0)
      {buffer.write(s);
            buffer.newLine();}
   
    s=bReader.readLine();
       
    } 


     
     buffer.close();
    System.out.println("sucess");
    
}
public static void filedatanotsame2() throws Exception{
FileReader redear=new FileReader("adc.java");
BufferedReader bReader=new BufferedReader(redear);
// Read /**********************************************************/
String  s=bReader.readLine();
FileWriter writer = new FileWriter("Faltu.java",true);  
BufferedWriter buffer = new BufferedWriter(writer); 
int counter=0;
int f=0;
int g=0;
while(s!=null)
{  counter++;
  FileReader aRead=new FileReader("XYZ.java");
BufferedReader aReader=new BufferedReader(aRead);
String a=aReader.readLine();
   f=0;
      while(a!=null)
    {   
      if(s.equals(a))
      {  g=1;
         f=1;  
    }
      a=aReader.readLine();
    }if(f==0)
      {buffer.write(s);
            buffer.newLine();}
   
    s=bReader.readLine();
       
    } 


     
     buffer.close();
    System.out.println("sucess");
    
}
public static void main(String[] args) throws Exception { 
filedatanotsame1();
filedatanotsame2();
      }
}
