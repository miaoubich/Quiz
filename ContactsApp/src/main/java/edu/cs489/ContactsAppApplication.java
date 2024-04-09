package edu.cs489;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.cs489.model.Phone;
import edu.cs489.model.Contact;
import edu.cs489.model.Email;

@SpringBootApplication
public class ContactsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsAppApplication.class, args);
		
		Phone phone1 = new Phone(1, "256987412", "School");
		Phone phone2 = new Phone(2, "314641259", "Home");
		List<Phone> phoneNumers1 = new ArrayList<>(Arrays.asList(phone1, phone2));
		
		Email email1 = new Email(1, "demo1@email.edu", "School");
		Email email2 = new Email(2, "professionel1@gmail.com", "work");
		List<Email> emails1 = new ArrayList<>(Arrays.asList(email1, email2));
		
		Phone phone3 = new Phone(3, "3698521475", "Work");
		Phone phone4 = new Phone(4, "1478523695", "Home");
		List<Phone> phoneNumbers2 = new ArrayList<>(Arrays.asList(phone3, phone4));
		
		Email email3 = new Email(3, "demo2@email.edu", "School");
		Email email4 = new Email(4, "professionel2@gmail.com", "work");
		List<Email> emails2 = new ArrayList<>(Arrays.asList(email3, email4));
		
		List<Contact> contacts = new ArrayList<>(Arrays.asList(
						new Contact(1, "Ali", "Bouzar", "MIU", "Student", phoneNumers1, emails1),
						new Contact(2, "Elis", "Ben", "Maurer", "Software Engineer", phoneNumbers2, emails2)));
		
		Contact contact = new Contact();
		contact.printContacts(contacts);
		
//		contacts.sort(Comparator.comparing(Contact::getJobTitle));
		
	}

}
