// Написать программу на языках Java, в которой идёт со следующими геометрическими фигурами:
// 1.Треугольник
// 2.Квадрат
// 3.Прямоугольник
// 4.Круг
// В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
// 2.Посчитать периметр у всех фигур
// 3.Посчитать площадь у всех фигур
// Для фигуры использовать базовый абстрактный класс фигуры, 
// у которого есть методы посчитать периметр и посчитать площадь фигуры.
// Создать класс-коллекцию фигур В классе-коллекции реализовать методы:
// 1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур, 
// где это возможно,
// 2. добавления новой фигуры,
// 3. удаления фигуры,
// 4. изменения фигуры по ндексу,
// 5. сортировки по площади, вывод информации о всех фигурах.
// При создании фигур необходимо осуществлять проверку входных данных на возможность
// создания данной фигуры и в случае ошибки выдавать соответствующие сообщения. 
// Продумать собствеyную иерархию исключений.

package OOP_seminar3_homework;

public class Program {

    public static void main(String[] args) throws Exception{
        Figures figures = new Figures();
        // добавление фигуры
        System.out.println("Создаем коллекцию из 5 фигур... ");
        System.out.println("________________________________");
        figures.add(new Circle(15.00));
        figures.add(new Square(6.0));
        figures.add(new Triangle(10.0, 10.0, 10.0));
        figures.add(new Triangle(3.0, 4.0, 5.0));
        figures.add(new Rectangle(8.0, 5.0));

        // вывод информации о всех фигурах
        System.out.println("Имеем перечень следующих фигур: ");
        System.out.println("_______________________________");
        figures.printInfo();
        System.out.println();

        // удаление равностороннего треугольника, 31 по счету для пользователя
        figures.remove(3);
        System.out.println("Удаляем треугольник, третий в списке: ");
        System.out.println("______________________________________");
        figures.printInfo();
        System.out.println();

         // вставляем на 3ю для пользователя позицию новый треугольник
        figures.setNewFigure(3, new Triangle(10.0, 10.0, 10.0));
         System.out.println("Вставляем новый треугольник на 3ю позицию: ");
         System.out.println("______________________________________");
         figures.printInfo();
         System.out.println();

          // сортировка по площади
        System.out.println("Сортируем фигуры по площади: ");
        System.out.println("____________________________");
        figures.sortByArea();
        figures.printInfo();
           

    }

    
}