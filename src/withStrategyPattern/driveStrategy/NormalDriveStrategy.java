package withStrategyPattern.driveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy with Strategy Pattern");
    }
}
