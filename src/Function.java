import java.util.Scanner;
public class Function {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение n: ");
            int n = scanner.nextInt();
            System.out.println("Введите значение x: ");
            int x = scanner.nextInt();
            Summ summ = new Summ();
            float result = summ.calculate(n, x);
            System.out.println("Результат = " +result);
        }
    }
