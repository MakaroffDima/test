public class CalculatePerimeters {
    public static void main(String[] args) {
        int sideLengthTriangle = 3; // сторона треугольника
        int sideLengthSquare = 4;  // сторона квадрата
        int radius = 5; // радиус окружности
        System.out.println("Perimeter triangle = " + PerimeterTriangle(sideLengthTriangle)); // Периметр треугольника
        System.out.println("Perimeter square = " + PerimeterSquare(sideLengthSquare));  // Периметр квадрата
        System.out.println("Perimeter circle = " + PerimeterCircle(radius));   // Периметр окружности
    }

    public static int PerimeterTriangle(int lenght) { // метод расчета периметра треуголника
        int P = 3 * lenght;
        return P;
    }

    public static int PerimeterSquare(int lenght) { // метод расчета периметра квадрата
        int P = 4 * lenght;
        return P;
    }

    public static double PerimeterCircle(int radius) { // метод расчета периметра окружности
        double PI = 3.14159;
        double P = 2 * PI * radius;
        return P;
    }
}