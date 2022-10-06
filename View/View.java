package View;

import Controller.Controller;
import Dialog.*;
import Figures.Rectangle;
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
                2 - View all perimeters
                3 - View all areas
                4 - View all lengths
                5 - Exit""");
    }

    void showPerimeters(){
        for (int i = 0; i < controller.getPerimeters().length; i++) {
            System.out.println(controller.getPerimeters()[i]);
        }
    }

    void showAreas(){
        for (int i = 0; i < controller.getAreas().length; i++) {
            System.out.println(controller.getAreas()[i]);
        }
    }

    void showLengths(){
        for (int i = 0; i < controller.getLengths().length; i++) {
            System.out.println(controller.getLengths()[i]);
        }
    }

    void showDialog(int index){
        switch (index){
            case 1 -> dialogs.getFigures(0);
            case 2 -> dialogs.getFigures(1);
            case 3 -> dialogs.getFigures(2);
            case 4 -> dialogs.getFigures(3);
        }
    }

    void showDialogList(){
        TriangleDialog triangleDialog = new TriangleDialog();
        RectangleDialog rectangleDialog = new RectangleDialog();
        SquareDialog squareDialog = new SquareDialog();
        CircleDialog circleDialog = new CircleDialog();
        dialogs.add(triangleDialog);
        dialogs.add(rectangleDialog);
        dialogs.add(squareDialog);
        dialogs.add(circleDialog);

        System.out.println("""
                Что хочешь создать?
                1 - Треугольник
                2 - Прямоугольник
                3 - Квадрат
                4 - Круг""");
    }

    int chooseAction(){

        return 0;
    }

    int chooseDialog(){

        return 0;
    }





}
