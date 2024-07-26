package day1_basics;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args)  {  
	int a,b,c;
         Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         sc.nextLine();
         String name;
         name=sc.nextLine();
	          c=a+b;
	          System.out.println("addtion = "+c);
	          System.out.println("Trainer Name:"+name); 
}
}
