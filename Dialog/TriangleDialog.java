package Dialog;
import java.util.Scanner;

public class TriangleDialog implements IDialog {
    Scanner in;

@Override
public Double[] showDialog() {
   Double [] sideArray = new Double [3];
   for (int i=0; i<3; i++){
    System.out.println (String.format("%s %d", "Введите сторону ", i+1));
    double s = in.nextDouble();
    sideArray[i] = s;
   }
   return sideArray; 
}
}