package Testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class loginpage {
    
    @Test
    @Parameters({"username", "password"})
    public void test(@Optional("admin") String user,@Optional("admin@123") String pass) 
    { 
    	
        System.out.println("Testing login with:");
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);
        
        // Actual login validation logic
        if(user.equals("admin") && pass.equals("admin@123")) {
            System.out.println("Successfully logged in");
            assertTrue(true, "Valid credentials should login successfully");
        } else {
            System.out.println("Login failed");
            assertFalse(user.equals("admin") && pass.equals("admin@123"), 
                      "Invalid credentials should fail login");
        }
    }
}