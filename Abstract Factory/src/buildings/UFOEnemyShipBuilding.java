package buildings;

import factories.EnemyShipFactory;
import factories.UFOBossEnemyShipFactory;
import factories.UFOEnemyShipFactory;
import ships.EnemyShip;
import ships.UFOBossEnemyShip;
import ships.UFOEnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO
        // needs. The EnemyShip object is returned & given a name

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else

            // If UFO BOSS was sent grab use the factory that knows
            // what types of weapons and engines a Boss UFO
            // needs. The EnemyShip object is returned & given a name

            if(typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");

            }

        return theEnemyShip;
    }
}
