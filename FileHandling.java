import java.io.*;
public  class FileHandling{
	
         public static void fandf(String p)throws Exception
         { 

         	

             File path=new File(p);
             
             if(path.isDirectory())
             {
                  System.out.println(path.getName());
                  System.out.println("v");
                  String file[]=path.list();
                  if(file!=null){
                                    for(String s:file)
                                    {
                                    	File sp=new File(path,s);
                                    	fandf(p+"//"+s);
                                    }}
             }
             else 
             {
             	System.out.println(path+" => file");
             }

         }
    
	public static void main(String[] ar)throws Exception
	{
		fandf("c://java");
		 
	}
}



 /* public static void FileAndFolder(File Directory) {
        File[] files = Directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file + "->FOLDER");
                    System.out.println("------------->FOLDER<-----------------");
                    FileAndFolder(file);
                } else {
                    System.out.println(file + "->FILE");
                }
            }
        }
    }

    public static void main(String[] args) {
        String Path = "c:\\java";
        File DirectoryPath = new File(Path);
        if (DirectoryPath.exists() && DirectoryPath.isDirectory()) {
            FileAndFolder(DirectoryPath);

        } else {
            System.out.println("No Such Folder Exists.");
 
      }
}*/