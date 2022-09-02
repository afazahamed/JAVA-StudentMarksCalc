/*
Enter student personal Details and Marks to find total and store in LinkedList

Linked list has been used
Inheritance has been used - Student extends Marks
  - Can store students who are having 3 Marks & 2 Marks
Polymorphism used - Student / Marks constructors overloaded
TryCatch used - Remove (When try to remove Linked list data when it's empty)
 */

package com.company;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static LinkedList<Student> myList = new LinkedList<Student>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select options \n1 - Add\n2 - Remove\n3 - Display");

        int option = scan.nextInt();

        if(option == 1){
            System.out.println("1 - 3 Marks\n2 - 2 Marks");
            int option2 = scan.nextInt();
            if(option2 == 1){
                System.out.println("Enter a name?");
                String stname = scan.next();

                System.out.println("Enter the address?");
                String address = scan.next();

                System.out.println("Enter Marks 1?");
                int marks1 = scan.nextInt();

                System.out.println("Enter Marks 2?");
                int marks2 = scan.nextInt();

                System.out.println("Enter Marks 3?");
                int marks3 = scan.nextInt();

                Student student = new Student(stname,address,marks1,marks2,marks3);

                add(student);
                main(null);
            }else if(option2 == 2){
                System.out.println("Enter a name?");
                String stname = scan.next();

                System.out.println("Enter the address?");
                String address = scan.next();

                System.out.println("Enter Marks 1?");
                int marks1 = scan.nextInt();

                System.out.println("Enter Marks 2?");
                int marks2 = scan.nextInt();

                Student student = new Student(stname,address,marks1,marks2);

                add(student);
                main(null);
            }
        }else if(option == 2){
            remove();
            main(null);
        }else if(option == 3){
            display();
            main(null);
        }else {
            main(null);
        }
    }

    public static void add(Student name){

        myList.add(name);
    }

    public static void remove(){

        try {
            myList.removeLast();
            System.out.println("Last record has been deleted!");
        }catch(NoSuchElementException e){
            System.out.println("No records found to delete!");
        }
    }

    public static void display(){
        System.out.println("List of students\n**************");
        for(Student temp : myList){
            System.out.print(temp.getStname()+" ");
            System.out.print(temp.getAddress());
            System.out.println(" Total :  "+temp.total());
        }
        System.out.println();
    }
}
