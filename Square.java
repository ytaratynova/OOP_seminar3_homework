package OOP_seminar3_homework;

public class Square extends Rectangle{

    protected Square(double sideA) throws Exception {
        super(sideA, sideA);
}
    
@Override
public String toString() {
    return "Квадрат, " + "стороны: " + polygonSides + ", " +
            "P = " + perimetr() + ", " +
            "S = " + area();
}
}
