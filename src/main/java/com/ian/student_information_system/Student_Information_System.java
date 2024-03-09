
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
                
class student_info
{
    //INSTANCE VARIABLES
    private String name;
    private int age;
    private double grades;
    
    //PARAMETIZED CONSTRUCTOR -> used to set the private attributes
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
       
       //Array to store up to 20 student_info object
       student_info[] students = new student_info[20];
       
       int studentCounter = 0;  //Counter for the student
       
       
       int choice;  //This variable will contain what the user will be choosing
       
       do
       {
           System.out.println("\nMenu:");
           System.out.println("1. Add a student");
           System.out.println("2. Display all students");
           System.out.println("3. Delete a student");
           System.out.println("4. Exit");
           System.out.print("Enter your choice: ");
           
           choice = scanner.nextInt();
           
           switch(choice)
           {
               case 1:
                   if(studentCounter < 20)
                   {
                       System.out.println("Enter student name: ");
                       String name = scanner.nextLine();
                       System.out.println("Enter student age: ");
                       int age = scanner.nextInt();
                       System.out.println("Enter student grades: ");
                       double grades = scanner.nextDouble();
                       
                       //after the user input all the data 
                       //new student_info(name, age, grades) -> creating new instance(object) of the student info class
                       //"new" -> keyword used to allocate memory for the new object
                       //when the student_info is created the constructor is also called, 
                       //responsible for handling the data to the private attributes
                       students[studentCounter] = new student_info(name, age, grades);
                       studentCounter++;
                       
                       System.out.println("Student added successfully!");                   
                   }
                   else 
                   {
                       System.out.println("Maximum number of students has reached!");
                   }
                   break;
                   
                   
               case 2:
               {
                   if(studentCounter > 0)
                   {
                       System.out.println("\nStudent Records: ");
                       
                       for(int i = 0; i < studentCounter; i++)
                       {
                           System.out.println("Student " + (i + 1) + ": " );
                           System.out.println("Name: " + students[i].getName());
                           System.out.println("Age: " + students[i].getAge());
                           System.out.println("Grades: " + students[i].getGrades());
                           System.out.println("--------------------");
                       }
                   }
                   else 
                   {
                       System.out.println("Empty student records!");
                   }
               }
               break;
                   
         
                   
                   
           }
       } while(choice != 4);
       
       scanner.close();
       
       
       
       
       
       
    }
}

































