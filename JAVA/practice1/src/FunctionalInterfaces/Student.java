package FunctionalInterfaces;

class Student {
    private String name;
    private String city;
    private int age;

    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', city='" + city + "', age=" + age + "}";
    }
}

