/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 * Converts US units to European units
 * @author melissa-29
 */
public class UnitConverter {
    public static void main(String[] args) throws InterruptedException{
       System.out.println("How exciting! A trip from the United States to Europe!");
       System.out.println("They do things a bit differently across the pond,");
       System.out.println("so we've created the following technology to help you on your travels...");
       System.out.println("Answer the following questions, and we'll convert the units for you!");
       Scanner keyScanner = new Scanner(System.in);
       
       System.out.println();
       Thread.sleep(3000);
       // Q1: luggage weight
       System.out.println("How much does all of your luggage combined weigh in pounds?");
       double userLuggageWeight = keyScanner.nextDouble();
       double returnedLuggageWeight = calcMetricWeight(userLuggageWeight);
       System.out.println("The combined metric weight of your " + userLuggageWeight + " pound luggage is approximately " + returnedLuggageWeight + " kilograms");

       Thread.sleep(3000);
       System.out.println();
       //Q2: total budget
       System.out.println("What is your estimated total budget to spend on this trip in US Dollars?");
       double userBudget = keyScanner.nextDouble();
       double returnedBudget = calcTotalBudget(userBudget);
       System.out.println("Your total budget of " + userBudget + " US Dollars is equivalent to approximately " + returnedBudget + " Euros");
       System.out.println();

       Thread.sleep(3000);
       //Q3: money spent
       System.out.println("How much money did you spend on the hotel and flights in US Dollars?");
       double userSpent = keyScanner.nextDouble();
       double returnedSpent = calcTotalSpent(userSpent);
       System.out.println("Your total amount spent on flights and hotels of " + userSpent + " US Dollars is equivalent to approximately " + returnedSpent + " Euros");

       System.out.println();
       Thread.sleep(4000);
       //Q4: money remaining
       double returnedMoneyRemaining = calcMoneyRemaining(returnedBudget, returnedSpent);
       System.out.println("Based on what your inputted total budget for your trip is, and the amount you've already spent on the flights and hotels,");
       System.out.println("your total remaining amount of money is approximately " + returnedMoneyRemaining + " Euros");

       System.out.println();
       Thread.sleep(3000);
       //Q5: distance traveled
       System.out.println("What is the distance you plan on traveling during your trip in miles?");
       double userTravelDistance = keyScanner.nextDouble();
       double returnedDistance = calcTotalDistance(userTravelDistance);
       System.out.println("Wow, that's a ways away! Who knew traveling across the world would be that far?");
       System.out.println();
       System.out.println("Your total distance of " + userTravelDistance + " miles from where you are in the United States to where you're going");
       System.out.println("in Europe is equivalent to approximatetly " + returnedDistance + " kilometers");
       
       Thread.sleep(2000);
       System.out.println();
       System.out.println("We hope this will assist you on your travels, and have a wonderful trip!");
           
    }// close main

    
    public static double calcMetricWeight(double luggageWeight){
        System.out.println();
        System.out.println("Inputted combined total luggage weight in pounds: " + luggageWeight + "lbs");
        luggageWeight = luggageWeight * .453592;
        return luggageWeight;
    }// close calcMetricWeight
    
    public static double calcTotalBudget(double totalBudget){
        System.out.println();
        System.out.println("Inputted total budget in USD: $" + totalBudget);
        totalBudget = totalBudget * .83;
        return totalBudget;      
    }// clsoe calcTotalBudget    
    
    public static double calcTotalSpent(double totalSpent){
        System.out.println();
        System.out.println("Inputted total amount spent in USD: $" + totalSpent);
        totalSpent = totalSpent * .83;
        return totalSpent;
    }// close calcTotalSpent

    public static double calcMoneyRemaining(double b, double s){
        double moneyRemaining = b - s;
        return moneyRemaining;   
    }// close calcMoneyRemaining
    
    public static double calcTotalDistance(double totalDistance){
        System.out.println();
        System.out.println("Inputted total distance in miles: " + totalDistance);
        totalDistance = totalDistance * 1.609;
        return totalDistance;               
    }// close calcTotalDistance
    
    
}// close class
