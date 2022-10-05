import Figures.Circle;
import Figures.Square;
import Exception.FigureException;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws FigureException {
        System.out.println("Hello, World");
/*        Square square = new Square(5);
        System.out.println(square.area());
        System.out.println(square.perimeter());*/
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.length());


    }
}