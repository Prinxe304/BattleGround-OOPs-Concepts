package Entity;

public class Wizard extends Character{

//    Character ch = new Character(1000, 450);

    Wizard() {
        super(1000, 250);
    }


    @Override
    public void attack(Villian enemy){
        System.out.println("Wizard casts 🔥 Fireball!");
        enemy.setHealth(enemy.getHealth()-super.getAttack());
        System.out.println( "villian takes " + super.getAttack() + " damage! HP left: " + enemy.getHealth());

    }



}
