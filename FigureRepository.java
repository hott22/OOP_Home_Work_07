import Figures.Circle;
import Figures.IFigure;
import Figures.Polygon;

import java.util.ArrayList;

public class FigureRepository {

    ArrayList<IFigure> figures;


    public void add(IFigure figure){
        figures.add(figure);
    }

    public void remove(IFigure figure){
        figures.remove(figure);

    }

    public void remove(int index){
        figures.remove(index);
    }

    public ArrayList<IFigure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<IFigure> figures) {
        this.figures = figures;
    }

    public double[] getPerimeters(){
        int count = 0;
        for (IFigure figure : figures) {
            if (!figure.getClass().getSimpleName().equals("Circle")) {
                count++;
            }
        }

        double [] perimeters = new double[count];
        int j = 0;
        for (IFigure figure : figures) {
            if (!figure.getClass().getSimpleName().equals("Circle")) {
                Polygon polygon = (Polygon) figure;
                perimeters[j] = polygon.perimeter();
                j++;
            }
        }
        return perimeters;
    }

    public double[] getAreas(){
        double[] areas = new double[figures.size()];
        for (int i = 0; i < figures.size(); i++) {
            //System.out.println(test.get(i).getClass().getSimpleName());
            areas[i] = figures.get(i).area();
        }
        return areas;
    }

    public double[] getLengths(){
        int count = 0;
        for (IFigure figure : figures) {
            if (figure.getClass().getSimpleName().equals("Circle")) {
                count++;
            }
        }

        double [] lengths = new double[count];
        int j = 0;
        for (IFigure figure : figures) {
            if (figure.getClass().getSimpleName().equals("Circle")) {
                Circle circle = (Circle) figure;
                lengths[j] = circle.length();
                j++;
            }

        }
        return lengths;
    }
}
