package OOP_seminar3_homework;

import java.util.ArrayList;
import java.util.Collections;

public class Figures {
    private final ArrayList<Figure> figures = new ArrayList<>();

    public void printInfo(){
        int i = 1;
        for (Figure figure :
                figures) {
            System.out.printf("%d. ", i);
            System.out.println(figure);
            i ++;
        }
    }

    public void add(Figure figure){
        this.figures.add(figure);
    }

    public void remove(int i){
        this.figures.remove(i - 1);
    }

    public void setNewFigure(int i, Figure figure) {
        this.figures.set( i - 1, figure);
    }

    public void sortByArea(){
        Collections.sort(this.figures);
    }

}
