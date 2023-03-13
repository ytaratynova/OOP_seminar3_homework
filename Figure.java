package OOP_seminar3_homework;

public abstract class Figure implements Comparable<Figure>{
    
    public abstract double area();

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());
    }
    
    
    

    
}
