/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heals
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary SimpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary SimpleDictionary){
        this.scanner = scanner;
        this.SimpleDictionary = SimpleDictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command:");
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else{
                if(input.equals("add")){
                    System.out.print("Command:");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    this.SimpleDictionary.add(word,translation);
                    
                }
                else{
                    if(input.equals("search")){
                        System.out.print("To be translated");
                        String findTranslation = scanner.nextLine();
                        String theTranslation = SimpleDictionary.translate(findTranslation);
                        if(theTranslation == null){
                            System.out.println("Word " + findTranslation + " was not found");
                            
                        }else{
                            System.out.println("Translation " + theTranslation);
                        }
                    }
                }
                System.out.println("Unknown command");
            }
        }
    }
}
