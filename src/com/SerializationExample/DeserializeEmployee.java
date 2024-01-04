package com.SerializationExample;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException ,ClassNotFoundException
    {
// Create an object of FileInputStream class to connect objfile.txt file.
        FileInputStream fis = new FileInputStream("D:\\pkfile.txt");

// Create an object of ObjectInputStream to connect with fis.
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject(); // Reading objects.
        Employee e = (Employee)obj; // Converting to Employee.

        System.out.println("Name: " +e.name);
        System.out.println("Employee id: " +e.id);
        System.out.println("Employee's salary: "+ "Rs " +e.salary);
        System.out.println("Date of joining: " +e.dob);
        System.out.println("Location: " +e.location);
    }
}
