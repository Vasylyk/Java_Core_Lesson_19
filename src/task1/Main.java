package task1;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Taras", 15, 8000);
        File file = new File("text.txt");
        Methods.serialize(file, employee);
        System.out.println(Methods.deserialize(file));

        System.out.println();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andriy", 7, 10000));
        employees.add(new Employee("Vasil", 19, 7000));
        employees.add(new Employee("Olena", 21, 9000));
        File file1 = new File("text1.txt");
        Methods.serialize(file1, (Serializable) employees);
        System.out.println(Methods.deserialize(file1));
    }
}
