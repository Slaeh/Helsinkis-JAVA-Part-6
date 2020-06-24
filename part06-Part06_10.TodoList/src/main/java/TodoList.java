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


public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList(){
        
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        for(int i =0; i <list.size(); i++){
            System.out.println(i+1 + ": " + list.get(i));
        }
    }
    public void remove(int number){
        list.remove(list.get(number-1));
    }
}
