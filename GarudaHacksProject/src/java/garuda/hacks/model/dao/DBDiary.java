/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garuda.hacks.model.dao;
import garuda.hacks.model.Diary;
import java.sql.*;
import java.util.*;

/**
 *
 * @author campf
 */
public class DBDiary {
    
    private Statement st;
    private Connection conn;
    
    public DBDiary(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    
    //find diary from database by date
    
    public Diary findDiary(String date) throws SQLException {
        String fetch = "SELECT * FROM MSS.PRODUCT WHERE DATE='" + date + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while (rs.next()) {
            
            String searchDiaryDate = rs.getString(1);
            
            if (searchDiaryDate.equals(date)) {
                String searchDiaryTitle = rs.getString(2);
                String searchDiaryProblem = rs.getString(3);
                String searchDiarySolution = rs.getString(4);
                
                return new Diary(searchDiaryDate, searchDiaryTitle, searchDiaryProblem, searchDiarySolution);
            }
        }
        //if not found - return null
        return null;
    }
}
