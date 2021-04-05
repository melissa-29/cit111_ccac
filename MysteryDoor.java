/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mweis
 */
public class MysteryDoor {
    public static void main(String[] args){
        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("----MORE OR SORE----");
        System.out.println("|---------|   |---------|   |--------|");
        System.out.println("|    1    |   |    2    |   |    3   |");
        System.out.println("|---------|   |---------|   |--------|");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ONE DOOR number you'd like to open-- 1, 2, or 3:");
        int door = scan.nextInt();
        
        
        switch(door){
            case 1:
                generateRandomNumber();
                break;
            case 2:
                answerTheQuestions(8, 99);
                break;
            case 3:
                soreDoor();
                break;
            default:
                System.out.println("That is not an option, game over!");
                break;
        }
        
        
    } // close main method
    
    public static void generateRandomNumber(){
        System.out.println("You chose Door #1");
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt();
        System.out.println("You get a lifetime supply of candy bars, totaling " + r + " chocolates, gummies, and more!");
    
    }// close generateRanomNumber;
    
    public static void answerTheQuestions(int emmys, int age){
        System.out.println("You chose Door #2");
        Scanner scan = new Scanner(System.in);
        int seeds = emmys * age;
        System.out.println("How many Emmy Awards has Betty White won in her lifetime? Enter a numerical value:");
        int answer1 = scan.nextInt();
        if(answer1 == 8){
            System.out.println("Correct! And how old is she? Enter a numerical value:");
        }else{
            System.out.println("Sorry, that's incorrect, but you can still guess the next question!");
        }
        System.out.println("And how old is she? Enter a numerical value:");
        int answer2 = scan.nextInt();
        if(answer2 == 99){
            System.out.println("That's correct too! Betty White has won 8 emmys in her lifetimte. Betty is also 99 years young,");
            System.out.println("so you will receive " + seeds + " seeds to plant and grow, including sunflowers, poppies, daisies, and more!");
        }else{
            System.out.println("Sorry, that's incorrect, you must be very sore :'(");
        }          
    }// close answerTheQuestions
    
    
    public static void soreDoor(){
        System.out.println("Oh no, you picked the sore door! You don't get any of the special More prizes, and instead you're surely sore.");
        System.out.println("But not to worry, you can still see what you could have won to make it that much worse!");
        System.out.println("See what you could have won from door #1...");
        generateRandomNumber();

    }// close soreDoor
    
} // close class
