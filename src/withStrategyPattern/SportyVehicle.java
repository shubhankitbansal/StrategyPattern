package withStrategyPattern;

import withStrategyPattern.driveStrategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{

    public SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
