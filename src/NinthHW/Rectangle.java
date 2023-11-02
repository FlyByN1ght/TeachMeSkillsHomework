package NinthHW;

public class Rectangle extends Figure {

    // Длины сторон прямоугольника
    private final double A;
    private final double B;

    /**
     * Конструктор прямоугольника.
     *
     * @param a Длина одной стороны.
     * @param b Длина другой стороны.
     */
    public Rectangle(double a, double b) {
        this.A = a;
        this.B = b;
    }

    @Override
    double area() {
        return A * B;
    }

    @Override
    double perimeter() {
        return 2 * (A + B);
    }
}
