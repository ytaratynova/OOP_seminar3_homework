package OOP_seminar3_homework;

public class Triangle extends Polygon {

    protected Triangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        this.polygonSides.add(sideA);
        this.polygonSides.add(sideB);
        this.polygonSides.add(sideC);
        if (!((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideC + sideB) > sideA)) {
            throw new Exception("Треугольника с такими сторонами не существует!");
        }
        
    }

    @Override
    public double area() {
        double halfPerimeter = perimetr() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.polygonSides.get(0)) *
                (halfPerimeter - this.polygonSides.get(1)) * (halfPerimeter - this.polygonSides.get(2)));
    }

    @Override
    public String toString() {
        return "Треугольник, " + super.toString() +
                "S = " + area();
    }
    
}
