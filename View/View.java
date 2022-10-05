package View;

import Controller.Controller;
import Repository.DialogsRepository;

public class View {

    DialogsRepository dialogs;
    Controller controller;


    public View(DialogsRepository dialogs, Controller controller){
        this.dialogs = dialogs;
        this.controller = controller;
    }

    public void printMenu(){
        System.out.println("""
                1 - Add figure
                2 - Remove figure
                3 - Remove figure by index
                4 - Update figure
                5 - View all perimeters
                6 - View all areas
                7 - View all lengths
                8 - Exit""");
    }


}
