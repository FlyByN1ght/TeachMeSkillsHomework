package NinthHW;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для различных должностей
        IPositionsable director = new Director();
        System.out.println(director.nameOfPositions());

        IPositionsable worker = new Worker();
        System.out.println(worker.nameOfPositions());

        IPositionsable accountant = new Accountant();
        System.out.println(accountant.nameOfPositions());

        // Создаем различные фигуры
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println("Area of a triangle = " + triangle.area() + ", perimeter of a triangle = " + triangle.perimeter());

        Figure rectangle = new Rectangle(7, 8);
        System.out.println("Area of a rectangle = " + rectangle.area() + ", perimeter of a rectangle = " + rectangle.perimeter());

        Figure circle = new Circle(6);
        System.out.println("Area of a circle = " + circle.area() + ", perimeter of a circle = " + circle.perimeter());

        Figure[] arrayFigure = new Figure[3];
        arrayFigure[0] = triangle;
        arrayFigure[1] = rectangle;
        arrayFigure[2] = circle;

        double sumOfPerimeter = 0;

        // Вычисляем сумму периметров для всех фигур в массиве
        for (Figure figure : arrayFigure) {
            sumOfPerimeter += figure.perimeter();
        }

        System.out.println("All figure perimeters sum = " + sumOfPerimeter);  // Здесь исправил на perimeters

        try {
            // Клонируем объект
            Figure triangle2 = (Triangle) triangle.clone();

            // Выводим информацию об обоих объектах
            System.out.println("Original: " + triangle.area() + ", " + triangle.perimeter());
            System.out.println("Clone: " + triangle2.area() + ", " + triangle2.perimeter());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
