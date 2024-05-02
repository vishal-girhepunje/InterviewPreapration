package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    // Define a Supplier for the student list
    private Supplier<List<Student>> studentListSupplier = () -> {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ankit", "Pune", 31));
        studentList.add(new Student("Megha", "Mumbai", 33));
        studentList.add(new Student("Rohan", "Mumbai", 25));
        studentList.add(new Student("Kartik", "Pune", 8));
        studentList.add(new Student("Snehal", "Pune", 11));
        studentList.add(new Student("Kedar", "Pune", 3));
        studentList.add(new Student("Parth", "Mumbai", 3));
        return studentList;
    };

    // Method to get the student list from the Supplier
    public List<Student> get() {
        return studentListSupplier.get();
    }

    public static void main(String[] args) {
        // Create an instance of SupplierDemo
        SupplierDemo supplierDemo = new SupplierDemo();
        
        // Get the list of students using the get() method
        List<Student> studentList = supplierDemo.get();

        // Print the list of students
        System.out.println(studentList);
    }
}
