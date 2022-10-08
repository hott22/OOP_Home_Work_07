package Dialog;
import java.util.Scanner;

public class SquareDialog implements IDialog {


    @Override
    public double [] showDialog() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a side: ");
        double s = in.nextDouble();
        //in.close();
        return new double[]{s, s, s, s};

    } 
}
