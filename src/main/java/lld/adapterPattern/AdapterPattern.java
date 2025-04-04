package lld.adapterPattern;

public class AdapterPattern {
  /*  The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together. In other words,
    it allows an object to be used as another type by wrapping it with an adapter.
    This pattern is especially useful when integrating existing systems or libraries with new ones, where modifying the existing code is not feasible or desirable.

    Key Concepts of the Adapter Pattern:
        1. Target Interface: The interface that the client expects or works with.
        2. Adapter: A wrapper class that implements the target interface and adapts the functionality of the incompatible class (adaptee).
        3. Adaptee: The existing class with an incompatible interface that needs to be adapted.
        4. Client: The client interacts with the target interface, not knowing about the adapter or the adaptee.

    When to Use the Adapter Pattern:
        1. When you have an existing class (adaptee) whose interface is incompatible with the system that is trying to use it.
        2. When you want to reuse an existing class, but its methods don’t match what you need.
        3. When integrating systems with different interfaces without altering their source code.

    Types of Adapter Pattern:
        1. Object Adapter: The one we used in the example above. It relies on composition, where the adapter contains an instance of the adaptee and delegates calls to it.
        2. Class Adapter: This type uses inheritance instead of composition. The adapter class inherits from both the target interface and the adaptee class (not possible in Java due to single inheritance).
           This is more common in languages that support multiple inheritance, like C++.

    Real-World Examples:
        1. Adapter for Electrical Devices: A power adapter is a real-world analogy, allowing devices built for different voltage standards (e.g., 110V and 220V) to work in different regions by adapting the input power.
        2. Java java.util.Arrays: The asList() method in the Arrays class returns a List backed by an array. It adapts an array to be used as a List.
   */
    public static void main(String[] args) {
        NewPlanInterface newPlanInterface=new OldCarAdapter(new OldExistingCar("BMW"));
        newPlanInterface.accelerate();
        newPlanInterface.deAccelerate();
    }
}
