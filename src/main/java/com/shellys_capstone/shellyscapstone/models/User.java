package com.shellys_capstone.shellyscapstone.models;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("deprecation")
public class User {

   @NotNull
   @Size(min= 6, max =10)
   private String username;

   @Email(message = "Please enter a valid email address")
   private String email;

   @NotNull
   @Size(min = 6, message = "Password must be at least 6 characters long")
   private String password;

   @NotNull(message = "Passwords do not match")
   private String verifyPassword;

   public User(String username, String email, String password){
       this.username = username;
       this.email = email;
       this.password = password;

    }
    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    private void checkPassword(){
       if (password != null &&  verifyPassword != null && !password.equals(verifyPassword)){
            verifyPassword = null;
        }
    }
}
