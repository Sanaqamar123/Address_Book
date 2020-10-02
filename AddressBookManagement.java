import java.util.*;
import java.util.regex.Pattern;

class AddressBook {
	 Scanner sc = new Scanner(System.in);
	 ArrayList<String> name = new ArrayList<String>();
	//Adding data in array list
	 public String Addition() {
		 System.out.println("Addition : ");
		 boolean flag=false;
		 while(true) {
			 System.out.println("Enter First Name : ");
			 String first=sc.nextLine();
			 String regex1="^[A-Z]{1}[a-z]{2,}";
			//Pattern.matches is used for comparing the data
			 if(Pattern.matches(regex1, first)) {
				 name.add(first);
				 flag=true;
				 break;
			 }
      	   	 else {
      	   		 System.out.println("Incorrect first name");
      	   		 continue;
      	   	 }
		 }

		 while(true) {
			 System.out.println("Enter last Name : ");
		     String last=sc.nextLine();
		     String regex2="^[A-Z]{1}[a-z]{2,}";
		     if(Pattern.matches(regex2, last)) {
		  	     name.add(last);
		  	     flag=true;
		  	     break;
	         }
	      	 else {
	      		  System.out.println("Incorrect last name");
	      		  continue;
	         }
		}

		 while(true) {
			 System.out.println("Enter Street address : ");
		     String address=sc.nextLine();
		     String regex3="((^[A-Z]{1}[a-z]{2,})\\s({1}[A-Z]{1}[a-z]{2,})|(^[A-Z]{1}[a-z]{2,}))";
		     if(Pattern.matches(regex3, address)) {
		  	  	   name.add(address);
		  	  	   flag=true;
		  	  	   break;
	         }
	         else {
	      		  System.out.println("Incorrect street address");
	      		  continue;
	         }
		}

		 while(true) {
			 System.out.println("Enter City name : ");
		     String city=sc.nextLine();
		     String regex4="^(([A-Z]{1}[a-z]{2,}\\s{1}[A-Z]{1}[a-z]{2,})|(^[A-Z]{1}[a-z]{2,}))";
		     if(Pattern.matches(regex4, city)) {
		  	   	   name.add(city);
		  	   	   flag=true;
		  	   	   break;
	         }
	      	 else {
	      		  System.out.println("Incorrect city name");
	      		  continue;
	         }
		}

		 while(true) {
			 System.out.println("Enter State name : ");
		     String state=sc.nextLine();
		     String regex5="^(([A-Z]{1}[a-z]{2,}\\s{1}[A-Z]{1}[a-z]{2,})|(^[A-Z]{1}[a-z]{2,}))";
		     if(Pattern.matches(regex5, state)) {
		  	   	   name.add(state);
		  	   	   flag=true;
		  	   	   break;
	         }
	      	 else {
	      		  System.out.println("Incorrect state name");
	      		  continue;
	         }
			}

		 while(true) {
			 System.out.println("Enter Pin Number(e.g. 843 601) : ");
		     String pinNumber=sc.nextLine();
		     String regex6="^[1-9]{1}[0-9]{2}\\s{1}[0-9]{3}";
		     if(Pattern.matches(regex6, pinNumber)) {
		  	   	   name.add(pinNumber);
		  	   	   flag=true;
		  	   	   break;
	         }
	      	 else {
	      		  System.out.println("Incorrect state name");
	      		  continue;
	      	 }
		}

	      while(true) {
	    	  System.out.println("Enter Phone Number (e.g. 09999977777/+91 9999977777) : ");
	          String phoneNumber=sc.nextLine();
	          String regex="(^([0]|[+]{1}[9]{1}[1]{1})?)\\s{0,1}[6-9]{1}[0-9]{9}";

	          if(Pattern.matches(regex, phoneNumber)) {
	        	   name.add(phoneNumber);
	        	   flag=true;
	        	   break;
	           }
	           else {
	        	   System.out.println("Invalid number");
	        	   continue;
	           }
	      }
		   //name.toString() method is represent the data which is store in arraylist
	           System.out.println(name.toString());
	           return name.toString();

	 }

}

class AddBook extends AddressBook {

	void Updation() {
		System.out.println("Updation : ");
		System.out.println("Enter data which you want to update : ");
	    	String data = sc.nextLine();

		for(int i=0; i<name.size(); i++) {

			//get(i) get the data from arraylist and equalsIgnoreCase() is used to compare arraylist data and the input data and it ignore case of input data
			if(name.get(i).equalsIgnoreCase(data)) {
				System.out.println("Enter new data : ");
				String newData1 = sc.nextLine();
				name.set(i , newData1); //set method is used to replace data
			}
		}

		System.out.println(name.toString());
	}
}
class AddrBook extends AddBook{

	void Deletion() {
		System.out.println("Deletion : ");
		System.out.println("Enter data which you want to delete : ");
		String data1 = sc.nextLine();
		for(int i=0; i<name.size(); i++) {

			if(name.get(i).equalsIgnoreCase(data1)) {
				name.remove(i); //remove method is used to remove data from arraylist
			}
		}
		System.out.println(name.toString());
	}
}
public class AddressBookManagement {

   public static void main(String[] args) {

	Scanner addressInput = new Scanner(System.in);

       System.out.print("How Many Address You Want to Input : \n");
       int n = addressInput.nextInt();

       AddrBook obj = new AddrBook();

       int choice;
       do {
    	   System.out.println("Welcome to Address Book Management System:-");
           System.out.println(" 1. Addtion \n 2. Updation\n 3. Deletion\n 4. Exit \n");
               System.out.println("Select any option :"); choice = addressInput.nextInt();
               switch (choice) {
                   case 1:
                       for (int i = 0; i < n; i++) {
                           obj.Addition();
                       }
                       break;

                   case 2:
                       obj.Updation();
                       break;

                   case 3:
                	   obj.Deletion();
                	   break;

                   case 4:
                       System.out.println("Exit from Address Book");
                       System.out.println("THANK YOU!");
                       break;
               }
           }
           while (choice != 4);
   addressInput.close();
   }
}
