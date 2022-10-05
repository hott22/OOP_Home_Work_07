package Dialog;
import java.util.Scanner;

public class SquareDialog implements IDialog {
    Scanner in;

    @Override
    public Double [] showDialog() {
        System.out.printf("Введите сторону: ");
        double s = in.nextDouble();
        return new Double[]{s, s, s, s};
    } 
}
