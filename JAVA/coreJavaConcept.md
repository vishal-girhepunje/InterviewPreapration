# Core Java Concepts:
## Q.1 What is the difference between JDK and JRE?
- JDK (Java Development Kit) includes tools for developing Java applications, while JRE (Java Runtime Environment) provides the necessary resources to run Java applications.

## Q.2 Why is Java a platform independent language?
- java achieves platform independence through its "Write Once, Run Anywhere" principle, where the code can be written on one platform and executed on any other platform with a Java Virtual Machine (JVM).

## Q.3 What is the difference between an abstract class and an interface?
- An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods. A class can implement multiple interfaces, but it can inherit from only one abstract class.
## Q.4 What is the difference between final, finally, and finalie?
- final: a keyword used to restrict the user. finally: a block of code always executed, whether an exception is handled or not. finalize: a method in the Object class that is called by the garbage collector before an object is destroyed.
## Q.5 What is the difference between stack and heap memory?
- Stack memory is used for storing local variables and is automatically managed, while heap memory is used for dynamic memory allocation and is managed explicitly by the programmer.
## Q.6 What is the difference between method overloading and method overriding?
- Overloading occurs in the same class with different parameters, while overriding occurs in two classes with a parent-child relationship, with the child class providing a specific implementation of a method already defined in the parent class.
## Q.7 What is the difference between an abstract class and an interface?

## Q.8 What is the difference between a private and a protected modifier?
- private: Accessible only within the class. protected: Accessible within the same package and by subclasses in other packages.

# Java Interview Questions

## Q.9 What is constructor overloading in Java?

Constructor overloading in Java refers to the practice of having multiple constructors within a class, each with a different set of parameters. This enables the creation of objects in various ways.

## Q.10 What is the use of the super keyword in Java?

The `super` keyword in Java is employed to refer to the immediate parent class object. It is often used to invoke parent class methods, access parent class fields, or call the parent class constructor.

## Q.11 Difference between static methods, static variables, and static classes in Java?

- **Static Methods**: Belong to the class rather than an instance.
- **Static Variables**: Shared among all instances of a class.
- **Static Classes**: Nested classes marked with the `static` keyword, making them independent of the outer class.

## Q.12 What exactly is System.out.println in Java?

`System.out.println` is a Java statement used to print text or values to the console. It writes the argument passed to it to the standard output, usually the console.

## Q.13 What part of memory - Stack or Heap - is cleaned in the garbage collection process?

The garbage collection process primarily cleans up memory in the heap. Stack memory is automatically managed and does not undergo the garbage collection process.
