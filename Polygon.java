package OOP_seminar3_homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure {
    List<Double> polygonSides = new ArrayList<>();

    protected Polygon(double... polygonSides) throws Exception{
        for (double side: polygonSides){
            if (side <= 0){
                throw new Exception("Сторона фигуры не может быть отрицательным числом!");
            }
        }
    }
    
    public Double perimetr(){
        Double perimetr = 0.0;
        for (double side: this.polygonSides) {
            perimetr += side;
            
        }
        return perimetr;
    }

    @Override
    public String toString() {
        return "стороны: " + polygonSides + ", " +
                "P = " + perimetr() + ", ";
    }
    
}
