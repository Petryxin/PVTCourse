package by.home.homework8.zadanie24;

public class Main {
    public static void main(String[] args) {
        RobotVacuumCleaner robot = new RobotVacuumCleaner();
        RobotVacuumCleaner robotWithProblem = new RobotVacuumCleaner();
        WaterVacuumCleaner water = new WaterVacuumCleaner();
        robot.on();
        robot.printState();
        water.off();
        water.printState();
        robotWithProblem.off();
        robotWithProblem.printState();
        water.onWater();
        water.waterWash();



    }
}
