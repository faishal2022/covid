import java.io.*;
 final class Customer{

    String name;
    long mob;

    void get_data() throws Exception{

		System.out.println("Enter Customer name");
		InputStreamReader d= new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(d);
		name =in.readLine();
		System.out.println("Enter mobile number");
		mob= Long.parseLong(in.readLine());
              
               
	}
 	 void dis_data() throws Exception{

		System.out.println("Customer name:"+name);
	        System.out.println("customer mob:"+mob);
        }
              
}
 class Student extends Customer {
	String address,course;
	String email;
	
      
       void get_data() throws Exception{
		super.get_data();

		System.out.println("Enter address");

		InputStreamReader d= new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(d);
		address =in.readLine();
		System.out.println("Enter email");
		email=in.readLine();
		System.out.println("Enter course");
		course=in.readLine();
       } 
        void dis_data() throws Exception{

		System.out.println("student address:"+address);
	        System.out.println("student email:"+email);
		System.out.println("student course:"+course);
        }

}

class CSE{
	public static void main(String args[])throws Exception
	{
	int choice;
	InputStreamReader d= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(d);
        System.out.println("press 1 for enquiry press 2 for enrollment");
	choice=Integer.parseInt(in.readLine());
	if(choice==1){
		Customer C=new Customer();
		C.get_data();
		C.dis_data();
	
	}
	else if(choice==2){
		Student S=new Student();
		
		S.get_data();
		S.dis_data();	
	}
	}

     
}