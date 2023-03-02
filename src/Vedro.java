public class Vedro {
    private static int source = 30; // объём ведра
    private static int receiver = 0; // пустое ведро

    public static void main(String[] args) {
        while (source > 0) { // когда больше нуля уменьшается на 1
            source--;
            if (source % 10 != 0) { // каждый десятый литр мимо
                receiver++;
            }
            System.out.println(source);
            System.out.println(receiver);
        }
    }
}

