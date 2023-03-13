package OOP_seminar3_homework;

public class Circle extends Figure implements Circumference {
    protected Double radius;

    public Circle(Double radius) throws Exception{
        this.radius = radius;
        if (radius <=0){
            throw new Exception("Круга с такими радиусом не существует!");
        }
      
        
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radius, 2.0);
    }

    @Override
    public double circumference() {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public String toString() {
        return "Круг, радиус - " + this.radius  + ", длина окружности = " + circumference() + 
                ", S = " +  area() + ";" ;
    }
}
