package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionDemo {
	// Define a Supplier to create a list of students
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
        // Create an instance of SupplierDemo and get the list of students
        SupplierDemo supplierDemo = new SupplierDemo();
        List<Student> studentList = supplierDemo.get();

        // Function to get the student's name
        Function<Student, String> getName = Student::getName;

        // Use the Function to get a list of student names
        List<String> studentNames = studentList.stream()
                                               .map(getName)
                                               .collect(Collectors.toList());

        // Print the list of student names
        System.out.println("Student Names: " + studentNames);
    }
    
}
