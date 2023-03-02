import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height;
        double weight;
        double massIndex;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес");
        weight = scanner.nextDouble();
        System.out.println("Введите рост");
        height = scanner.nextDouble();
        massIndex = weight / (height * height);
        if (massIndex < 18.5) {
            System.out.println("Слишком маленький вес");
        } else if (massIndex >= 18.5 && massIndex <= 24.9) {
            System.out.println("Вес в порядке");
        } else if (massIndex >= 25 && massIndex <= 29) {
            System.out.println("Ожирение");
        }else if (massIndex >= 30) {
            System.out.println("Сильное ожирение");
        }
    }
}
