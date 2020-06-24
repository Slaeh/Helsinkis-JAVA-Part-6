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
    private Scanner reader;
    private TodoList newList;
    
    public UserInterface(TodoList newList, Scanner reader){
        this.reader = reader;
        this.newList = newList;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = reader.nextLine();
            if(command.equals("stop")){
                break;
            }else{
                if(command.equals("add")){
                    System.out.print("To add: ");
                    String adder = reader.nextLine();
                    newList.add(adder);
                }else{
                    if(command.equals("list")){
                        newList.print();
                    }else{
                        if(command.equals("remove")){
                            System.out.print("Which one is removed? ");
                            int removeThis = Integer.parseInt(reader.nextLine());
                            newList.remove(removeThis);
                        }
                    }
                }
            }
        }
    }
}
