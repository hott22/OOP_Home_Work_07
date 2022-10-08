package View;

import Controller.Controller;
import Dialog.*;
import Repository.DialogsRepository;
import Exception.*;
import java.util.Scanner;

public class View {

    DialogsRepository dialogRep;
    Controller controller;



    public View(DialogsRepository dialogs, Controller controller){
        this.dialogRep = dialogs;
        this.controller = controller;
    }

    public void printMenu(){
        System.out.println("""
                1 - Add figure
                2 - View all perimeters
                3 - View all areas
                4 - View all lengths
                5 - Exit\s""");
    }

    public void showPerimeters(){
        if(controller.getPerimeters().length == 0){
            System.out.println("Figure-list has no polygons");
        }
        for (int i = 0; i < controller.getPerimeters().length; i++) {
            System.out.println(controller.getPerimeters()[i]);
        }
    }

    public void showAreas(){
        if(controller.getAreas().length == 0){
            System.out.println("Figure-list is empty");
        }
        for (int i = 0; i < controller.getAreas().length; i++) {
            System.out.println(controller.getAreas()[i]);
        }
    }

    public void showLengths(){
        if(controller.getLengths().length == 0){
            System.out.println("Figure-list has no circles");
        }
        for (int i = 0; i < controller.getLengths().length; i++) {
            System.out.println(controller.getLengths()[i]);
        }
    }

    public void showDialog(int index) throws IncorrectRadiusException, IncorrectSideException {
        switch (index){
            case 1 -> controller.addFigure(1, dialogRep.getFigures(0).showDialog());
            case 2 -> controller.addFigure(2, dialogRep.getFigures(1).showDialog());
            case 3 -> controller.addFigure(3, dialogRep.getFigures(2).showDialog());
            case 4 -> controller.addFigure(4, dialogRep.getFigures(3).showDialog());

        }
    }

    public void showDialogList(){
        System.out.println("""
                What do you want to create?
                1 - Triangle
                2 - Rectangle
                3 - Square
                4 - Circle""");
    }

    public int chooseAction(String title, int choice){
        System.out.printf("%s", title);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number > choice || number < 1){
            System.out.printf("Enter no less than 1 and no more than %d\n", choice);
            number = scanner.nextInt();
        }
        //scanner.close();
        return number;

    }

    public void fullDialogRep(){
        dialogRep.add(new TriangleDialog());
        dialogRep.add(new RectangleDialog());
        dialogRep.add(new SquareDialog());
        dialogRep.add(new CircleDialog());
    }





}
