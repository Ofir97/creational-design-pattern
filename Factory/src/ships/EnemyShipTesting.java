package ships;

import java.util.Scanner;

public class EnemyShipTesting {

    /**
     * Creational design pattern:
     *    - a method (makeEnemyShip) returns one of several possible classes that share a common super class.
     *    - the class is chosen at runtime.
     *    - used to centralize class selection code.
     *    - hides all subclasses (all enemy ship types)
     */
    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);
        System.out.print("What type ship? (U / R / B) ");
        enemyShip = enemyShipFactory.makeEnemyShip(userInput.nextLine());

        if (enemyShip != null) {
            doStuffEnemy(enemyShip);
        }
        else {
            System.out.println("Enter a U, R, or B next time...");
        }
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
