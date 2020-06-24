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
import java.util.Random;


public class JokeManager {
    private ArrayList<String> joker;
    
    public JokeManager(){
        this.joker = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        joker.add(joke);
    }
    
    public String drawJoke(){
        if(joker.isEmpty()){
            String nothing = "Jokes are in short supply.";
            return nothing;
        }else{
            Random draw = new Random(); 
            int nextDraw = draw.nextInt(joker.size());
            return joker.get(nextDraw);
        }
    }
    
    public void printJokes(){
        
        for(String jokes : joker){
            System.out.println(jokes);
        }
    }
}
