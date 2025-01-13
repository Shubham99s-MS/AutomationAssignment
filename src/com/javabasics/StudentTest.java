package com.javabasics;

import java.util.HashMap;
import java.util.Map;

// StudentGrades class to manage grades for a student
class StudentGrades {
    String studentName;
    Map<String, Integer> grades; // Stores assignment names and their grades

    // Constructor
    public StudentGrades(String studentName) {
        this.studentName = studentName; // Fix: Assign to instance variable
        grades = new HashMap<>();
    }

    // Add a new grade for an assignment
    public void addNewStudentGrade(String assignment, int grade) {
        grades.put(assignment, grade);
        System.out.println("Grade for assignment \"" + assignment + "\" added for " + studentName + ".");
    }

    // Remove a grade for an assignment
    public void removeGrade(String assignment) {
        if (grades.containsKey(assignment)) {
            grades.remove(assignment);
            System.out.println("Grade for assignment \"" + assignment + "\" removed for " + studentName + ".");
        } else {
            System.out.println("Assignment \"" + assignment + "\" not found for " + studentName + ".");
        }
    }

    // View all grades
    public void viewGrades() {
        System.out.println("Grades for " + studentName + ":");
        if (grades.isEmpty()) {
            System.out.println("No grades recorded.");
        } else {
            grades.forEach((assignment, grade) -> 
                System.out.println("Assignment: " + assignment + ", Grade: " + grade));
        }
    }
}

// StudentTest class for demonstration
public class StudentTest {
    public static void main(String[] args) {
        // Create 3 students
        StudentGrades student1 = new StudentGrades("Alice");
        StudentGrades student2 = new StudentGrades("Bob");
        StudentGrades student3 = new StudentGrades("Carol");

        // Add grades for Alice
        student1.addNewStudentGrade("Math", 85);
        student1.addNewStudentGrade("Science", 90);
        student1.addNewStudentGrade("History", 88);

        // Add grades for Bob
        student2.addNewStudentGrade("Math", 78);
        student2.addNewStudentGrade("Science", 82);

        // Add grades for Carol
        student3.addNewStudentGrade("Math", 92);
        student3.addNewStudentGrade("History", 95);

        // View grades for all students
        student1.viewGrades();
        student2.viewGrades();
        student3.viewGrades();

        // Remove a grade for Alice
        student1.removeGrade("Science");
        student1.viewGrades();

        // Attempt to remove a non-existent grade for Bob
        student2.removeGrade("History");

        // View grades again after changes
        student2.viewGrades();
        student3.viewGrades();
    }
}

