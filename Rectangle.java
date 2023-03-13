package OOP_seminar3_homework;

public class Rectangle extends Polygon {

    protected Rectangle(double sideA, double sideB) throws Exception {
        super(sideA, sideB);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);

    }

    @Override
    public double area() {
        return this.polygonSides.get(0)*this.polygonSides.get(1);
    }

    @Override
    public String toString() {
        return "Прямоугольник, " + super.toString() +
                "S = " + area();
    }

    
}
