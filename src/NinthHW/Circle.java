package NinthHW;

public class Circle extends Figure {

    // Радиус круга
    private final double R;

    /**
     * Конструктор круга.
     *
     * @param r Радиус круга.
     */
    public Circle(double r) {
        this.R = r;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(R, 2);
    }

    @Override
    double perimeter() {
        double d = R + R;
        return (0.25 * Math.PI * Math.pow(d, 2));
    }
}