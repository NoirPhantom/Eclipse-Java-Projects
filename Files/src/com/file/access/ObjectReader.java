package com.file.access;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.file.model.Car;

public class ObjectReader {
    public static void main(String[] args) {

        try {

            FileInputStream fileIStream = new FileInputStream(
                    new File("C:\\Users\\NoirPhantom\\eclipse-workspace\\Files\\src\\com\\file\\cars.txt"));
            ObjectInputStream objectIStream = new ObjectInputStream(fileIStream);

            Car car1 = (Car) objectIStream.readObject();
            Car car2 = (Car) objectIStream.readObject();

            System.out.println(car1.getSeatingCapacity());

            System.out.println(car1.getColor());

            System.out.println(car2.getWheels()[1].getPosition());

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Send error message to the user." + e.getMessage());
        }

        catch (Exception e) {

            System.out.println("Send notification to Dev Ops or Help Desk");
        }
    }
}
