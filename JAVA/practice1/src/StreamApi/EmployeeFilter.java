package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 30),
                new Employee(2, "Balu", 25),
                new Employee(3, "Arun", 40),
                new Employee(4, "Anna", 28),
                new Employee(5, "chatur", 27)
        );

        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getId() % 2 != 0)  // IDs that are odd numbers
                .filter(e -> e.getAge() % 2 == 0)  // Ages that are even numbers
                .filter(e -> e.getName().startsWith("A"))  // Names starting with the letter 'A'
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);
    }
}
