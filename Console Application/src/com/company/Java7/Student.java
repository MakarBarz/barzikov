package com.company.Java7;

import java.util.*;

/**
 * Created by Документи on 20.02.2017.
 */
public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course == course) System.out.println("Student name: " + student.name + ", course: " + student.course);
        }
    }


    static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }

    @Override
    public String toString() {
        return "Name is: " + name + ", course: " + course;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasia", 1));
        students.add(new Student("Petia", 4));
        students.add(new Student("Vova", 2));
        students.add(new Student("Igor", 1));
        students.add(new Student("Dima", 5));

        Student.printStudents(students, 1);

        students.sort(new NameComparator());
        System.out.println(Arrays.toString(students.toArray()));

        students.sort(new CourseComparator());
        System.out.println(Arrays.toString(students.toArray()));
    }
}
