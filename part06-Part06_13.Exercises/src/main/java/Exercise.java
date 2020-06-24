/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
import java.util.ArrayList;

public class Exercise {
    private String name;
    private boolean complete;
    
    public Exercise(String name){
        this.name = name;
        this.complete = false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setCompleted(boolean complete){
        this.complete = complete;
    }
    
    public boolean isCompleted(){
        return this.complete;
    }
}
