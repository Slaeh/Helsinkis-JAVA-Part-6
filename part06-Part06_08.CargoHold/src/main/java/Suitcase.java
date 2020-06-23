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

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        
    }
    
    public void addItem(Item item){
        if(item.getWeight()+ totalWeight() <= maxWeight)
        items.add(item);
        
    }
    
    public String toString(){
        int weight =0;
        for(Item i : items){
            weight += i.getWeight();
        }
        if(weight ==0 && items.size() ==0){
            return "no items " + "(" + weight + "kg)";
        }
        if(items.size() ==1){
            return  "1 item: " + "(" + weight + "kg)";
        }
        
        return this.items.size() + " items: " + "(" + weight + "kg)";
    }
    
    public void printItems(){
        for(Item i : items){
            System.out.println(i);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item i : items){
            weight += i.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()) return null;
        Item heaviest = this.items.get(0);
        for(Item i : items){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
