# Exception Handling:

| Question                                               | Description                                                                                                                                                                               |
|--------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| What is an exception?                                  | An abnormal event or runtime error during program execution.                                                                                                                              |
| How does an exception propagate throughout Java code?   | Exceptions propagate through the method call stack until a suitable catch block is found.                                                                                                |
| Difference between checked and unchecked exceptions?   | Checked exceptions are checked at compile-time, while unchecked exceptions (RuntimeExceptions) are not checked at compile-time and include programming errors.                          |
| What is the use of try-catch block in Java?             | It is used to handle exceptions. Code within the try block is monitored, and if an exception occurs, it is caught by the corresponding catch block.                                       |
| Difference between throw and throws?                   | `throw` is used to explicitly throw an exception in a method, while `throws` is used in the method signature to indicate that the method might throw certain exceptions.                  |
| What is the use of the finally block?                  | The `finally` block contains code that is always executed, regardless of whether an exception occurs or not.                                                                           |
| Base class of all exception classes?                   | `java.lang.Throwable` is the base class of all exception classes.                                                                                                                          |
| What is Java Enterprise Edition (Java EE)?             | Java EE (Enterprise Edition) is a set of specifications that extend Java SE to provide APIs for developing enterprise-level, distributed, and scalable Java applications.                 |

# Java EE:

| Question                                                 | Description                                                                                                                                                                                   |
|----------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Difference between a Servlet and a JSP?                   | A Servlet is a Java class for handling requests on the server-side, while JSP (JavaServer Pages) simplifies dynamic web page development. Servlets handle business logic, and JSP handles presentation logic.                                        |
| Purpose of the Java Persistence API (JPA)?                | Java Persistence API (JPA) simplifies database operations by allowing developers to interact with databases using Java objects, facilitating the management of relational data in Java applications.                                                |
| Difference between stateful and stateless session beans? | Stateful session beans maintain conversational state with the client, while stateless session beans do not store client-specific state between invocations. Stateful beans are associated with a specific client, whereas stateless beans are shared among clients. |
