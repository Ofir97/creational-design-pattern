package ships;

public abstract class EnemyShip {

    protected String name;
    protected double amountDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountDamage() {
        return amountDamage;
    }

    public void setAmountDamage(double amountDamage) {
        this.amountDamage = amountDamage;
    }

    public void followHeroShip() {
        System.out.println(name + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(name + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(name + " attacks and does " + getAmountDamage());
    }
}
