import Figures.Circle;
import Figures.IFigure;
import Exception.IncorrectRadiusException;
import Exception.IncorrectSideException;
import Figures.Polygon;
import Figures.Square;

import java.util.ArrayList;

public class tast {
    public static void main(String[] args) throws IncorrectRadiusException, IncorrectSideException {
        ArrayList<IFigure> test = new ArrayList<>();
        Circle circle = new Circle(4);
        Square square = new Square(3);
        test.add(circle);
        test.add(square);
        //System.out.println(square.perimeter());
        //test.get(1).getClass().getSimpleName();
        //System.out.println();


        int count = 0;
        for (IFigure figure : test) {
            if (!figure.getClass().getSimpleName().equals("Circle")) {
                count++;
            }
        }
        double [] perimeters = new double[count];
        int j = 0;

        for (int i = 0; i < test.size(); i++) {
                if(!test.get(i).getClass().getSimpleName().equals("Circle")){
                    Polygon polygon = (Polygon) test.get(i);
                    perimeters[j] = polygon.perimeter();
                    j ++;
                }
            }




            //System.out.println(test.get(i).area());

        }
    }

