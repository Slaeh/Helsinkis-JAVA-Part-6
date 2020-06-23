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


public class Hold {
    private ArrayList<Suitcase> list = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentWeight =0;
        for(Suitcase i : list){
            currentWeight += i.totalWeight();
        }
        if(suitcase.totalWeight() <= maxWeight - currentWeight)
        list.add(suitcase);
    }
    
    public String toString(){
        int counter=0,weight=0;
        for(Suitcase i : list){
            weight += i.totalWeight();
            counter++;
        }
        return counter + " suitcases " + " (" + weight + " kg)";
    }
    
    public void printItems(){
        for(Suitcase i : list){
            i.printItems();
        }
        
    }
}
