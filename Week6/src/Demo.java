public class Demo {
    public static void main(String[] args) {
        Engine engineType = new Engine(6000, "6-Cylinder");
        Wheel[] wheels = { new Wheel("Offroad Tires", 22, "Rear-End"),
                new Wheel("All-Terrain Tires", 18, "Front-End"),
                new Wheel("Winter Tires", 16, "Front & Back"),
                new Wheel("Summer Tires", 20, "Rear-End") };
        Car myCar = new Car("Black", 85, "21 Gallons", 6, "Toyota", 2022, engineType, wheels);

        myCar.getEngine().start();
        System.out.println(myCar.getWheels()[2].getSizeInInches());
        System.out.println(myCar.getTypeOfTank());
        System.out.println(myCar.getSeatingCapacity());
        myCar.getEngine().stop();

    }
}
