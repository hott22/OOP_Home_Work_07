package Dialog;
import java.util.Scanner;

public class TriangleDialog implements IDialog {


@Override
public double[] showDialog() {
    Scanner in = new Scanner(System.in);
   double [] sideArray = new double [3];
   for (int i=0; i<3; i++){
    System.out.printf("%s %d\n", "Enter side ", i+1);
    double s = in.nextDouble();
    sideArray[i] = s;
   }
   //in.close();
   return sideArray; 
}
}