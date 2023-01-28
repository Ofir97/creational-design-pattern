package robots;

public class ModernRobotBuilder implements RobotBuilder{

    private Robot robot;

    public ModernRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Modern head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Modern torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Modern arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Modern legs"); ;
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
