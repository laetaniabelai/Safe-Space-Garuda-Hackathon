/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garuda.hacks.model;
import java.io.Serializable;

/**
 *
 * @author campf
 */
public class Diary {
    private String date;
    private String title;
    private String description;
    private String solution;

    public Diary(String date, String title, String description, String solution) {
        this.date = date;
        this.title = title;
        this.description = description;
        this.solution = solution;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
    
    
}
