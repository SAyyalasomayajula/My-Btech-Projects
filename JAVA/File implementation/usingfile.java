import java.io.*;
import java .lang.*;
import java .util.*;
class usingFile
{
public static void main(String args[])throws IOException
{
String s;
File F=new File("c:/my dir/text.txt");
//System.out.println(s);
s=F.exists()?"File exist":"File does not exist";
System.out.println(s);
File F1=new File("c:/my dir/subdir");
F1.mkdir();
if (F1.isDirectory())
{
System.out.println("Directory name:"+F1.getName());
System.out.println("Directory contents:");
String str[]=F1.list();
if (str.length==0)
System.out.println("Directory is empty");
else
for(int i=0;i<str.length;i++)
System.out.println(str[i]);
}
else
System.out.println(" is not a Directory");
}
}