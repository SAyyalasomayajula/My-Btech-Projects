import java.lang.*;
import java.io.*;
import java.util.*;
class sort2
{
	public static void main(String[] args) 
	{ 
		String Names[]={"Shanu","Sam","Tinku","Sue","Manu"};
		int n= Names.length;
		String temp= new String();
		System.out.println("Original list is:");
		for (int i=0;i<n;i++)
		{
		System.out.println(""+Names[i]);
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++ )
			{
				if(Names[i].compareTo(Names[j])>0)
				{
					temp=Names[i];
					Names[i]=Names[j];
					Names[j]=temp;
				}
			}
		}
		System.out.println("Sorted list is:");
		for (int i=0;i<n;i++)
		{
		System.out.println(""+Names[i]);
		}
		
	}
}
