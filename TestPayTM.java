import java.util.*;

import java.io.*;


interface PayTM
{
	
		 void recharge(long mob,int amt);
		 void denominations();
		 void balEnquiry();
			}
			
			
class InvalidAmountException extends Exception
{

public  InvalidAmountException(String s)
{
super(s);
}
}
public class TestPayTM
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		TestImplementation t=new TestImplementation();
		Airtel a1=new Airtel();
		Vodafone v1=new Vodafone();
		Idea i =new Idea();
		Jio j=new Jio();
		int t1 =s.nextInt();
		
		switch(t1)
		{
			case 1:
			  t.pa(a1);
			  break;
			
			
			case 2:
			 t.pa(v1);
			  break;
			case 3:
			 t.pa(i);
			  break;
			case 4:
			 t.pa(j);
			  break;
			  default:
			  break;
		}
			}
	}			
			
			
		class Airtel implements PayTM {
				int amount1=0;
				public void recharge(long mob,int amt)
				 {
					 	amount1=amt;
					 long t2=0,t1=0;
					 while(mob!=0)
					 {
						 t1=mob%10;
						 mob=mob/10;
						 t2++;
					 }
					 if(t2==10)
					 { 
				 denominations();
					 }
					 else
					 {
						 System.out.println("mobile number is not 10 digit") ;
					 }
				 }
				 
				 	 public void denominations()
				 {
					 try
					 {
					 if(amount1>10&&amount1<500)
					 {
						System.out.println("RECHARGE IS SUCCESSFUL");
						balEnquiry();
					 }
					 else
					 throw new InvalidAmountException("Invalid Amount"); 
								 
					 }
				  catch(InvalidAmountException e) 
        { 
            System.out.println(e.getMessage()); 
        
        } 
				 
			}
			
			public void balEnquiry()
			{
			System.out.print("recharge of"+" ");
			System.out.print(amount1);
			
			}
			}
			
			 class Vodafone implements PayTM {				
				
			int amount1=0;
				public void recharge(long mob,int amt)
				 {
					 	 amount1=amt;
					 long t2=0,t1=0;
					 while(mob!=0)
					 {
						 t1=mob%10;
						 mob=mob/10;
						 t2++;
					 }
					  if(t2==10)
					 { 
				 denominations();
					 }
					 else
					 {
						 System.out.println("mobile number is not 10 digit") ;
					 }
				 }
				 
				 	 public void denominations()
				 {
					 try
					 {
					 if(amount1>10&&amount1<500)
					 {
						System.out.println("RECHARGE IS SUCCESSFUL");
						balEnquiry();
					 }
					 else
					 throw new InvalidAmountException("Invalid Amount"); 
								 
					 }
				  catch(InvalidAmountException e) 
        { 
            System.out.println(e.getMessage()); 
        
        } 
				 
			}
			
			public void balEnquiry()
			{
				
				System.out.print("recharge of"+" ");
			System.out.print(amount1);
			
			}
				 
			}
	
		
			class Idea implements PayTM 
			{
				
				int amount1=0;
				public void recharge(long mob,int amt)
				 {	 amount1=amt;
					 long t2=0,t1=0;
					 while(mob!=0)
					 {
						 t1=mob%10;
						 mob=mob/10;
						 t2++;
					 }
					 if(t2==10)
					 { 
				 denominations();
					 }
					 else
					 {
						 System.out.println("mobile number is not 10 digit") ;
					 }
				 }
				 
				 	 public void denominations()
				 {
					 try
					 {
					 if(amount1>10&&amount1<500)
					 {
						System.out.println("RECHARGE IS SUCCESSFUL");
						balEnquiry();
					 }
					 else
					 throw new InvalidAmountException("Invalid Amount"); 
								 
					 }
				  catch(InvalidAmountException e) 
        { 
            System.out.println(e.getMessage()); 
        
        } 
				 
			}
			
			public void balEnquiry()
			{
				
		System.out.print("recharge of"+" ");
			System.out.print(amount1);
			
			}
	
			}
		class Jio implements PayTM
			{
			int amount1=0;
				public void recharge(long mob,int amt)
				 {
					 amount1=amt;
					 long t2=0,t1=0;
					 while(mob!=0)
					 {
						 t1=mob%10;
						 mob=mob/10;
						 t2++;
					 }
		 if(t2==10)
					 { 
				 denominations();
					 }
					 else
					 {
						 System.out.println("mobile number is not 10 digit") ;
					 }
				 }
				 
				 	 public void denominations()
				 {
					 try
					 {
					 if(amount1>10&&amount1<500)
					 {
						System.out.println("RECHARGE IS SUCCESSFUL");
						balEnquiry();
					 }
					 else
					 throw new InvalidAmountException("Invalid Amount"); 
								 
					 }
				  catch(InvalidAmountException e) 
        { 
            System.out.println(e.getMessage()); 
        
        } 
				 
			}
			
			public void balEnquiry()
			{
				System.out.print("recharge of"+" ");
			System.out.print(amount1);
				
			
			}
		
			}
			
			
		 class TestImplementation 
			{
			
			
				
				 void pa(PayTM a1)
				{
					Scanner s1=new Scanner(System.in);
						long mob=s1.nextLong();
							int amt =s1.nextInt();
					a1.recharge(mob,amt);
				}
				
			}
			
			