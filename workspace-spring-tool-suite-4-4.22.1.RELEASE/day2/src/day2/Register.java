package day2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class Register
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		EncapsulationClass person1=new EncapsulationClass();
	
		int arr[] = new int[1];
		ArrayList<EncapsulationClass> arraylist=new ArrayList<>();
		boolean run = true;
		while(run)
		{
			System.out.println("1)Are you a new user");
			System.out.println("2)existing user");
			System.out.println("3)exit");
			System.out.println("4)Show all users");
			System.out.println("Enter the number");
			int option = in.nextInt();
			in.nextLine();
			if (option ==1) 
			{
			
		       System.out.println("Enter your username");
		       String username=in.nextLine();
		       System.out.println("enter your password");
		       String password=in.nextLine();
		       System.out.println("enter your Email");
		       String Email=in.nextLine();
		       System.out.println("enter your Address");
		       String Address=in.nextLine();
		       System.out.println("enter your MobileNumber");
		       long MobileNumber=in.nextLong();
		       Date createAt=new Date();
		       boolean isActive=true;
		       Date updateAt = new Date();
		
		
		
		
		       person1.setUsername(username);
		       person1.setPassword(password);
		       person1.setemail(Email);
		       person1.setaddress(Address);
		       person1.setMobileNumber(MobileNumber);
		       person1.setCreateAt(createAt);
		       person1.setUpdateAt(updateAt);
		       person1.setisActive(isActive);
		       
		       arraylist.add(person1);
 	        }
		    else if (option ==2) {
		    	boolean user = false;
		        System.out.println("Enter Username:");
		        String name = in.next();
		        System.out.println("Enter the password");
		        String passwd = in.next();
		        
		        
		        for(int i=0;i<arraylist.size();i++){
		        	EncapsulationClass userlogin = arraylist.get(i);
		        	if(userlogin.getUsername().equals(name) && userlogin.getPassword().equals(Password)) {
		        		System.out.println("you r logged in");
		        		System.out.println("Your profile");
		        		System.out.println(person1.getUsername());
		        		System.out.println(person1.getPassword());
		        		System.out.println(person1.getemail());
		        		System.out.println(person1.getaddress());
		        		System.out.println(person1.getMobileNumber());
						System.out.println(person1.getCreateAt());
						System.out.println(person1.getupdateAt());
						System.out.println(person1.getIsActive());
						user=true;
						break;
	 	  
		    }
		        }
		        if(!user)
		        {
		        	System.out.println("invalid username and password");
		        }
		    }
		  else if(option == 3)
	      {
		     System.out.println(arraylist);
          }
		  else if(option == 4) {
			  run = false;
		  }
	      else {
	          System.out.println("Invalid Input");
	     }
	     System.out.println("thankyou for coming");
	 }
}}
		


	
