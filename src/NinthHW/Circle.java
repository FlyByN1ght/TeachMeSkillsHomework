package NinthHW;

public class Circle extends Figure {

    // Радиус круга
    private final double r;

    /**
     * Конструктор круга.
     *
     * @param r Радиус круга.
     */
    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double perimeter() {
        double d = r + r;
        return (0.25 * Math.PI * Math.pow(d, 2));
    }
}