package com.company.Java2;

/**
 * Created by Документи on 06.02.2017.
 */
public class Student {
    private String name;
    private int rating;
    private static int count = 0;
    private static int totalRating = 0;
    private static int avgRating = 0;
//constructors

    public Student(){
        setName("");
        setRating(0);
        Student.count++;
    }
    public Student(String name, int rating) throws ArithmeticException {
        setName(name);
        Student.count++;
        setRating(rating);
    }
//getters and setters

    public String getName() {
        return name;
}
    public int getRating() {
        return rating;
    }
    public int getTotalRating() { return totalRating;}
    public int getAvgRating() { return avgRating;}
    public void setName(String name) {
        this.name = name;
    }
    public void setRating(int rating) throws ArithmeticException {
        if (rating < 0) throw new ArithmeticException("Rating has to be more than zero!");
        if (this.rating != 0){
            Student.totalRating -= this.rating;
        }
        this.rating = rating;
        Student.totalRating += this.rating;
        Student.avgRating = Student.totalRating / Student.count;
    }
//others methods

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
}
    public void changeRating(int rating) throws ArithmeticException {
        setRating(rating);
    }

    @Override
    public String toString(){
        return ("Name is " + name + "; rating: " + rating);
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("Vasia", 50);
            Student student2 = new Student("Petia", 70);
            Student student3 = new Student("Vova", 90);
            System.out.println("Total raiting: " + student1.getTotalRating());
            System.out.println("Average raiting: " + student1.getAvgRating());
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);
            System.out.println(student1.getName() + " was better then " +
                    student2.getName() + ": " + student1.betterStudent(student2));
            student1.changeRating(80);
            System.out.println(student1.getName() + " is better then " +
                    student2.getName() + " in this year: " + student1.betterStudent(student2));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage() + "\n");
        }
    }
}