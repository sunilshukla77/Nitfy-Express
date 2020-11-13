package com.niftyexpress.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "USER_DETAIL")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Indexed
    @Field("FIRST_NAME")
    private String firstName;
    @Field("LAST_NAME")
    private String lastName;
    @Field("GENDER")
    private String gender;
    @Field("USER_NAME")
    private String userName;
    @Field("PASSWORD")
    private String password;
    @Field("EMAIL")
    private String email;
    @Field("DOB")
    private String dateOfBirth;
    @Field("CONTACT_NO")
    private String contactNo;

    //@DBRef
    //@Field("ADDRESS")
    //private AddressEntity address;

    public UserEntity() {
    	
    }
	public UserEntity(String id, String firstName, String lastName, String gender, String userName, String password,
			String email, String dateOfBirth, String contactNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
	}
	
}

