package Controller;

import Figures.FigureFactory;
import Repository.FigureRepository;
import Exception.*;

public class Controller {
    FigureFactory figureCreater;
    FigureRepository figureRepository;

    public Controller(FigureRepository figureRepository, FigureFactory figureCreater){
        this.figureRepository = figureRepository;
        this.figureCreater = figureCreater;
    }

    public void addFigure(int figureType, double[] parameters) throws IncorrectRadiusException, IncorrectSideException {
        figureRepository.add(figureCreater.CreateFigure(figureType,parameters));
    }

    public double[] getPerimeters(){
        return  figureRepository.getPerimeters();
    }

    public double[] getAreas(){
        return  figureRepository.getAreas();
    }

    public double[] getLengths(){
        return figureRepository.getLengths();
    }


}