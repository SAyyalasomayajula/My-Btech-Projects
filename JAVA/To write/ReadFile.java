import java.io.*;
import java.util.*;
class ReadFile 
{
	public static void main(String[] args)throws IOException
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the file:");
		String file_name=input.nextLine();
		File f=new File(file_name);
		int i;
		boolean wrong=true;
		while(wrong)
		{
			try
			{
				FileReader finp=new FileReader(f);
				LineNumberReader linereader=new LineNumberReader(finp);
				while((i=linereader.read())!=-1)
				{
					System.out.println("Line#:"+(linereader.getLineNumber()+1));
				System.out.println((char)i+linereader.readLine());
				}
			wrong=false;
			}
			catch (FileNotFoundException e)
		{
				System.out.println("File doesnt exists,");
				System.out.println("Enter another filename:");
				file_name=input.nextLine();
				f=new File(file_name);
		}
		catch(IOException e)
		{
			System.out.println("cannot read file:");
		}
			}
}
}
