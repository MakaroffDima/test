public class TabUmn {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // задаем i до 10
            for (int f = 0; f < 10; f++) { // задаем f до 10
                if (f == 0) {
                    System.out.print(i + "  "); // если f=0 выводится i
                } else {
                    System.out.print(" " + i * f + " "); // иначе i* f
                }
            }
            System.out.println();
        }
    }
}
