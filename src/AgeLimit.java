public class AgeLimit {
    public static void main(String[] args) {
        int age = 17;
        if (age < 14) {
            System.out.println("Тебе всего " + age + " , прокол ушей в присутствии родителей");
        }
        if (age >=15 && age<18){
            System.out.println("Тебе уже " + age + " ,прокол ушей, пупка, языка, носа в присутствии родителей");
        }
        if(age>=18) {
            System.out.println("Ты взрослый " + age + " , Можешь делать, что захочешь");
        }
    }
}
