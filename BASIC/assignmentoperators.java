package assignment;

import java.util.Scanner;

//Write a program to divide, multiply, subtract and addition of two numbers 

public class assignmentoperators {
	public static void main(String args[]) {
		
	float a,b,result=0;
	Scanner i =new Scanner(System.in);
  System.out.println("ENTER THE VALUES OF A AND B=");
   a=i.nextFloat();
   b=i.nextFloat();
  System.out.println("ENTER THE OPERATOR WHICH U WANT TO PERFORM{+ - * / *}=");
  char op=i.next().charAt(0);
  
  switch(op)
  {
  case '+': 
	  result=a+b;
	  break;
  case '-': 
	  result=a-b;
	  break;
  case '*': 
	  result=a*b;
	  break;
  case '/': 
	  result=a/b;
	  break;
  case '%': 
	  result=a%b;
	  break;
  default:
		  System.out.println("incorrect operator entered!!!!");
	  
  }
  if(result!=0)
  System.out.println("RESULT IS="+result);
  else 
	  System.out.println("RESULT="+result);
}
}
