
package garuda.hacks.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import uts.isd.model.AccessLog;
import uts.isd.model.User;


public class DBUserManager {

    private Statement st;

    public DBUserManager(Connection conn) throws SQLException {       
       st = conn.createStatement();   
    }

    // find user by email and password in the database   
    public User loginUser(String email, String password) throws SQLException {       
       String fetch = String.format("select * from ISDUSER.USERS where \"%s\"='"+email+"' and \"%s\"='"+password+"'", "email", "password");
       
       ResultSet rs = st.executeQuery(fetch);
       
       while (rs.next()) {
           if (rs.getString(1).equals(email) && rs.getString(3).equals(password)) {
               return new User(rs.getString(1), rs.getString(2), rs.getString(3),
                rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7));
           }
       }
       return null;
    }
    
    
    // find user by email
    public User findUser(String email) throws SQLException {
        String fetch = String.format("select * from ISDUSER.USERS where \"%s\"='"+email+"'", "email");
        ResultSet rs = st.executeQuery(fetch);
        
        while (rs.next()) {
            if (rs.getString(1).equals(email)) {
                return new User(rs.getString(1), rs.getString(2), rs.getString(3),
                rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7));
            }
        }
        return null;
    }
    
    // get user type
    public String getType(String email) throws SQLException {
        String fetch = String.format("select * from ISDUSER.USERS where \"%s\"='"+email+"'", "email");
        ResultSet rs = st.executeQuery(fetch);
        
        while (rs.next()) {
            if (rs.getString(1).equals(email)) {
                return rs.getString(7);
            }
        }
        return null;
    }
    
    
    //Add user to the database   
    public void addUser(String email, String name, String password, String gender,
            String phone, String address, String type) throws SQLException {     
        st.execute("INSERT INTO ISDUSER.USERS VALUES ('"+email+"', '"+name+"','"+password+"','"+gender+"','"+phone+"','"+address+"','"+type+"')");   

    }
    
    // add an access log
    public void addLog(String email) throws SQLException {    
        st.execute(String.format("INSERT INTO ISDUSER.ACCESSLOGS (\"%s\", \"%s\") VALUES('"+email+"', CURRENT_TIMESTAMP)", "email", "dateTime")); 
    }
    
    // view all access logs for a user
    public LinkedList<AccessLog> viewLogs(String email) throws SQLException {
        LinkedList<AccessLog> logs = new LinkedList<AccessLog>();
        
        // get all access logs using email
        String fetch = String.format("select * from ISDUSER.ACCESSLOGS where \"%s\"='"+email+"'", "email");
        ResultSet rs = st.executeQuery(fetch);

        while (rs.next()) {
            // add the logs to the list
            logs.add(new AccessLog(rs.getString(1), rs.getString(2), rs.getString(3)));
        }

        // return the list
        return logs;
    }
    

//    update a user details in the database   
    public void updateUser(String email, String name, String password, String phone, String address, String gender, String type) throws SQLException {       
        String fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+name+"' where \"%s\"='"+email+"'", "name", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+password+"' where \"%s\"='"+email+"'", "password", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+phone+"' where \"%s\"='"+email+"'", "phone", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+address+"' where \"%s\"='"+email+"'", "address", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+gender+"' where \"%s\"='"+email+"'", "gender", "email");
        st.execute(fetch);
        fetch = String.format("UPDATE ISDUSER.USERS SET \"%s\"='"+type+"' where \"%s\"='"+email+"'", "type", "email");
        st.execute(fetch);        
    }
    
    public void deleteUser(String email) throws SQLException {
        st.execute(String.format("DELETE FROM ISDUSER.USERS WHERE \"%s\"='"+email+"'", "email"));
    }
    
    public void deleteStaffUser(String email) throws SQLException {
        st.execute("DELETE FROM ISDUSER.USERS WHERE EMAIL = '"+email+"'");
    }



   //user list - Austin
   public ArrayList<User> searchUser(String searchParam)throws SQLException{
        String cond  = "";
        if(searchParam.equals("")){
            cond = "true";
        }
        else cond = "EMAIL LIKE '%"+searchParam+"%' OR NAME LIKE '%"+searchParam+"%' OR PHONE LIKE '%"+searchParam+"%' OR ADDRESS LIKE '%"+searchParam+"%'";
        String fetch = "SELECT * FROM ISDUSER.USERS WHERE " + cond;
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<User> temp = new ArrayList<User>();
            while (rs.next()){
                String email = rs.getString(1);
                String name = rs.getString(2);
                String password = rs.getString(3);
                String gender = rs.getString(4);
                String phone = rs.getString(5);
                String address = rs.getString(6);
                String type = rs.getString(7);
                temp.add(new User(email, name, password, gender, phone, address, type));
            }
        return temp;
    }

}
