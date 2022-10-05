package Dialog;
import java.util.Scanner;

public class SquareDialog implements IDialog {
    Scanner in;

    @Override
    public Double [] showDialog() {
        System.out.print("Введите сторону: ");
        double s = in.nextDouble();
        in.close();
        return new Double[]{s, s, s, s};

    } 
}
