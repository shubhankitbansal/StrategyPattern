package withStrategyPattern;

import withStrategyPattern.driveStrategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategyObj;

    public Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
