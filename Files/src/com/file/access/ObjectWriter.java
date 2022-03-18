package com.file.access;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.file.model.Car;
import com.file.model.Engine;
import com.file.model.Wheel;

public class ObjectWriter {
    public static void main(String[] args) throws IOException {

        Engine engineType = new Engine(6000, "6-Cylinder");
        Wheel[] wheels = { new Wheel("Offroad Tires", 22, "Rear-End"),
                new Wheel("All-Terrain Tires", 18, "Front-End"),
                new Wheel("Winter Tires", 16, "Front & Back"),
                new Wheel("Summer Tires", 20, "Rear-End") };
        Car toyota = new Car("Black", 85, "21 Gallons", 6, "Toyota", 2022, engineType, wheels);

        Engine engineType1 = new Engine(6000, "V8 Engine");
        Wheel[] wheels1 = { new Wheel("Offroad Tires", 22, "All-Four"),
                new Wheel("All-Terrain Tires", 18, "All-Four"),
                new Wheel("Winter Tires", 16, "All-Four"),
                new Wheel("Summer Tires", 20, "All-Four") };
        Car chevy = new Car("Blue", 120, "32 Gallons", 6, "Chevy", 2022, engineType1, wheels1);

        try {

            FileOutputStream fileOStream = new FileOutputStream(
                    new File("C:\\Users\\NoirPhantom\\eclipse-workspace\\Files\\src\\com\\file\\cars.txt"));
            ObjectOutputStream objectOStream = new ObjectOutputStream(fileOStream);

            objectOStream.writeObject(toyota);
            objectOStream.writeObject(chevy);

            System.out.println("Objects are written to the file succesfully.");
            objectOStream.close();
            fileOStream.close();

        } catch (IOException e) {

            System.out.println("Handling IOException \n" + e.getMessage());

        }
    }
}
