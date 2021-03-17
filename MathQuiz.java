/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_loops;

import java.util.Scanner;

/**
 *
 * @author mweis
 */
public class MathQuiz {
    public static void main(String[] args){
        final double ANSWER_ONE = (52/13);
        final double ANSWER_TWO = ((32/(4*4)+5));
        final double ANSWER_THREE = 1;
        final double ANSWER_FOUR = (25 % 6)*289;
        final double ANSWER_FIVE = 102.01;
        
        int guesses = 0;
        final int MAX_GUESSES = 3;
        double userAnswer;
        Scanner answerScanner = new Scanner(System.in);
        
        System.out.println("Hello, and welcome to the MathMachine! Answer these 5 questions correctly and maybe I won't think humans are inferior afterall...");
        System.out.println("You'll have 3 chances to answer each question. Keep in mind, they get harder as you go!");
        System.out.println("Ok, you've got this! Ready, set, go!");
        System.out.println();
        System.out.println("***Question #1***");
        System.out.println("There are 52 students in Ms. Smith's class. If she bought 13 pizza boxes, how many students could share each pizza box evenly? (The answer should be written in numerical form)");
        userAnswer = answerScanner.nextDouble();
        while(userAnswer != ANSWER_ONE && guesses < MAX_GUESSES){
            System.out.println("Sorry, try again!");
            guesses = 1 + guesses;
            int guessesLeft = MAX_GUESSES - guesses;
            System.out.println("You have " + guessesLeft + " chance(s) remaining");
            userAnswer = answerScanner.nextDouble();
            if(guesses == MAX_GUESSES){
                System.out.println("Oh no, you're all out of guesses! Ms. Smith can give 13 pizza boxes to groups of 4 students each. Maybe you'll have better luck on the next question!");
            }else if(userAnswer == ANSWER_ONE && guesses <= MAX_GUESSES){
                System.out.println("You saved yourself!");
            }
        }if(userAnswer == ANSWER_ONE){   
            System.out.println("Ok, that was an easy one. Let's move on to Question #2!");
        }
        
        System.out.println();
        System.out.println("...");
        System.out.println("...");
        System.out.println();
        System.out.println("***Question #2***");
        System.out.println("Using Order of Operations, what is 32 divided by 4 squared plus 5?");
        guesses = 0;
        userAnswer = answerScanner.nextDouble();
        while(userAnswer != ANSWER_TWO && guesses < MAX_GUESSES){
            System.out.println("Sorry, try again!");
            guesses = 1 + guesses;
            int guessesLeft = MAX_GUESSES - guesses;
            System.out.println("You have " + guessesLeft + " chance(s) remaining");
            userAnswer = answerScanner.nextDouble();
            if(guesses == MAX_GUESSES){
                System.out.println("Oh no, you're all out of guesses! How could you forget Please excuse my dear aunt sally? She was my favorite aunt! Anywho, the answer was -3: ((32/(4^2 = 16)= 2) + 5 = 7.");
            }else if(userAnswer == ANSWER_TWO && guesses <= MAX_GUESSES){
                System.out.println("You saved yourself!");
            }
        }if(userAnswer == ANSWER_TWO){
            System.out.println("Nice work! You clearly remembered to excuse your dear aunt Sally! Here comes Question #3, this may get a bit harder!");
        }
        
        System.out.println();
        System.out.println("...");
        System.out.println("...");
        System.out.println();
        System.out.println("***Question #3***");
        System.out.println("What is 46872 to the zero power?");
        guesses = 0;
        userAnswer = answerScanner.nextDouble();
        while(userAnswer != ANSWER_THREE && guesses < MAX_GUESSES){
            System.out.println("Sorry, try agian!");
            guesses = 1 + guesses;
            int guessesLeft = MAX_GUESSES - guesses;
            System.out.println("You have " + guessesLeft + " chance(s) remaining");
            userAnswer = answerScanner.nextDouble();
            if(guesses == MAX_GUESSES){
                System.out.println("Oh no, you're all out of guesses! Anything to the zero power is 1.");
            }else if(userAnswer == ANSWER_THREE && guesses <= MAX_GUESSES){
                System.out.println("Answered correctly in the nick of time!");
            }
        }if(userAnswer== ANSWER_THREE){
            System.out.println("Congrats, that was a tough one! Now on to Question #4, this one may stump you!");
        }
        
      System.out.println("...");
      System.out.println("...");
      System.out.println();
      System.out.println("***Question #4***");
      System.out.println("When 25 is divided by 6, what is the remainder, multiplied by 289?");
      guesses = 0;
      userAnswer = answerScanner.nextDouble();
      while(userAnswer != ANSWER_FOUR && guesses < MAX_GUESSES){
          System.out.println("Sorry, try again!");
          guesses = 1 + guesses;
          int guessesLeft = MAX_GUESSES - guesses;
          System.out.println("You have " + guessesLeft + " chance(s) remaining");
          userAnswer = answerScanner.nextDouble();
          if(guesses == MAX_GUESSES){
              System.out.println("Oh no, you're all out of guesses! When 25 is divided by 6, the remainder is 1, and that multiplied by 289 is just 289! Ok, one more question that'll really test you!");  
          }else if(userAnswer > ANSWER_FOUR){
              System.out.println("Woops, a bit too high there! Try a lower number...");
          }else if(userAnswer < ANSWER_FOUR){
              System.out.println("A little low, try a higher number...");
          }else if(userAnswer == ANSWER_FOUR && guesses <= MAX_GUESSES){
              System.out.println("Phew that was a close one, I wasn't sure if you'd make it, but you guessed correctly!");
          }
      }if(userAnswer == ANSWER_FOUR){
          System.out.println("Wow, impressive! The final question is coming up, let's see if you have what it takes!");
      }
          

      System.out.println();
      System.out.println("...");
      System.out.println("...");
      System.out.println("***Question 5***");
      System.out.println("Melissa has deposited a check for $100 into a savings account that is accumulating 1% interest each month. If Melissa takes out her savings including the interest earned, how much does Melissa have after 2 months?");
      guesses = 0;
      userAnswer = answerScanner.nextDouble();
      while(userAnswer != ANSWER_FIVE && guesses < MAX_GUESSES){
            System.out.println("Sorry, try again!");
            guesses = 1 + guesses;
            int guessesLeft = MAX_GUESSES - guesses;
            System.out.println("You have " + guessesLeft + " chance(s) remaining");
            userAnswer = answerScanner.nextDouble();
            if(guesses == MAX_GUESSES){
                System.out.println("Oh no, you're all out of guesses! This was certainly a tricky one. After 2 years, Melissa will have $102.01");
            }else if(userAnswer == ANSWER_FIVE && guesses <= MAX_GUESSES){
                System.out.println("Awesome job! You're done with my Math Machine.");
            }
      }if(userAnswer == ANSWER_FIVE){
          System.out.println("I have to say, I'm very impressed, that was a really hard question! Congratuations, you've made it through my Math Machine! Until next time...");
      }
    }
}
