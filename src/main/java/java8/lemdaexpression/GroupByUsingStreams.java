package java8.lemdaexpression;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByUsingStreams {

    public static class Employee {
        String name;
        String department;
        double salary;
        public Employee(String name,
        String department,
        double salary){
            this.name=name;
            this.department=department;
            this.salary=salary;
        }
        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
        }
    }

    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee("Manish","It",200000),
                new Employee("Suprbha","EC",400000),
                new Employee("Pandey","It",600000),
                new Employee("Pathak","EC",340000),
                new Employee("Avi","Farmer",800000)
        );

//        Map<String, List<Employee>> map= list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        map.forEach((d,e)->{
//            System.out.print(d +" : ");
//            System.out.println(
//                    e
//            );
//        });

//        Map<String, Optional<Employee>> map= list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.maxBy(
//                    Comparator.comparingDouble(Employee::getSalary)
//                )
//        ));
//        System.out.println(map);

//        Optional<String> nameOpt = Optional.ofNullable(null);
//        System.out.println(nameOpt.map(String::toUpperCase).orElse("Name is not available"));

//        Map<String, Double> map = list.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getDepartment,
//                        Collectors.averagingDouble(Employee::getSalary)
//                ));
//        System.out.println(map);




    }
}
