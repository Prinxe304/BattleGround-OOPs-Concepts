package Entity;

import java.util.Random;

public class Villian{
    private int health;
    private int spe1;
    private int spe2;
    private int spe3;

    public Villian(int health, int spe1, int spe2, int spe3) {
        this.health = health;
        this.spe1 = spe1;
        this.spe2 = spe2;
        this.spe3 = spe3;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpe1() {
        return spe1;
    }

    public void setSpe1(int spe1) {
        this.spe1 = spe1;
    }

    public int getSpe2() {
        return spe2;
    }

    public void setSpe2(int spe2) {
        this.spe2 = spe2;
    }

    public int getSpe3() {
        return spe3;
    }

    public void setSpe3(int spe3) {
        this.spe3 = spe3;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    private Random random = new Random();

    public void attack(Character enemy){
        System.out.println("Villion casts 🔥 Fireball!");
        int choice = random.nextInt(3);

//        System.out.println(choice);

        if(choice == 0){
//            System.out.println("hero takes " + spe1 + " damage! HP left: " + health);
            enemy.takeDamage(spe1 , "spe1");
        }else if(choice == 1){
//            System.out.println("hero takes " + spe2 + " damage! HP left: " + health);
            enemy.takeDamage(spe2, "spe2");
        }else{
//            System.out.println("hero takes " + spe3 + " damage! HP left: " + health);
            enemy.takeDamage(spe3, "spe3");
        }
    }

}
