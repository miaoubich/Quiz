package edu.cs489;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.cs489.model.Address;
import edu.cs489.model.Contact;
import edu.cs489.model.Email;

@SpringBootApplication
public class ContactsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsAppApplication.class, args);
		
		Address address1 = new Address(1, "1000 N 4th street, 52556, Iowa", "School");
		Address address2 = new Address(2, "Depolo 5, 20260, Croatia", "Home");
		List<Address> addresses1 = new ArrayList<>(Arrays.asList(address1, address2));
		
		Email email1 = new Email(1, "demo1@email.edu", "School");
		Email email2 = new Email(2, "professionel1@gmail.com", "work");
		List<Email> emails1 = new ArrayList<>(Arrays.asList(email1, email2));
		
		Address address3 = new Address(3, "Split, 20001", "Work");
		Address address4 = new Address(4, "Ulica Zrinka vrankopanska 20015", "Home");
		List<Address> addresses2 = new ArrayList<>(Arrays.asList(address3, address4));
		
		Email email3 = new Email(3, "demo2@email.edu", "School");
		Email email4 = new Email(4, "professionel2@gmail.com", "work");
		List<Email> emails2 = new ArrayList<>(Arrays.asList(email3, email4));
		
		List<Contact> contacts = new ArrayList<>(Arrays.asList(
						new Contact(1, "Ali", "Bouzar", "MIU", "Student", addresses1, emails1),
						new Contact(2, "Elis", "Ben", "Maurer", "Software Engineer", addresses2, emails2)));
		
		Contact contact = new Contact();
		contact.printContacts(contacts);
		
	}

}
