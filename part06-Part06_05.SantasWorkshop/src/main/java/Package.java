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


public class Package {
    private ArrayList<Gift> list = new ArrayList<>();
    
    public Package (){
    
    }
    
    public void addGift(Gift gift){
        list.add(gift);
    }
    
    public int totalWeight(){
        int i =0;
        for(Gift gift : list){
            i+= gift.getWeight();
        }
        return i;
    }
    
}

