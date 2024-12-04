/**
 * Класс {@code Rectangle} для вычисления площади и периметра прямоугольника.
 */
public class Rectangle {
    private double length; // Длина прямоугольника
    private double width;  // Ширина прямоугольника

    /**
     * Конструктор для создания прямоугольника.
     *
     * @param length Длина прямоугольника (положительное число).
     * @param width Ширина прямоугольника (положительное число).
     */
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина и ширина должны быть положительными числами.");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return площадь прямоугольника.
     */
    public double calculateArea() {
        return length * width;
    }

    /**
     * Вычисляет периметр прямоугольника.
     *
     * @return периметр прямоугольника.
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    /**
     * Главный метод для демонстрации работы класса.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Площадь: " + rectangle.calculateArea());       // Вывод: Площадь: 15.0
        System.out.println("Периметр: " + rectangle.calculatePerimeter()); // Вывод: Периметр: 16.0
    }
}
