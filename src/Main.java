public class Main {
    public static void main(String[] args) {
        Hero[] hero = {new Warrior(), new Magic(), new Medic()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
            if (hero[i] instanceof Medic) {
                ((Medic) hero[i]).increaseExperience();
            }
        }
    }
}