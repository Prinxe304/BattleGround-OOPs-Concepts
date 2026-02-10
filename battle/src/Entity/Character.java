package Entity;

public abstract class Character {

    private int health;
    private int attack;

    Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage, String name) {
        health -= damage;
        System.out.println("hero takes " + damage + " damage! HP left: " + health);
    }

    public abstract void attack(Villian opponent);
}

