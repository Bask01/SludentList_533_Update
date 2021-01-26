/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author kbas0
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        // Create an array to hold 4 instances of Student
        Student[] students = new Student[4];
        
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter student names");

        for (int i = 0; i < students.length; i++) {        
            System.out.println("Enter name for student " + (i + 1));            
            String name = input.nextLine();
            
            students[i] = new Student(name);        
        }

        System.out.println("Here are the students");
        
        String format = "Student name is %s\n";
        
        // Use a for-each loop
        for (Student student: students) {
            System.out.printf(format, student.getName());
        }         
    }
}
