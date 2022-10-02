package com.gs.patterns;

public class UserBuilderDemo {

	public static void main(String[] args) {

		// Using getters and setters but here we are unable to achieve immutability. 
		// i.e., even after the user object got created it will be editable.
		UserPojo userPojo = new UserPojo();
		userPojo.setFirstName("Baba");
		userPojo.setLastName("Yaga");
		userPojo.setAge(30);
		userPojo.setPhone("1122334455");
		System.out.println(userPojo);
		
		//We can achieve immutability by using constructor using fields.
		//but here if the number if fields increases the number of constructors also will be increase and will make mess.
		UserTelescoping userTele = new UserTelescoping("Tony", "Stark");
		UserTelescoping userTele1 = new UserTelescoping("Steve", "Rogers", 70);
		UserTelescoping userTele2 = new UserTelescoping("Bruce", "Banner", 68, "1231231231");
		System.out.println(userTele);
		System.out.println(userTele1);
		System.out.println(userTele2);
		
		//If we opt for Builder Pattern we can overcome these two problems by achieving immutability 
		// and reduce constructor declarations
		User.UserBuilder builder = new User.UserBuilder("John", "Wick").age(25).phone("1234512345");
		User user = builder.build();
		System.out.println(user.toString());
	}

}
