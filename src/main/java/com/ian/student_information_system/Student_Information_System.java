
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
    private final String name;
    private final int age;
    private final double grades;
    
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
       int choice;              //This variable will contain what the user will be choosing
       
       do
       {
           System.out.println("\nMenu:");
           System.out.println("1. Add a student");
           System.out.println("2. Display all students");
           System.out.println("3. Delete a student");
           System.out.println("4. Exit");
           System.out.print("Enter your choice: ");
           
           choice = scanner.nextInt();
           scanner.nextLine();
           
           switch(choice)
           {
               //this case is about adding student information to the students array
               case 1:
               {
                   if(studentCounter < 20)
                   {
                       System.out.print("Enter student name: ");
                       String name = scanner.nextLine();
                       System.out.print("Enter student age: ");
                       int age = scanner.nextInt();
                       System.out.print("Enter student grades: ");
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
               } break;
                     
               
               //this case is about viewing student records 
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
               } break;
               
               
               //this case is about deleting the data from the array
               case 3:
               {
                   //check if there is data by checking the student counter
                   if(studentCounter > 0)
                   {
                       //if yes then proceed on deleting 
                       System.out.println("Enter student number to delete 1 - " + studentCounter + "): ");
                       int deleteIndex = scanner.nextInt();
                       
                       if(deleteIndex >= 1 && deleteIndex <= studentCounter)
                       {
                           for(int i = deleteIndex - 1; i < studentCounter; i++)
                           {
                               students[i] = students[i + 1];
                           }
                           students[studentCounter - 1] = null;
                           studentCounter--;
                           
                           System.out.println("Students record deleted successfully!");
                       }
                       else 
                       {
                           System.out.println("Invalid number...");
                       }
                   }
                   else 
                   {
                       System.out.println("No students record");
                   }
               } break;
               
               case 4:
               {
                   System.out.println("Closing the program");
               } break;
               
               
               default:
               {
                   System.out.println("Invalid choice, Please enter a valid option");
               } break;       
                   
           }
       } while(choice != 4);
       
       scanner.close();
       
    }
}

































