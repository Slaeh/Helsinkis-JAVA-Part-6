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


public class UserInterface {
    private Scanner scanner;
    private JokeManager joker = new JokeManager();
    
    public UserInterface(JokeManager joker, Scanner scanner){
        this.joker = joker;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
        System.out.println("Commands: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
        
        String input = scanner.nextLine();
        if(input.equals("1")){
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            joker.addJoke(joke);
        }else{
            if(input.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(joker.drawJoke());
            }else{
                if(input.equals("3")){
                    System.out.println("Printing the jokes.");
                    joker.printJokes();
                }else{
                    if(input.equals("X")){
                        break;
                    }
                }
            }
        }
    }
    }
}

