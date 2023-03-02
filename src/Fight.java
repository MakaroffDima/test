public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork(); // создаем орка
        Elf elf = new Elf(); // создаем эльфа
        fight(ork, elf); // создаем метод fight между ними
    }

    public static void fight(Ork ork, Elf elf) { //описание метода fight
        while (true) { // создаем цикл
            if (!ork.isOrkAlive && elf.isElfAlive) { //Если орк жив false и эльф жив true, то эльф победил
                System.out.println("Ork is dead. Elf win!");
                break;
            } else if (ork.isOrkAlive && !elf.isElfAlive) { // если эльф жив false и орк жив true, то орк победил
                System.out.println("Elf is dead. Ork win!");
                break;
            } else if (!ork.isOrkAlive && !elf.isElfAlive) { // если оба false, то оба мертвы
                System.out.println("All is dead...");
                break;
            }
            if (elf.health <= 0) { // Если здоровье эльфа меньше либо равно нулю, то эльф жив не истина
                elf.isElfAlive = false;
            } else {                   // здоровье эльфа - сила удара Орка
                elf.health -= ork.Power;
            }
            if (ork.health <= 0) {   // Если здоровье орка меньше либо равно нулю, то орк жив не истина
                ork.isOrkAlive = false;
            } else {               // здоровье орка - сила удара эльфа
                ork.health -= elf.Power;
            }
        }
    }
}

