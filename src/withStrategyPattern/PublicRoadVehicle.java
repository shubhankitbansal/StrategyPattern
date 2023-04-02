package withStrategyPattern;

import withStrategyPattern.driveStrategy.NormalDriveStrategy;

public class PublicRoadVehicle extends Vehicle{

    public PublicRoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
