package com.training;
import java.util.Scanner;
public class UserClient {

	public static void main(String[] args) {
		Admin admin = new Admin("Adm101","Anwar","bct@mail.com",true);
		System.out.println(admin);
		//String name = "Ali";
		//User user1 = new User("A101","Ali","abc@mail.com");
		//user1.setUserId("A101");
		//user1.setUserName("Ali");
		//user1.setUserEmail("abc@mail.com");
		//User.organizationName = "OAB";
		//User user2 = new User("A102","Moh","qwc@mail.com");
		//System.out.println("userID:"+user1.getUserId()+
				//" "+"userName:"+user1.getUserName()+
		 		//" "+"organization:"+User.organizationName);

		 // Scanner sc = new Scanner(System.in);

	        // Take input from user
	       // System.out.print("Enter User ID: ");
	        //String userId = sc.nextLine();

	       // System.out.print("Enter User Name: ");
	       // String userName = sc.nextLine();

	       // System.out.print("Enter User Email: ");
	       // String userEmail = sc.nextLine();

	       // User user1 = new User(userId, userName, userEmail);

	        //System.out.println("\n--- User Details ---");
	       // System.out.println("User ID    : " + user1.getUserId());
	        //System.out.println("User Name  : " + user1.getUserName());
	       // System.out.println("User Email : " + user1.getUserEmail());

	       // sc.close();
		  Scanner sc = new Scanner(System.in);

	        System.out.print("How many users do you want to create? ");
	        int count = sc.nextInt();
	        sc.nextLine(); 

	        User[] users = new User[count];
	        for (int i = 0; i < count; i++) {
	            System.out.println("\n--- Enter details for User " + (i + 1) + " ---");
	            System.out.print("Enter User ID: ");
	            String userId = sc.nextLine();
	            System.out.print("Enter User Name: ");
	            String userName = sc.nextLine();
	            System.out.print("Enter User Email: ");
	            String userEmail = sc.nextLine();
	            users[i] = new User(userId, userName, userEmail);
	        }

	        if (count >= 3) {
	            System.out.println("\n--- 3rd User Details ---");
	            System.out.println("User ID    : " + users[2].getUserId());
	            System.out.println("User Name  : " + users[2].getUserName());
	            System.out.println("User Email : " + users[2].getUserEmail());
	        } else {
	            System.out.println("\nNot enough users created to display the 3rd user.");
	        }

	        sc.close();
	}

}
// take input from constructor and create the user object with those values.
// ask user how many user objects they want to create
// create those many user objects values from the user
// display 3rd user detalis

// Arrays : collection of simller data type
// Inheritance: IS A
// Association: HAS A







