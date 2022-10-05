package Dialog;
import java.util.Scanner;

public class TriangleDialog implements IDialog {
    Scanner in;

@Override
public Double[] showDialog() {
   Double [] sideArray = new Double [3];
   for (int i=0; i<3; i++){
    System.out.printf("%s %d%n", "Введите сторону ", i+1);
    double s = in.nextDouble();
    sideArray[i] = s;
   }
   in.close();
   return sideArray; 
}
}