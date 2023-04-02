package withoutStrategyPattern;

public class SportyVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy");
    }
}
