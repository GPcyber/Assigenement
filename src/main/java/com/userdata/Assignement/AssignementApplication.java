package com.userdata.Assignement;

import com.userdata.Assignement.model.role;
import com.userdata.Assignement.model.user;
import com.userdata.Assignement.respository.rolerepository;
import com.userdata.Assignement.respository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AssignementApplication {

	public static void main(String[] args) {

		SpringApplication.run(AssignementApplication.class, args);}
		@Component
		class rolecommandliner implements CommandLineRunner {

			@Autowired
			private rolerepository rolerepository;

			@Override
			public void run(String... args) throws Exception {

				role admin = new role();
				admin.setRoletype("1");
				admin.setRolediscription("admin");
				rolerepository.save(admin);

				role support = new role();
				support.setRoletype("2");
				support.setRolediscription("support");
				rolerepository.save(support);

				role user = new role();
				user.setRoletype("3");
				user.setRolediscription("user");
				rolerepository.save(user);
			}
			@Component
			class usercommandliner implements CommandLineRunner {

				@Autowired
				private userrepository userrepository;

				@Override
				public void run(String... args) throws Exception {

					user user1 = new user();
					user1.setRoleid("1");
					user1.setUsername("master");
					user1.setFullname("administrator");
					user1.setPassword("admin");
					//user1.setAddress("adminaddress");
					user1.setActive(true);
					userrepository.save(user1);

					user user2 = new user();
					user2.setRoleid("2");
					user2.setUsername("support");
					user2.setFullname("support");
					user2.setPassword("admin");
					user1.setActive(true);
					//user2.setAddress("support address");
					userrepository.save(user2);

					user user3 = new user();
					user3.setRoleid("3");
					user3.setUsername("user1");
					user3.setFullname("User 1");
					user3.setPassword("user1_123");
					user1.setActive(true);
					//user3.setAddress("user adresss");
					userrepository.save(user3);

				}
			}
		}
	}


