package com.SerializationExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeEmployee {
    public static void main(String[ ] args) throws IOException
    {
// Create an object of Employee class.
        Employee emp = new Employee();

// Sending values to variables.
        emp.name = "Poornima";
        emp.id = 12345;
        emp.salary = 35000.00f;
        emp.dob = "13-10-2000";
        emp.location = "Vijayapur";

// Create an object of FileOutputStream class to connect objfile.txt file.
        FileOutputStream fos = new FileOutputStream("D:\\pkfile.txt");

// Create an object of ObjectOutputStream class to connect with fos.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

// Call writeObject() method of ObjectOutputStream class.
        oos.writeObject(emp);
        oos.flush();
        oos.close();
        System.out.println("Serialization is done successfully...");
    }
}
