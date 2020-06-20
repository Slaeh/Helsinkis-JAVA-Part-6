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


public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty(){
        return stack.size()==0;
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String copy = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return copy;
    }
}
