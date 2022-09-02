package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<Student> myList = new LinkedList<Student>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select options \n1 - Add\n2 - Remove\n3 - Display");

        int option = scan.nextInt();

        if(option == 1){
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
        }else if(option == 2){
            System.out.println("Enter a name?");
            String stname = scan.next();

            System.out.println("Enter the address?");
            String address = scan.next();

            Student student = new Student(stname,address,1,1,1);
            remove(student);
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

    public static void remove(Student name){

        myList.remove(name);
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
