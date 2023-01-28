package ships;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {

        if (shipType.equals("U")) {
            return new UFOEnemyShip();
        }
        if (shipType.equals("R")) {
            return new RocketEnemyShip();
        }
        if (shipType.equals("B")) {
            return new BigUFOEnemyShip();
        }
        return null;
    }
}
