
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int counter;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.counter =0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.counter++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String collect = "";
        
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String numbers;
        if(elements.size() <=1){
            numbers = "element"; 
        }else{
            numbers = "elements";
        }
        if(numbers.equals("element")){
            for(String i : elements){
                collect += i;
            }
        }
        if(numbers.equals("elements")){
            for(String i : elements){
                collect += i + "\n";
            }
        }    
        
        return ("The collection " + this.name + " has " + counter + " " + numbers + ":" + "\n") + collect;
    }
    
}
