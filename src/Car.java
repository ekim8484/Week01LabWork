public class Car extends Vehicle
{
    String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk()
    {
        System.out.println("Honk, honk!");
    }

    public void displayInfo()
    {
        System.out.println("Brand: " + this.brand);
        System.out.println("Number of Wheels: " + this.numberOfWheels);
        System.out.println("Color: " + this.color);
        System.out.println("Engine Size: " + this.engineSize);
        System.out.println("Fuel Type: " + this.fuelType);
    }

}
