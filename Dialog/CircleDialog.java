package Dialog;

import java.util.Scanner;

public class CircleDialog implements IDialog{

    @Override
    public Double[] showDialog() {
        Double[] array = new Double[1];
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        array[0] = radius;
        scanner.close();

        return array;
    }
}
