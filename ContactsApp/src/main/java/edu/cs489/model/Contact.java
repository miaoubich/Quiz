package edu.cs489.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
		
	@Expose
	private int contactId;
	@Expose
	private String firstName;
	@Expose
	private String lastName;
	@Expose
	private String company;
	@Expose
	private String jobTitle;
	@Expose
	private List<Phone> addresses;
	@Expose
	private List<Email> emails;
	
	
	
	public void printContacts(List<Contact> contacts) {
   
		//1st way of sorting a collection
		contacts.sort(Comparator.comparing(Contact::getLastName));
		printJson(contacts);
		
		//2nd way
/*		List<Contact> sortedContacts = contacts.stream().sorted((c1, c2) -> c1.getLastName().compareTo(c2.getLastName()))
                .collect(Collectors.toList());
		
       printJson(sortedContacts);
       */ 
        
	}
	
	public void printJson(List<Contact> contacts) {
		Gson gson = new GsonBuilder().setPrettyPrinting()
	            //.excludeFieldsWithoutExposeAnnotation()
	            .create();
        String jsonEmployees = gson.toJson(contacts);
        
        System.out.println("List of Contacts in JSON format:");
        System.out.println(jsonEmployees);
	}
}
