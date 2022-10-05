package Dialog;
import java.util.Scanner;

public class RectangleDialog implements IDialog{
    public Double[] showDialog(){
        Double[] array = new Double[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("First side: ");
        double firstSide = scanner.nextDouble();
        array[0] = firstSide;
        array[2] = firstSide;
        System.out.println(("Second side: "));
        double secondSide = scanner.nextDouble();
        array[1] = secondSide;
        array[3] = secondSide;
        scanner.close();

        return array;
    }
}
