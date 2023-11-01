package NinthHW;

/**
 * Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
 *
 * @author Даниил
 * version 1.0
 */

public class Triangle extends Figure implements Cloneable {

    // Длины сторон треугольника
    private final double a;
    private final double b;
    private final double c;

    /**
     * Конструктор треугольника.
     *
     * @param a Длина первой стороны.
     * @param b Длина второй стороны.
     * @param c Длина третьей стороны.
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double perimeter() {
        return (a + b + c);
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