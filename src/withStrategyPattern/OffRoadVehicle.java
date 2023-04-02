package withStrategyPattern;

import withStrategyPattern.driveStrategy.DriveStrategy;
import withStrategyPattern.driveStrategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
