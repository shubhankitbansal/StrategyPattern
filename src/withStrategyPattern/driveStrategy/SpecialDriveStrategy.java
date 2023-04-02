package withStrategyPattern.driveStrategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy with Strategy Pattern");
    }
}
