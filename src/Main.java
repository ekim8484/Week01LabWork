public class Main
{
    public static void main(String[] args)
    {
        Vehicle vehi = new Vehicle();
        vehi.setNumberOfWheels(2);
        vehi.setColor("black");
        vehi.setEngineSize(150);
        vehi.setFuelType("premium gasoline");

        System.out.println("Get number of wheels: " + vehi.getNumberOfWheels());
        System.out.println("Get color: " + vehi.getColor());
        System.out.println("Get engine size: " + vehi.getEngineSize());
        System.out.println("Get fuel type: " + vehi.getFuelType());

        Car c = new Car();
        c.setNumberOfWheels(4);
        c.setColor("blue");
        c.setEngineSize(2.4f);
        c.setFuelType("regular gasoline");
        c.setBrand("Toyota");
        System.out.println("Get brand: " + c.getBrand());
        c.honk();
        c.displayInfo();
    }
}