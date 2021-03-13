/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21_chunk1_friendsproject;

import java.util.Scanner;

/**
 *
 * @author melissa-29
 */
public class MightWeBeFriends {
    public static void main(String[] args ){
        
        ///****QUESTION 1****
        
        int userResponse = 0;
        int compatibilityScore = 0;
        
        Scanner inputScanner = new Scanner(System.in);        
        
        System.out.println("Might we be friends? Answer the following questions to see if we're compatible!");
        
        System.out.println("Question 1: Do you like to hike? Type 1 for yes, type 0");
        userResponse = inputScanner.nextInt();
        if(userResponse == 1){
            compatibilityScore = compatibilityScore + 20;
            System.out.println("Awesome, me too! I'd love to go to all of the National Parks someday.");
        }else if(userResponse == 0){
            compatibilityScore = compatibilityScore + 5;
            System.out.println("No? That's too bad, I hope we'll find something else in common!");
        }else{
            System.out.println("Not a recognized option");
        }
        
        // ****QUESTION 2****
        System.out.println("Question 2: What about TV shows, do you like binge-watching them on lazy Sundays? Type 1 for yes, 0 for no");
        userResponse = inputScanner.nextInt();
        if(userResponse == 1){
            compatibilityScore = compatibilityScore + 20;
            //****QUESTION 2A****
            System.out.println("Who doesn't love doing that?? Bonus question: if you had to choose to watch WandaVision or Love Is Blind, which would you pick? Type 1 for WandaVision and 0 for Love is Blind");
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                compatibilityScore = compatibilityScore + 10;
                System.out.println("Thank goodness!");
            }else{
                compatibilityScore = compatibilityScore + 1;
                System.out.println("Well, to each their own I guess?...");
            }
        }else if(userResponse == 0){
            compatibilityScore = compatibilityScore + 5;
            System.out.println("I'm not sure I believe you... If you're telling the truth, you're missing out! Nothing like a good Super Hero show on a rainy Sunday!");
        }else{
            System.out.println("Not a recognized option");
        }

        //****QUESTION 3****
        System.out.println("Question 3: Speaking of Super Heros, how many Super Hero movies--Marvel and DC--have you seen?");
        userResponse = inputScanner.nextInt();
        if(userResponse == 0){
            compatibilityScore = compatibilityScore + 5;
            System.out.println("None? Well some are definitely better than others...");
        }else if(userResponse >= 1 && userResponse <= 4){
            compatibilityScore = compatibilityScore + 10;
            System.out.println("Not bad!");
        }else if(userResponse > 4 && userResponse <=100){
            compatibilityScore = compatibilityScore + 20;
            System.out.println("Wow, that's impressive!");
        }else{
            System.out.println("Not a recognized option");
        } 
        
        System.out.println("Compatibility Score: " + compatibilityScore);
        if(compatibilityScore <= 11){
            System.out.println("Yikes, we don't have much in common, I guess we can't be friends.");
        }else if(compatibilityScore == 46 || compatibilityScore == 51 || compatibilityScore == 61){
            System.out.println("Ok, we can be friends, although I'll pretend you put Love Is Blind in by mistake...");
        }else{
            System.out.println("You've got great taste in hobbies! We can definitely be friends!");
        }
        
    } // close main
    
}// close class
