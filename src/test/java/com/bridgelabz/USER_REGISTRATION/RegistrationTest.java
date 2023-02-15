package com.bridgelabz.USER_REGISTRATION;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegistrationTest {

	 @Before
	    static void Msg(){
	        System.out.println("Welcome to User Registration Problem");
	    }
	    @After
	    public void afterMsg(){
	        System.out.println("Passed");
	    }
	    @Test
	    void given_first_name_should_returnTrue() {
	        UserValidation validation = new UserValidation();
	        Boolean result = validation.checkFirstName("Aditya");
	        Assertions.assertEquals(result, true);
	    }
	}