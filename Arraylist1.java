package com.bhavana;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("John","doe",4567));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","wilson",3215));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1,new Employee("John","Adams",231));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());
        employeeList.add(3,new Employee("John","doe",2313));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray= employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee:employeeArray){
                System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
        System.out.println(employeeList.indexOf(new Employee("John","doe",2313)));
         employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
