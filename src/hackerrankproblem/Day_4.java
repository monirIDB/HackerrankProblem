/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblem;

/**
 *
 * @author Monir
 */
import java.io.*;
import java.util.*;

public class Day_4 {

    private int age;

    public Day_4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");

        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age <= 18) {
            System.out.println("You are a teenager.");
            
        } else {
            System.out.println("You are old.");
        }
        
    }
   
    public void yearPasses() {
        // Increment this person's age.
        age += 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("Enter age first time");
            int age = sc.nextInt();
            Day_4 p = new Day_4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
