public class Home {
    public static void main(String[] args) {

        int kolya = 12;
        int petya =8; // петя оказался на 8
        kolya /=2; // петя прошёл половину
        kolya += petya;
        petya= kolya -12; // коля живет на 12 этажей выше
        System.out.println("Петя живет на " + petya + " этаже.");
        System.out.println("Коля живет на " + kolya + " этаже.");

    }
}
