import java.io.*;  
public class Example5{    

public static void main(String args[])throws Exception{    

     FileOutputStream fout=new FileOutputStream("text3.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="My name is Bishnu limbu";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  
