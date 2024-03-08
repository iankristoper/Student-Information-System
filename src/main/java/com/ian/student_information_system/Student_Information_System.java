
package com.ian.student_information_system;
import java.util.Scanner;


//THIS SYSTEM HELPS MY KNOWLEDGE IN ENCAPSULATIONse
//I USE PRIVATE ATTRIBUTES FOR THE STUDENT DATA

/*
CONSTRUCTOR - IT IS A SPECIAL METHOD THAT HELPS PREPARE AN OBJECT 
                THE PURPOSE OF CONSTRUCTOR IS TO SET UP THE INITIAL STATE OF AN OBJECT 
                BY ASSIGNING VALUES TO ITS INSTANCE VARIABLES 

TIPS: 
->ALWAYS USE CONSTRUCTOR 
->WHEN USING PRIVATE ATTIRBUTES, USE GETTER AND SETTER TO SET AND GET THE DATA
->

*/
                
public class student_info
{
    //INSTANCE VARIABLES
    private String name;
    private int age;
    private double grades;
    
    //PARAMETIZED CONSTRUCTOR 
    public student_info(String student_name, int student_age, double student_grades)
    {
        //this. - used to refer to the instance variable 
        this.name = student_name;
        this.age = student_age;
        this.grades = student_grades;
    }
    
    //GETTER METHODS TO ACCESS THE ATTRIBUTES
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public double getGrades()
    {
        return grades;
    }
       
    
            
}


public class Student_Information_System 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       
       //Array to store up to 20 student_info objects
       student_info[] students = new student_info[20];
       int studentCounter = 0;
       
       int choice;
       
       do
       {
           System.out.println("\nMenu:");
           System.out.println("1. Add a student");
           System.out.println("2. Display all students");
           System.out.println("3. Delete a student");
           System.out.println("4. Exit");
           System.out.print("Enter your choice: ");
       }
       
       
       
       
       
       
       
       
    }
}

































