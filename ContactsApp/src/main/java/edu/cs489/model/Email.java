package edu.cs489.model;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

	@Expose
	private int emailId;
	@Expose
	private String emailAddress;
	@Expose
	private String label;
}
