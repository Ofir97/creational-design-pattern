package robots;

public class TestRobotBuilder {

    /**
     * Builder pattern aims to “Separate the construction of a complex object from its representation
     *                          so that the same construction process can create different representations.”
     *
     * It is used to construct a complex object step by step and the final step will return the object.
     */

    public static void main(String[] args) {
        RobotEngineer robotEngineer = new RobotEngineer();
        robotEngineer.setRobotBuilder(new OldRobotBuilder());
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Old Robot built");
        System.out.println(firstRobot);

        robotEngineer.setRobotBuilder(new ModernRobotBuilder());
        robotEngineer.makeRobot();
        Robot secondRobot = robotEngineer.getRobot();

        System.out.println("\nModern Robot built");
        System.out.println(secondRobot);
    }
}
