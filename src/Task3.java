public class Task3 {
    public static void main(String[] args) {
        int x = 2;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.println("-");
            if (x == 2) {
                System.out.println("b c");
            }
            if (x == 1) {
                System.out.println("d");
                x = x - 1;
            }

        }
    }
}