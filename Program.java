import Controller.Controller;
import Figures.FigureFactory;
import Repository.DialogsRepository;
import Repository.FigureRepository;
import View.View;
import Exception.*;
public class Program {
    public static void main(String[] args) throws IncorrectRadiusException, IncorrectSideException {
        View view = new View(new DialogsRepository(), new Controller(new FigureRepository(), new FigureFactory()));
        view.fullDialogRep();

        while (true){
            view.printMenu();
            int choice = view.chooseAction("Your choice: ", 5);
            if(choice == 1){
                view.showDialogList();
                int choiceFigure = view.chooseAction("Your choice: ", 4);
                view.showDialog(choiceFigure);
            }
            if(choice == 2){
                view.showPerimeters();
            }
            if(choice == 3){
                view.showAreas();
            }
            if(choice == 4){
                view.showLengths();
            }
            if(choice == 5){
                break;
            }
        }
    }

}
