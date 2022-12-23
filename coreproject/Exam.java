package coreproject;

import java.util.Scanner;
import coreproject.Questions;
import java.util.HashMap;
import java.util.Map;

public class Exam {


	public static void main(String[] args) {
		
		Student();
		
	}
	
public static void Student() {
		
		Scanner input= new Scanner(System.in);
		
		String sname=null;
		
		String decide;
		
		int regno;
		
		int ans[]=new int[2];
		
		int roll[]=new int[1];
		
		System.out.println("\n Enter regno:");
		
		regno= input.nextInt();
		
		if(regno==1)
		{
			sname="Jeyasree";
		}
		else if(regno==2)
		{
			sname="Hariharan";
		}
		else if(regno==3)
		{
			sname="Abisha";
		}
		else if(regno==4)
		{
			sname="Jemisha";
		}
		else if(regno==5)
		{
			sname="Kavya";
		}
		else
		{
			System.out.println("Enter valid Register number");
			exit();
			
		}
		
		System.out.println("\n Student name is "+sname+" Register number is "+regno);
		
		roll[0]=regno;
		
		System.out.println("\n Are you ready to start the test");
		
		System.out.println("\n press Y for yes and N for no : ");
		
		decide = input.next();
		
		if(decide.equalsIgnoreCase("Y"))
		{
			
			ans=Logic(roll);
			
			Result(ans);
			
		}
		else//(decide.equalsIgnoreCase("N"))
		{
			exit();
		}
}
public static int[] Logic(int[] roll) {
	
	
	// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	 int correctAnsCount=0;
	 int wrongAnsCount=0;
	 int Regno=roll[0];
	 int res[]=new int[2];
		
		Questions q1=new Questions("\n Number of primitive data types in Java are?", "A. 6", "B. 7", "C. 8", "D. 9");
		Questions q2=new Questions("\n What is the size of float and double in java?","A. 32 and 64",  "B. 32 and 32",  "C. 64 and 32", "D. 64 and 64");
		Questions q3=new Questions("\n Automatic type conversion is possible in which of the possible cases?","A. byte to int",  "B. int to long", "C. long to int", "D. short to int");
		Questions q4=new Questions("\n Select the valid statement?","A. char[] ch = newchar(5)", "B. char[] ch = newchar[5]", "C. char[] ch = newchar()", "D. char[] ch = newchar[]");
		Questions q5=new Questions("\n When an array is passed to a method, what does the method receive?","A. the reference of the array",  "B. a copy of the array", "C. length og the array","D. copy of first element");

		Map<Questions,Character> hmap=new HashMap<>();
		hmap.put(q1,'c');
		hmap.put(q2,'a');
		hmap.put(q3,'b');
		hmap.put(q4,'b');
		hmap.put(q5,'a');
		
		for(Map.Entry<Questions,Character> map:hmap.entrySet())
		{
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			System.out.println("enter your answer:");
			Character ans=input.next().charAt(0);
			int cans=Character.compare(ans, map.getValue());
			if(cans==0)
			{
				correctAnsCount++;
			}
			else
			{
				wrongAnsCount++;
			}
			
			
		}
		
		res[0] = wrongAnsCount;
		res[1] = Regno;
		return res;
		

		}

public int regno;
public int Ans;	
public static void Result(int[] ans){

		
		int totalcount=5,diff;
		int Ans=ans[0];
		int reg=ans[1];
		String sname = null;
		
		if(reg==1)
		{
			sname="Jeyasree";
		}
		else if(reg==2)
		{
			sname="Hariharan";
		}
		else if(reg==3)
		{
			sname="Abisha";
		}
		else if(reg==4)
		{
			sname="Jemisha";
		}
		else if(reg==5)
		{
			sname="Kavya";
		}
		else
		{
			System.out.println("unknown regnumber");
			
		}
		System.out.println("===================================");
		System.out.println();
		System.out.println("\n Student name is : "+sname);
		System.out.println("\n Register number is : "+reg);
		System.out.println("\n\t\t\t\t\t RESULT");
		System.out.println("\n\t\t\t\t============================");
		System.out.println("\n\t\t\t\t Toal Question: "+totalcount);
		diff=totalcount-Ans;
		
		System.out.println("\n\t\t\t\tCorrect Answered Questions:"+diff);
		System.out.println("\n\t\t\t\twrong Answered Questions:"+Ans);
		
		int percentage=(100*diff)/totalcount;
		System.out.println("\n\t\t\t\t percentage :" +percentage);
		if(percentage>95)
		{
			System.out.println("\n\t\t\t\t Performance: Verygood");
			System.out.println("\n\t\t\t\t Grade A");
		}
		else if (percentage<35) 
		{
			System.out.println("\n\t\t\t\t Performance: Verylow");
			System.out.println("\n\t\t\t\t Grade F");
		}
		else 
		{
			System.out.println("\n\t\t\t\t Performance: Medium");
			System.out.println("\n\t\t\t\t Grade B");
		}
		System.out.println("\n\t\t\t\t ============================");
		
		exit();
}

public static void exit() {
	
		System.out.println("thank you!");
		System.exit(0);
}
}




