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


public class Room {
    private ArrayList<Person> people = new ArrayList<>();
    
    public Room(){
    
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        return(people.isEmpty());
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }
        
        Person shortest = this.people.get(0);
        for(Person i : people){
            if(i.getHeight() < shortest.getHeight()){
                shortest =i;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(people.isEmpty()){
            return null;
        }
        Person i = shortest();
        people.remove(shortest());
        return i;
    }
}