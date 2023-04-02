import withoutStrategyPattern.OffRoadVehicle;
import withoutStrategyPattern.PublicRoadVehicle;
import withoutStrategyPattern.SportyVehicle;
import withoutStrategyPattern.Vehicle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Without Strategy Pattern
        Vehicle sportyVehicleObj = new SportyVehicle();
        sportyVehicleObj.drive();

        Vehicle publicVehicleObj = new PublicRoadVehicle();
        publicVehicleObj.drive();

        Vehicle offRoadVehicleObj = new OffRoadVehicle();
        offRoadVehicleObj.drive();

        // With Strategy Pattern
        withStrategyPattern.Vehicle sportyVehicleObjWithStrategy = new withStrategyPattern.SportyVehicle();
        sportyVehicleObjWithStrategy.drive();

        withStrategyPattern.Vehicle publicVehicleObjWithStrategy = new withStrategyPattern.PublicRoadVehicle();
        publicVehicleObjWithStrategy.drive();

        withStrategyPattern.Vehicle offRoadVehicleObjWithStrategy = new withStrategyPattern.OffRoadVehicle();
        offRoadVehicleObjWithStrategy.drive();
    }
}