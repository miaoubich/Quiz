package edu.cs489.model;

import com.google.gson.annotations.Expose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	
	@Expose
	private int phoneId;
	@Expose
	private String phoneNumber;
	@Expose
	private String label;
}
