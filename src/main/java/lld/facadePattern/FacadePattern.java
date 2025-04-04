package lld.facadePattern;

public class FacadePattern {
    /*
    The Facade Pattern is a structural design pattern that provides a simplified interface to a complex system.
    It helps to hide the complexities of the underlying system by exposing a unified and easier-to-use interface to the client.
    This pattern is especially useful when working with large systems that have multiple subsystems,
    making it easier for the client to interact with the system without needing to know the details of how it works internally.

    When to Use the Facade Pattern:
        > When you want to provide a simple interface to a complex system.
        > When you want to decouple the client from the subsystem, making the system easier to use and maintain.
        > When you need to integrate with a legacy system that is complex and hard to work with directly.
        > When you want to layer your system, separating the client-facing part from the internal complexities.

    Use Cases:
        > Library Wrappers: When using third-party libraries, the facade pattern can be used to simplify the library’s API for your use cases.
        > Complex Systems: It’s commonly used in large systems like banking, where various subsystems (authentication, transaction processing, notification) are exposed to the user through a simple interface.
        > User Interface Components: Often in UI systems, facades are used to interact with multiple components (e.g., buttons, windows, etc.) using a unified API.

    Real-World Example:
        > JDBC (Java Database Connectivity): The DriverManager class in JDBC acts as a facade, simplifying the interaction between the client and the database connection.
            Instead of managing all the low-level details of the connection, the DriverManager provides methods like getConnection() to simplify the process.
        > Spring Framework: The Spring framework uses facades in various parts of the system. For example, JdbcTemplate acts as a facade for interacting with databases,
            hiding the complexities of transaction management, connection management, and exception handling.

    Disadvantages:
        > Restricted Access to Subsystems: The facade might limit access to some of the powerful features provided by the subsystems if those are not exposed via the facade.
        > Overhead: If the facade adds too much abstraction, it may introduce an unnecessary layer that complicates some use cases where direct interaction with the subsystem is more efficient.
     */

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();

        // Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Client interacts with the facade to watch a movie
        homeTheater.watchMovie("Inception");

        // Later, the client shuts down the system
        homeTheater.endMovie();
    }
}
