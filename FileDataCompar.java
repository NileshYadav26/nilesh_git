import java.io.*;
class FileDataCompar {

public static void main(String[] args) throws Exception { 
FileReader redear=new FileReader("XYZ.java");
BufferedReader bReader=new BufferedReader(redear);
String  s=bReader.readLine();

// Read /**********************************************************/
FileWriter writer = new FileWriter("Faltu.java");  
BufferedWriter buffer = new BufferedWriter(writer); 
while(s!=null)
{
  FileReader aRead=new FileReader("adc.java");
BufferedReader aReader=new BufferedReader(aRead);
String a=aReader.readLine();
    while(a!=null)
    {
      if(s.equals(a))
      {  
         buffer.write(s); 
         buffer.newLine(); 
    }
      a=aReader.readLine();
 }
   
    s=bReader.readLine();
    }  
     buffer.close();
    System.out.println("sucess");
      }
}
