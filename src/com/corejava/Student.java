package com.corejava;

import java.util.Scanner;

public class Student{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects = 3;
        int totalStudents = 3;

        int[][] marks = new int[totalStudents][totalSubjects];
        int[] studentTotals = new int[totalStudents];
        int[] subjectTotals = new int[totalSubjects];

 
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < totalSubjects; j++) {
                System.out.print("Enter marks for Subject " + (char)('A' + j) + ": ");
                marks[i][j] = sc.nextInt();
                studentTotals[i] += marks[i][j];
                subjectTotals[j] += marks[i][j];
            }
        }

        int totalScoreAllSubjects = 0;
        for (int i = 0; i < totalStudents; i++) {
            totalScoreAllSubjects += studentTotals[i];
        }
        double averageAllSubjects = (double) totalScoreAllSubjects / (totalStudents * totalSubjects);

       
        for (int i = 0; i < totalStudents; i++) {
            double averageStudent = (double) studentTotals[i] / totalSubjects;
            System.out.println("Total score of Student " + (i + 1) + ": " + studentTotals[i]);
            System.out.println("Average score of Student " + (i + 1) + ": " + averageStudent);
        }

        
        for (int i = 0; i < totalSubjects; i++) {
            double averageSubject = (double) subjectTotals[i] / totalStudents;
            System.out.println("Total score of Subject " + (char)('A' + i) + ": " + subjectTotals[i]);
            System.out.println("Average score of Subject " + (char)('A' + i) + ": " + averageSubject);
        }

        System.out.println("Total score in all subjects: " + totalScoreAllSubjects);
        System.out.println("Average score in all subjects: " + averageAllSubjects);

       
    }
}
