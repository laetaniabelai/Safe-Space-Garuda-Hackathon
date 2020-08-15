package garuda.hacks.controller;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.servlet.http.HttpSession;

public class Validator implements Serializable {
   // generic, common patterns
   private String singleStringPattern = "?";
   private String singleIntPattern = "?";
   
   // online-user-access-specific management patterns
   private String emailPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";
   private String namePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";
   private String passwordPattern = "[a-z0-9]{4,}";
   private String phonePattern = "0([0-9]+)";


   public Validator() {
   }
   
   public boolean validate(String pattern, String input) {
      Pattern regEx = Pattern.compile(pattern);
      Matcher match = regEx.matcher(input);
      return match.matches();
   }
   
   public boolean validateInteger(String pattern, int input) {
      Pattern regEx = Pattern.compile(pattern);
      Matcher match = regEx.matcher(input+"");
      return match.matches();
   }

   // commonly used validators

   // validator - needs to be a valid single string
   public boolean validateSingleString(String string) {
//      return validate(passwordPattern, string);
        return true; // testing purpose
   }

   // validator - needs to be valid single int
   public boolean validateSingleInt(String number) {
//      return validate(namePattern, number);
        return true; // testing purpose
   }


   // customer validator - needs to have @ sign
   public boolean validateEmail(String email) {
      return validate(emailPattern, email);
   }


   public boolean validatePassword(String password) {
      return validate(passwordPattern, password);
   }


   public void clear(HttpSession session) {
      session.setAttribute("emailErr", "Enter email");
      session.setAttribute("passErr", "Enter password");
      session.setAttribute("existErr", "");
      session.setAttribute("nameErr", "Enter name");
        
   }
}