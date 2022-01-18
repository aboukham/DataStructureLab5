package lab5.DataStructureLab5;

import java.util.*;

public class TestClass{
    public static void main(String[] args){
        ArrayList<Student>  students = new ArrayList<>();
        students.add(new Student(111, "abdelaziz", 90));
        students.add(new Student(112, "aboukhame", 40));
        students.add(new Student(113, "jhon", 82));
        students.add(new Student(114, "david", 94));

        System.out.println("------------------------The list before sorting----------------------");
        System.out.println(students);
        System.out.println(students.get(0).equals(students.get(1)));
        System.out.println(students.get(1).equals(students.get(1)));
        System.out.println("------------The list after sorting by score using comparable----------");
        Collections.sort(students);
        System.out.println(students);
        System.out.println("------------The list after sorting by name using comparator----------");
        Collections.sort(students, students.get(0).getSortByName());
        System.out.println(students);
    }
}
