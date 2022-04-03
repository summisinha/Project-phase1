package com.assisted.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWRA {
	public static void main(String[] args)throws IOException
	 {   String path="D:\\";
	 
	 Scanner sc=new Scanner(System.in);
	 char c;
	 do
	 {
	 String mainmenu=("MAIN MENU:\n"+"1.Write file\n"+"2.Append file\n"+"3.Read file\n"+"5.Exit from the application");
     System.out.println(mainmenu);
     
     
    
     int choice;
     Scanner scan=new Scanner(System.in);
     choice=scan.nextInt();
          switch(choice)
          	{      
          case 1:
                Scanner s=new Scanner(System.in);
                ArrayList<String> al=new ArrayList<>();
                while(true) 
                {
             	   System.out.println("enter the file name to create");
             	   String fname=sc.next();
             	   String finalname=path+fname;
             	   System.out.println(finalname);

          //create a file 

             	   File fi=new File(finalname);
             	   boolean b=fi.createNewFile();
             	   if(b!=true)
             	   {
             		   System.out.println("the file not created");
             	   }
             	   else 
             	   {
             		   al.add(fname);
             		   System.out.println("file created");
             	   }

             	   System.out.println("the collection of files is "+ al);
             	   break;
          }
         	 break;
          case 2:	Scanner abc=new Scanner(System.in);
          			System.out.println("enter the file name to be deleted");
          			String filname=abc.next();
          			String finalfile=path+filname;
          			File file=new File(finalfile);
          			file.delete();
          			System.out.println("file deleted");

         	 break;
          case 3:	File fi=new File(path);
          			Scanner scanf=new Scanner(System.in);
          			System.out.println("enter the file name to search");
          			String filsearchname=scanf.next();
          			File filesname[]=fi.listFiles();
          			int flag=0;
          			for(File ff:filesname)
          			{
          				if(ff.getName().equals(filsearchname))
          				{
          					flag=1;
          					break;
          				}
          				else 
          				{
          					flag=0;
          				}
          			}
          			if(flag==1) 
          			{
          				System.out.println("found the file");
          			}
          			else 
          			{
          				System.out.println("file is not found");
          			}
         	 break;
        
          case 4: System.exit(0);
         	 break;
         default:System.out.println("OOPS!!!!!!!WRONG CHOICE");
         	
          

}
System.out.println("Do you want t0 continue(Y/N):");
c=sc.next().charAt(0);
}while(c=='y'||c=='Y');



}
}