import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество попыток ");
        int turnQuantity = scanner.nextInt();

        System.out.println("Введите нижний предел числа ");
        int lowerBound = scanner.nextInt();

        System.out.println("Введите верхний предел числа ");
        int upperBound = scanner.nextInt();
        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;
        //Сохраняем случайное число в переменной randInt;
        randInt = lowerBound + rand.nextInt(upperBound - lowerBound + 1);
        int counter = 1;
        //создаем булеву переменную для сохранения статуса «угадал/не угадал»
        boolean status = false;
        while (counter <= turnQuantity) {

            while (true) {
                System.out.println("Введите загаданное число");
                int userInput = scanner.nextInt();
                if (userInput == randInt) {
                    System.out.println("Вы угадали число");
                } else if (userInput < randInt) {
                    System.out.println("Загадочное число больше");
                } else {
                    System.out.println("Загадочное число меньше");

                }
            }
        }
    }
}


