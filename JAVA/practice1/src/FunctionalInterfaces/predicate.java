package FunctionalInterfaces;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicate {
	// Create a list of students based on given data
    private static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ankit", "Pune", 31));
        studentList.add(new Student("Megha", "Mumbai", 33));
        studentList.add(new Student("Rohan", "Mumbai", 25));
        studentList.add(new Student("Kartik", "Pune", 8));
        studentList.add(new Student("Snehal", "Pune", 11));
        studentList.add(new Student("Kedar", "Pune", 3));
        studentList.add(new Student("Parth", "Mumbai", 3));
        return studentList;
    }

    // Method to print a list of students
    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = getStudents();

        Predicate<Student> isFromCityMumbai = st -> st.getCity().equals("Mumbai");
        Predicate<Student> isAgeGreaterThan21 = st -> st.getAge() >= 21;

        // Filter students who are from Mumbai
        List<Student> filteredByCity = studentList.stream()
                .filter(isFromCityMumbai)
                .collect(Collectors.toList());

        // Further filter students who are older than 21
        List<Student> filteredByAge = filteredByCity.stream()
                .filter(isAgeGreaterThan21)
                .collect(Collectors.toList());

        // Print the filtered list
        printList(filteredByAge);
    }

}
