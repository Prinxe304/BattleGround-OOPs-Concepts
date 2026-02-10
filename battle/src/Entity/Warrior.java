package Entity;

public class Warrior extends Character {

    Warrior() {
        super(1000, 250);
    }

    @Override
    public void attack(Villian enemy){
        System.out.println("Warrior smashes 🔥 Swords!");
        super.setHealth(enemy.getHealth()-super.getAttack());
    }
}