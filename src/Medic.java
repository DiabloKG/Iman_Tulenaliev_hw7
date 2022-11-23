public class Medic extends Hero{
    double healPoints;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил лечение! ");
    }
    public void increaseExperience(){
        healPoints = healPoints * 1.10;
        System.out.println(healPoints);
    }
}
