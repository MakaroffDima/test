public class Quarter {
    public static void main(String[] args) {

    }
    Quarter quarter= new findQuarter();
    public void findQuarter(int x, int y) {
        int res = 0;
        if (x > 0 && y > 0) res = 1;
        else if (x < 0 && y > 0) res = 2;
        else if (x < 0 && y < 0) res = 3;
        else res = 4;
        System.out.println(res);
    }
}
