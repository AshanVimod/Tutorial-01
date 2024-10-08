package main.java;
//01 01 01 01 01

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MiddleChar {
    public static void main(String[] args) {

        System.out.println("Enter the word");
        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter an odd number");
        String word= scanner1.nextLine(); //Next() is Reads only a single word (up to the first space).
        // but  nextline() Reads the entire line of input until the user presses the Enter key.

        if (word.length()%2 !=0){
            int middleCharacter= word.length()/2;
            System.out.println("The middle character is :" +word.charAt(middleCharacter));
        }else {
            System.out.println("The word does not have an odd length");
        }
        scanner1.close();
    }
}
