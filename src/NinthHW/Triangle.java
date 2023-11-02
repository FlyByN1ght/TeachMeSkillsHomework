package NinthHW;

/**
 * Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
 *
 * @author Даниил
 * version 1.0
 */

public class Triangle extends Figure implements Cloneable {

    // Длины сторон треугольника
    private final double A;
    private final double B;
    private final double C;

    /**
     * Конструктор треугольника.
     *
     * @param a Длина первой стороны.
     * @param b Длина второй стороны.
     * @param c Длина третьей стороны.
     */
    public Triangle(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    @Override
    double area() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    double perimeter() {
        return (A + B + C);
    }

    /**
     * Метод клонирования треугольника.
     *
     * @return Клон треугольника.
     * @throws CloneNotSupportedException Исключение, если клонирование не поддерживается.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}