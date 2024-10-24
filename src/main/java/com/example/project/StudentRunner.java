package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        Student guy = new Student("Person", "Human", 3052);
        guy.addTestScore(80);
        guy.addTestScore(100);
        guy.addTestScore(95);
        guy.printStudentInfo();
    }
}