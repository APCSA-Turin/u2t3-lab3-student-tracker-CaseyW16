package com.example.project;

public class Student {
    // instance variables for 
    private String firstName;
    private String lastName;
    private int gradYear;
    private double testScoreSum;
    private int numTestScores;
    private double maxTestScore;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;

        this.testScoreSum = 0.0;
        this.numTestScores = 0;
        this.maxTestScore = 0.0;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        return maxTestScore;
    }

    public int getTestScoreCount(){
        return numTestScores;
    }

    public int getGradYear(){
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        testScoreSum += newTestScore;
        numTestScores++;
        if (newTestScore > maxTestScore) {
            maxTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        return averageTestScore() > 65;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        return testScoreSum / numTestScores;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + numTestScores);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + maxTestScore);
        System.out.println("Is passing: " + (isPassing() ? "yes" : "no"));
    }
 }
 