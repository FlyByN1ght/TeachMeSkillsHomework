package NinthHW;

public class Rectangle extends Figure {

    // Длины сторон прямоугольника
    private final double a;
    private final double b;

    /**
     * Конструктор прямоугольника.
     *
     * @param a Длина одной стороны.
     * @param b Длина другой стороны.
     */
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double perimeter() {
        return 2 * (a + b);
    }
}
