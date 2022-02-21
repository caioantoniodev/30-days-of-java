package com.thirtydaysofthejava.day12;

public class Inheritance {

    public static void main(String[] args) {
        int[] testScores = { 100, 80 };

        Student s = new Student("7L0j2Js", "2Fqok", 420, testScores);
        s.printPerson();
        System.out.println("Grade: "+s.calculate());
    }
}

class Student extends Person {

    private final int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate() {
        Double average = 0.0;

        for (Integer score : testScores) {
            average += score;
        }

        average = average / testScores.length;

        if (average >= 90 && average <= 100)
            return 'O';
        else if (average >= 80 && average < 90)
            return 'E';
        else if (average >= 70 && average < 80)
            return 'A';
        else if (average >= 55 && average < 70)
            return 'P';
        else if (average >= 40 && average < 55)
            return 'D';
        else
            return 'T';
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printPerson() {
        System.out.printf("Name: %s, %s %nID: %d %n",
                this.getLastName(), this.getFirstName(), this.getIdNumber());
    }
}

