package com.example.multidbinstance.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	private String id;
	
	private String firstName;
	
	private String lastName;
}
