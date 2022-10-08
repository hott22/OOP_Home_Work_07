package Figures;
import Exception.*;

public class FigureFactory {

    public IFigure createFigure(int figureType, double [] parameters) {
        switch (figureType) {
            case 1 -> {
                try {
                    return new Triangle(parameters[0], parameters[1], parameters[2]);
                } catch (IncorrectSideException e) {
                    System.out.println("wrong triangle sides");
                }
            }
            case 2 -> {
                try {
                    return new Rectangle(parameters[0], parameters[1]);
                } catch (IncorrectSideException e) {
                    System.out.println("wrong rectangle sides");

                }
            }
            case 3 -> {
                try {
                    return new Square(parameters[0]);
                } catch (IncorrectSideException n) {
                    System.out.println("wrong square sides");
                }
            }
            case 4 -> {
                try {
                    return new Circle(parameters[0]);
                } catch (IncorrectRadiusException e) {
                    System.out.println("wrong circle radius");
                }
            }
        }

        return null;
    }
}