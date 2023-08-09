import java.io.*;
class BufferRW {

public static void main(String[] args) throws Exception { 
FileReader redear=new FileReader("XYZ.java");
BufferedReader bReader=new BufferedReader(redear);
String  s=bReader.readLine();
FileWriter writer = new FileWriter("Faltu.java",true);  
BufferedWriter buffer = new BufferedWriter(writer); 
while(s!=null)
{
    
     
    buffer.write(s);  
   s=bReader.readLine();
   buffer.newLine();
  //System.out.println("");
    }  
     buffer.close();
    System.out.println("sucess");
      }
}
