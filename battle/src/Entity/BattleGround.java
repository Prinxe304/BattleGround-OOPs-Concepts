package Entity;

import java.util.Random;
import java.util.Scanner;

public class BattleGround {
    private static Random random = new Random();



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎮 Welcome to Turn-Based Battle Game!");
        System.out.println("Heyy, Please Select the Hero Name");
        System.out.println("1. Wizard" + " And " + "2. Warrior" );
        int hero_number = sc.nextInt();
        Character hero= null;


        switch ((hero_number-1)) {

            case 0:
                System.out.println("You Selected Wizard");
                hero = new Wizard();
                break;

            case 1:
                System.out.println("You Selected Wizard");
                hero = new Warrior();
                break;
        }

        Villian villian = new Villian(1000, 150 , 300 , 490);

        boolean turn = random.nextBoolean();
        while(hero.getHealth() > 0 && villian.getHealth() > 0){
            if(turn){
                System.out.println("\n👉 Hero Turn:");
                hero.attack(villian);
            }else{
                System.out.println("\n👉 Villian Turn:");
                villian.attack(hero);
            }
            turn = !turn;
        }

        System.out.println("\n======================");
        if (hero.getHealth() > 0) {
            System.out.println("🏆 Hero Wins!");
        } else {
            System.out.println("💀 Villain Wins!");
        }
        System.out.println("======================");

    }


}
