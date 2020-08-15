
package garuda.hacks.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import garuda.hacks.model.User;


public class DBUserManager {

    private Statement st;

    public DBUserManager(Connection conn) throws SQLException {       
       st = conn.createStatement();   
    }

    // find user by email and password for the login  
    public User loginUser(String email, String password) throws SQLException {       
       String fetch = "select * from MSS.USERS where email ='"+email+"' and password ='"+password+"'";
       
       ResultSet rs = st.executeQuery(fetch);
       
       while (rs.next()) {
           if (rs.getString(1).equals(email) && rs.getString(3).equals(password)) {
               return new User(rs.getString(1), rs.getString(2), rs.getString(3));
           }
       }
       return null;
    }
    
    
    // find user by email
    public User findUser(String email) throws SQLException {
        String fetch = String.format("select * from MSS.USERS where \"%s\"='"+email+"'", "email");
        ResultSet rs = st.executeQuery(fetch);
        
        while (rs.next()) {
            if (rs.getString(1).equals(email)) {
                return new User(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        }
        return null;
    }
    
    
    //Add user to the database   
    public void addUser(String email, String name, String password) throws SQLException {     
        st.execute("INSERT INTO MSS.USERS VALUES ('"+email+"', '"+name+"','"+password+"')");   

    }


//    update a user details in the database   
    public void updateUser(String email, String name, String password) throws SQLException {       
        String fetch = String.format("UPDATE MSS.USERS SET \"%s\"='"+name+"' where \"%s\"='"+email+"'", "name", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE MSS.USERS SET \"%s\"='"+password+"' where \"%s\"='"+email+"'", "password", "email");
        st.execute(fetch);        
    }
    
    public void deleteUser(String email) throws SQLException {
        st.execute(String.format("DELETE FROM ISDUSER.USERS WHERE \"%s\"='"+email+"'", "email"));
    }
    
    public void deleteStaffUser(String email) throws SQLException {
        st.execute("DELETE FROM ISDUSER.USERS WHERE EMAIL = '"+email+"'");
    }




}
